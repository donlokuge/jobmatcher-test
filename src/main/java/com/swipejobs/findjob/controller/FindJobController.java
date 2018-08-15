package com.swipejobs.findjob.controller;

import com.swipejobs.findjob.Service.IJobService;
import com.swipejobs.findjob.Service.IMatchService;
import com.swipejobs.findjob.Service.IWorkerService;
import com.swipejobs.findjob.excption.WorkerNotFoundException;
import com.swipejobs.findjob.objects.job.Job;
import com.swipejobs.findjob.objects.worker.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FindJobController {

    @Autowired
    private IWorkerService workerService;

    @Autowired
    private IJobService jobService;

    @Autowired
    private IMatchService matchService;

    @GetMapping("/api/match/{workerId}")
    public List<Job> getMatchingJob(@PathVariable long workerId) {
        Worker worker = workerService.findById(workerId);
        if (worker == null) throw new WorkerNotFoundException("id-" + workerId);
        return matchService.getMatchingJobs(worker,jobService.getJobs());
    }


}
