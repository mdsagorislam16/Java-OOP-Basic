/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basicjava1;

/**
 *
 * @author USER
 */
public class Student {

    String s;
    int id;
    int batch;
    String group;
    String dep;
    double cgpa;

    void input(String a, int b, int c, String d, String e, double f) {
        s=a;
        id=b;
        batch=c;
        group=d;
        dep=e;
        cgpa=f;
    }
    void display(){
        System.out.println("Name "+s);
        System.out.println("Id "+id);
        System.out.println("Batch "+batch);
        System.out.println("Group "+group);
        System.out.println("Department "+dep);
        System.out.println("CGPA "+cgpa);
        System.out.println();
    }
}
