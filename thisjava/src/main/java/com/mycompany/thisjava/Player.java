/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thisjava;
/**
 *
 * @author USER
 */
public class Player {
    String name;
    int number;
    String team;
    int goal;

    void Input(String name, int number, String team, int goal) {
        this.name=name;
        this.number=number;
        this.team=team;
        this.goal=goal;
    }
    void Display(){
        System.out.println("Name "+name);
        System.out.println("jersey Number "+number);
        System.out.println("Team Name "+team);
        System.out.println("Total Goal "+goal);
        System.out.println();
    }
}
