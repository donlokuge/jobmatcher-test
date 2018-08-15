package com.swipejobs.findjob.Service;

import com.swipejobs.findjob.objects.job.Job;
import com.swipejobs.findjob.objects.worker.Worker;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IMatchService {

    List<Job> getMatchingJobs(Worker worker, List<Job> jobs);
}
