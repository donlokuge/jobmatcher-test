package com.swipejobs.findjob.Service;

import com.swipejobs.findjob.objects.job.Job;
import com.swipejobs.findjob.util.SwipeJobsConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JobService implements IJobService {

    private Logger logger = LoggerFactory.getLogger(JobService.class);

    @Autowired
    private SwipeJobsConnection swipeJobsConnection;

    @Override
    public List<Job> getJobs() {
        try {
            return swipeJobsConnection.getJobs();
        } catch (Exception e) {
            logger.warn("Failed to load jobs",e);
        }
        return null;
    }
}
