package com.swipejobs.findjob.objects.worker;


import java.io.Serializable;
import java.util.List;

public class Worker implements Serializable {

    private long rating;
    private boolean isActive;
    private List<String> certificates = null;
    private List<String> skills = null;
    private JobSearchAddress jobSearchAddress;
    private String transportation;
    private boolean hasDriversLicense;
    private List<Availability> availability = null;
    private String phone;
    private String email;
    private Name name;
    private long age;
    private String guid;
    private long userId;

    private final static long serialVersionUID = -4855385284115130567L;

    public Worker() {
    }


    public Worker(long rating, boolean isActive, List<String> certificates, List<String> skills, JobSearchAddress jobSearchAddress, String transportation, boolean hasDriversLicense, List<Availability> availability, String phone, String email, Name name, long age, String guid, long userId) {
        super();
        this.rating = rating;
        this.isActive = isActive;
        this.certificates = certificates;
        this.skills = skills;
        this.jobSearchAddress = jobSearchAddress;
        this.transportation = transportation;
        this.hasDriversLicense = hasDriversLicense;
        this.availability = availability;
        this.phone = phone;
        this.email = email;
        this.name = name;
        this.age = age;
        this.guid = guid;
        this.userId = userId;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public List<String> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<String> certificates) {
        this.certificates = certificates;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public JobSearchAddress getJobSearchAddress() {
        return jobSearchAddress;
    }

    public void setJobSearchAddress(JobSearchAddress jobSearchAddress) {
        this.jobSearchAddress = jobSearchAddress;
    }

    public String getTransportation() {
        return transportation;
    }

    public void setTransportation(String transportation) {
        this.transportation = transportation;
    }

    public boolean isHasDriversLicense() {
        return hasDriversLicense;
    }

    public void setHasDriversLicense(boolean hasDriversLicense) {
        this.hasDriversLicense = hasDriversLicense;
    }

    public List<Availability> getAvailability() {
        return availability;
    }

    public void setAvailability(List<Availability> availability) {
        this.availability = availability;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

}