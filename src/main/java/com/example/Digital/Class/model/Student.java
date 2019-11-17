package com.example.Digital.Class.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Student {
    @Id
    @GeneratedValue
    private int id;
    private String FirstName;
    private String lastName;
    private int birthDay;
    private String course;
    private String email;
    private String password;
    private String address;


    public Student() {}

    public Student(String FirstName,String lastname,int birthDay,String course,String address,String password,String email ){
        this.FirstName= FirstName;
        this.lastName=lastname;
        this.birthDay=birthDay;
        this.course=course;
        this.address=address;
        this.email=email;
        this.password=password;


        public String getFirstName (){
            return FirstName;
        }
        public void setFirstName(String FirstName){
            this.FirstName= FirstName;
        }
        public String getPassword() {
            return password;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getLastName() {
            return lastName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getBirthDay() {
            return birthDay;
        }

        public void setBirthDay(int birthDay) {
            this.birthDay = birthDay;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getCourse() {
            return course;
        }

        public void setCourse(String course) {
            this.course = course;
        }


    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

