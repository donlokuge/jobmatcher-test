package com.swipejobs.findjob.excption;

import java.util.Date;

public class SwipeJobsExceptionResponse {

    private Date timestamp;
    private String message;
    private String details;


    public SwipeJobsExceptionResponse() {
    }

    public SwipeJobsExceptionResponse(Date timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }


}
