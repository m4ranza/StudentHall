
package com.mycompany.student_halls;


public class Student {
    
    private String id;
    private String name;
    private String surname;
    private String gender;
    private String address;
    private String dob;
    
 

    public Student(String id, String name, String surname,String gender, String address, String dob) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.address = address;
        this.dob = dob;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    
}
