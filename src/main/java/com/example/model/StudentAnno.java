package com.example.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class StudentAnno {

    @Value("32529")
    private int studentId;

    @Value("Aditya")
    private String name;

    private String course;
    private int year;

    public StudentAnno(@Value("CSE") String course,
                       @Value("2") int year){

        this.course=course;
        this.year=year;

    }

    public void display(){

        System.out.println("Student ID: "+studentId);
        System.out.println("Name: "+name);
        System.out.println("Course: "+course);
        System.out.println("Year: "+year);

    }

}