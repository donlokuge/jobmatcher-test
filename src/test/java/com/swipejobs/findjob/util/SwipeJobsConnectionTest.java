package com.swipejobs.findjob.util;

import com.swipejobs.findjob.objects.job.Job;
import com.swipejobs.findjob.objects.worker.Worker;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SwipeJobsConnectionTest {

    @Autowired
    SwipeJobsConnection swipeJobsConnection;

    @Test
    public void getWorkers() {
        List<Worker> workerList = swipeJobsConnection.getWorkers();
        Assert.assertNotNull(workerList);
        Assert.assertTrue(workerList.size() > 0);
    }

    @Test
    public void getJobs(){
        List<Job> jobList = swipeJobsConnection.getJobs();
        Assert.assertNotNull(jobList);
        Assert.assertTrue(jobList.size() > 0);
    }

}
