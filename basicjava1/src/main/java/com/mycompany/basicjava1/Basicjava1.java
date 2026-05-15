/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.basicjava1;

/**
 *
 * @author USER
 */
public class Basicjava1 {

    public static void main(String[] args) {
         Student s1 = new Student();
        s1.input("Sagor", 1045, 67, "A", "CSE", 3.70);

        Student s2 = new Student();
        s2.input("Sagor", 1023, 67, "A", "CSE", 3.87);

        Student s3 = new Student();
        s3.input("Choyon", 1033, 67, "A", "CSE", 3.76);

        Student s4 = new Student();
        s4.input("Fardeen", 1049, 67, "A", "CSE", 3.83);

        Student s5 = new Student();
        s5.input("Rimon", 1058, 67, "A", "CSE", 3.70);

        Student s6 = new Student();
        s6.input("Saurov", 1073, 67, "A", "CSE", 3.70);

        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();
        s6.display();
    }
}
