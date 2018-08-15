package com.swipejobs.findjob.Service;

import com.swipejobs.findjob.objects.worker.Worker;
import com.swipejobs.findjob.util.SwipeJobsConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WorkerService implements IWorkerService{
    private Logger logger = LoggerFactory.getLogger(WorkerService.class);

    @Autowired
    private SwipeJobsConnection swipeJobsConnection;


    @Override
    public Worker findById(long id) {
        try {
            List<Worker> workers = swipeJobsConnection.getWorkers();

            return workers.stream().filter(x -> x.getUserId() == id)
                    .findFirst().orElse(null);
        } catch (Exception e) {
            logger.warn(e.getMessage());
        }
        return null;

    }
}
