/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author tomas
 */
public class U4Ej3_R {

    //3.- Realizar un programa que imprima 25 términos de la serie 15 - 30 - 60 - 120, etc. No se introducen valores por teclado.
    public static void main(String[] args) {
        int num = 15;
        for (int i = 1; i < 26; i++) {
            System.out.println(i + ":" + num);
            num += num;
        }
    }

}
