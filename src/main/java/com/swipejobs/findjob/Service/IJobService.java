package com.swipejobs.findjob.Service;

import com.swipejobs.findjob.objects.job.Job;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IJobService {

    List<Job> getJobs();

}
