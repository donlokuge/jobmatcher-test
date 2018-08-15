package com.swipejobs.findjob.objects.worker;

import java.io.Serializable;

public class Availability implements Serializable {

    private String title;
    private long dayIndex;

    private final static long serialVersionUID = 4379861849629550073L;


    public Availability() {
    }

    public Availability(String title, long dayIndex) {
        super();
        this.title = title;
        this.dayIndex = dayIndex;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getDayIndex() {
        return dayIndex;
    }

    public void setDayIndex(long dayIndex) {
        this.dayIndex = dayIndex;
    }


}