package com.swipejobs.findjob.service;

import com.swipejobs.findjob.Service.IJobService;
import com.swipejobs.findjob.objects.job.Job;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JobServiceTest {

    @Autowired
    private IJobService jobService;


    @Test
    public void getJobs_test() {
        List<Job> jobList = jobService.getJobs();
        Assert.assertNotNull(jobList);
        Assert.assertTrue(jobList.isEmpty() == false);

    }
}
