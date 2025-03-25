package com.unimelb.swen30006.workshops;

import java.util.Date;

public abstract class Person {
    private String address;
    private Date dob;
    private String name;

    public Person(String address, Date dob, String name){
        this.name = name;
        this.address = address;
        this.dob = dob;
    }
}
