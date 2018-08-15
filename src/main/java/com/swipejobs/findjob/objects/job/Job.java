package com.swipejobs.findjob.objects.job;

import com.swipejobs.findjob.objects.Location;

import java.io.Serializable;
import java.util.List;

public class Job implements Serializable {

    private boolean driverLicenseRequired;
    private List<String> requiredCertificates = null;
    private Location location;
    private String billRate;
    private long workersRequired;
    private String startDate;
    private String about;
    private String jobTitle;
    private String company;
    private String guid;
    private long jobId;

    private final static long serialVersionUID = 3931513585122388236L;


    public Job() {
    }

    public Job(boolean driverLicenseRequired, List<String> requiredCertificates, Location location, String billRate, long workersRequired, String startDate, String about, String jobTitle, String company, String guid, long jobId) {
        super();
        this.driverLicenseRequired = driverLicenseRequired;
        this.requiredCertificates = requiredCertificates;
        this.location = location;
        this.billRate = billRate;
        this.workersRequired = workersRequired;
        this.startDate = startDate;
        this.about = about;
        this.jobTitle = jobTitle;
        this.company = company;
        this.guid = guid;
        this.jobId = jobId;
    }

    public boolean isDriverLicenseRequired() {
        return driverLicenseRequired;
    }

    public void setDriverLicenseRequired(boolean driverLicenseRequired) {
        this.driverLicenseRequired = driverLicenseRequired;
    }

    public List<String> getRequiredCertificates() {
        return requiredCertificates;
    }

    public void setRequiredCertificates(List<String> requiredCertificates) {
        this.requiredCertificates = requiredCertificates;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getBillRate() {
        return billRate;
    }

    public void setBillRate(String billRate) {
        this.billRate = billRate;
    }

    public long getWorkersRequired() {
        return workersRequired;
    }

    public void setWorkersRequired(long workersRequired) {
        this.workersRequired = workersRequired;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public long getJobId() {
        return jobId;
    }

    public void setJobId(long jobId) {
        this.jobId = jobId;
    }


}