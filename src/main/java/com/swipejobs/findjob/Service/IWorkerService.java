package com.swipejobs.findjob.Service;

import com.swipejobs.findjob.objects.worker.Worker;
import org.springframework.stereotype.Component;

@Component
public interface IWorkerService {
    Worker findById(long id);
}
