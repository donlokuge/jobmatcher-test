package com.swipejobs.findjob.objects.worker;


import java.io.Serializable;

public class Name implements Serializable {

    private String last;
    private String first;

    private final static long serialVersionUID = -3527944667379326637L;

    public Name() {
    }


    public Name(String last, String first) {
        super();
        this.last = last;
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }


}