package com.swipejobs.findjob.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.swipejobs.findjob.objects.job.Job;
import com.swipejobs.findjob.objects.worker.Worker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.List;


@Component
public class SwipeJobsConnection {
    private Logger logger = LoggerFactory.getLogger(SwipeJobsConnection.class);

    @Autowired
    private SwipeJobs swipeJobs;


    private String readUrl(String urlString) throws Exception {
        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);

            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuffer buffer = new StringBuffer();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1)
                buffer.append(chars, 0, read);

            return buffer.toString();
        } finally {
            if (reader != null)
                reader.close();
        }
    }


    public List<Worker> getWorkers() {
        try {
            String url = swipeJobs.getApi() + swipeJobs.getWorkers();

            String workersJson = readUrl(url);
            Gson gson = new Gson();
            Type listType = new TypeToken<List<Worker>>() {
            }.getType();
            return gson.fromJson(workersJson, listType);
        } catch (Exception e) {
            logger.warn("Failed to load workers", e);
        }
        return null;
    }

    public List<Job> getJobs() {
        try {
            String url = swipeJobs.getApi() + swipeJobs.getJobs();

            String workersJson = readUrl(url);
            Gson gson = new Gson();
            Type listType = new TypeToken<List<Job>>() {
            }.getType();
            return gson.fromJson(workersJson, listType);
        } catch (Exception e) {
            logger.warn("Failed to load jobs", e);
        }
        return null;
    }


}
