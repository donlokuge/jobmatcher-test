package com.swipejobs.findjob.service;


import com.swipejobs.findjob.Service.IWorkerService;
import com.swipejobs.findjob.objects.worker.Worker;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WorkerServiceTest {


    @Autowired
    private IWorkerService workerService;

    @Test
    public void findById_test() {

        Worker worker = workerService.findById(1);
        Assert.assertNotNull(worker);

    }
}
