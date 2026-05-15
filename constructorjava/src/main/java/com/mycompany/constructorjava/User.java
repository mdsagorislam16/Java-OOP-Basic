/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.constructorjava;

/**
 *
 * @author USER
 */
public class User {
    String name;
    String email;
    int number;
    User(String name,String email,int number){
        this.name=name;
        this.email=email;
        this.number=number;
    }
    void display() {
        System.out.println("Name   : " + name);
        System.out.println("Email  : " + email);
        System.out.println("Number : " + number);
        System.out.println();
    }
}
