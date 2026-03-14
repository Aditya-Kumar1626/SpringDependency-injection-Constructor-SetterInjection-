package com.example.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.model.StudentAnno;

public class AnnotationMain {

    public static void main(String[] args){

        ApplicationContext context =
        new AnnotationConfigApplicationContext(Config.class);

        StudentAnno s=context.getBean(StudentAnno.class);

        s.display();

    }

}