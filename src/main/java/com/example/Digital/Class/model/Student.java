package com.example.Digital.Class.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ggiStudent {
    @Id
    @GeneratedValue
    private int id;

    private String FirstName;
    private String Lastname;
    private int BirthDay;
    private String Course;

    public Student() {}

    public Student(String FirstName,String LastName,int Birthday,String Course ){
        this.FirstName= FirstName;
        this.Lastname=LastName;
        this.BirthDay=BirthDay;
        this.Course=Course;

    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return FirstName;
    }
    public void setFirstName(String firstName){
        this.FirstName= firstName;
    }

    public String getLastName() {
        return Lastname;
    }
    public void setLastName(String lastName) {
        this.Lastname = lastName;
    }

    public int getBirthDay() { return BirthDay; }
    public void setBirthDay(int BirthDay) {this.BirthDay= BirthDay;}





}

