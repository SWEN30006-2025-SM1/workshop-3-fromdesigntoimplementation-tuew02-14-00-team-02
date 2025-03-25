package com.unimelb.swen30006.workshops;

public class Student {
    public String studentId;
    public String email;

    public void sendEmailMsg(String studentid, String email) {

        this.email = email;
        this.studentId = studentId;
    }

    public float totalGrade(){
        return 0;
    }
}
