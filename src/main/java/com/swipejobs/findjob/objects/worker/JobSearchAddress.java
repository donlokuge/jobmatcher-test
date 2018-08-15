package com.swipejobs.findjob.objects.worker;


import com.swipejobs.findjob.objects.Location;

import java.io.Serializable;

public class JobSearchAddress implements Serializable {

    private String unit;
    private long maxJobDistance;
    private double longitude;
    private double latitude;

    private final static long serialVersionUID = 3822109691170633419L;

    public JobSearchAddress() {
    }


    public JobSearchAddress(String unit, long maxJobDistance, double longitude, double latitude) {
        super();
        this.unit = unit;
        this.maxJobDistance = maxJobDistance;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public long getMaxJobDistance() {
        return maxJobDistance;
    }

    public void setMaxJobDistance(long maxJobDistance) {
        this.maxJobDistance = maxJobDistance;
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

    public Location getLocation() {
        Location location = new Location();
        location.setLatitude(this.latitude);
        location.setLongitude(this.longitude);
        return location;
    }


}