package com.unimelb.swen30006.workshops;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Staff extends Person{
    private String[] role;
    private String staffId;

    private ArrayList<Subject> subjects;

    public Staff(String address, Date dob, String name, String[] role, String staffId) {
        super(address, dob, name);
        this.role = role;
        this.staffId = staffId;
    }

    public void addSubject(Subject sub){
        this.subjects.add(sub);
    }

    public boolean teach(Subject sub){return subjects.stream().anyMatch(c -> sub == c);}
}
