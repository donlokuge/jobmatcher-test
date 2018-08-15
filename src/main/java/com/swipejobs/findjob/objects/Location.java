package com.swipejobs.findjob.objects;

import java.io.Serializable;


public class Location implements Serializable {

    private double longitude;
    private double latitude;

    private final static long serialVersionUID = -9222230999826627215L;

    public Location() {
    }

    public Location(double longitude, double latitude) {
        super();
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }


}