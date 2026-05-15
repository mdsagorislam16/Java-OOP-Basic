/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.thisjava;
/**
 *
 * @author USER
 */
public class Thisjava {
    public static void main(String[] args) {
        Player p1 = new Player();
        p1.Input("Cristiano Ronaldo", 7, "Portugal", 920);
        Player p2 = new Player();
        p2.Input("Lionel Messi", 10, "Argentina", 850);
        Player p3 = new Player();
        p3.Input("Neymar Jr", 10, "Brazil", 450);
        Player p4 = new Player();
        p4.Input("Kylian Mbappe", 7, "France", 320);
        Player p5 = new Player();
        p5.Input("Erling Haaland", 9, "Norway", 280);
        Player p6 = new Player();
        p6.Input("Kevin De Bruyne", 17, "Belgium", 150);
        Player p7 = new Player();
        p7.Input("Luka Modric", 10, "Croatia", 130);
        Player p8 = new Player();
        p8.Input("Mohamed Salah", 11, "Egypt", 310);
        Player p9 = new Player();
        p9.Input("Robert Lewandowski", 9, "Poland", 640);
        Player p10 = new Player();
        p10.Input("Vinicius Junior", 7, "Brazil", 120);

        p1.Display();
        p2.Display();
        p3.Display();
        p4.Display();
        p5.Display();
        p6.Display();
        p7.Display();
        p8.Display();
        p9.Display();
        p10.Display();
    }
}
