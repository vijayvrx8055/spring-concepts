package com.vrx.spring.orm.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "LAPTOP")
public class Laptop {
    @Id
    @Column(name = "laptop_id")
    private int laptopId;
    private String modelNumber;
    private String band;

    @OneToOne
    @JoinColumn(name = "student_id")
    //changes the joining column name to student_id
    private Student student;

    public Laptop() {
    }

    public Laptop(int laptopId, String modelNumber, String band, Student student) {
        this.laptopId = laptopId;
        this.modelNumber = modelNumber;
        this.band = band;
        this.student = student;
    }

    public int getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
