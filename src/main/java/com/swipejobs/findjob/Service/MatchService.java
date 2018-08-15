package com.swipejobs.findjob.Service;

import com.swipejobs.findjob.objects.Location;
import com.swipejobs.findjob.objects.ThreeItemList;
import com.swipejobs.findjob.objects.job.Job;
import com.swipejobs.findjob.objects.worker.JobSearchAddress;
import com.swipejobs.findjob.objects.worker.Worker;
import com.swipejobs.findjob.util.DistanceCalculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class MatchService implements IMatchService {
    private Logger logger = LoggerFactory.getLogger(MatchService.class);

    @Autowired
    private DistanceCalculator distanceCalculator;

    @Override
    public List<Job> getMatchingJobs(Worker worker, List<Job> jobs) {
        List<Job> matchingJobs = new ArrayList<>();
        if (worker == null) return matchingJobs;
        if (jobs == null || jobs.isEmpty()) return matchingJobs;


        List<Job> jobsWithWorkersRequired = getJobsWithWorkersRequired(jobs);
        List<Job> jobsWithinDistance = getJobsWithinDistance(jobsWithWorkersRequired, worker.getJobSearchAddress());

        return getJobsWithMatchingWorkerDetails(jobsWithinDistance, worker);
    }

    private List<Job> getJobsWithMatchingWorkerDetails(List<Job> jobs, Worker worker) {
        if (worker == null) return new ArrayList<>();
        if (jobs == null || jobs.isEmpty()) return new ArrayList<>();

        return jobs.stream().filter(job -> {
            List<String> skills = worker.getSkills();
            List<String> certificates = worker.getCertificates();

            String jobTitle = job.getJobTitle();
            List<String> requiredCertificates = job.getRequiredCertificates();

            if (checkDriverPassLicenseRequirement(job, worker) == false) {
                return false;
            }

            boolean match = matchStringWithStringList(jobTitle, skills);
            match = matchStringWithStringList(jobTitle, certificates) || match;

            match = matchListWithList(certificates, requiredCertificates) || match;
            match = matchListWithList(skills, requiredCertificates) || match;

            return match;
        }).collect(Collectors.toCollection(ThreeItemList::new));
    }

    private boolean matchListWithList(List<String> itemsToMatch, List<String> items) {
        if (itemsToMatch == null || itemsToMatch.isEmpty()) return false;
        boolean match = false;
        for (String item : itemsToMatch) {
            match = matchStringWithStringList(item, items) || match;
        }
        return match;

    }


    private boolean matchStringWithStringList(String word, List<String> items) {
        if (word == null) return false;
        if (items == null || items.isEmpty()) return false;

        boolean match = false;
        for (String item : items) {
            match = word.equals(item) || match;
        }
        return match;
    }


    private boolean checkDriverPassLicenseRequirement(Job job, Worker worker) {
        if(job.isDriverLicenseRequired() == false) return true;
        return job.isDriverLicenseRequired() && worker.isHasDriversLicense();
    }


    private List<Job> getJobsWithWorkersRequired(List<Job> jobs) {
        if (jobs == null || jobs.isEmpty()) return new ArrayList<>();
        return jobs.stream().filter(job -> job.getWorkersRequired() > 1).collect(Collectors.toList());
    }


    private List<Job> getJobsWithinDistance(List<Job> jobs, JobSearchAddress jobSearchAddress) {
        List<Job> matchingJobs = new ArrayList<>();
        if (jobs == null || jobs.isEmpty()) return matchingJobs;

        return jobs.stream().filter(job -> {
            Location location = job.getLocation();
            Location userLocation = jobSearchAddress.getLocation();
            long maxJobDistance = jobSearchAddress.getMaxJobDistance();
            double distanceToJob = Math.floor(distanceCalculator.getDistanceInKm(location, userLocation));
            return distanceToJob <= maxJobDistance;
        }).collect(Collectors.toList());

    }
}
