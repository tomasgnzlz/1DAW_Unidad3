/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author tomas
 */
public class U4Ej3_C {

    public static void main(String[] args) {
        boolean unaCondicion = true;

        String resultado = unaCondicion ? "valor1" : "valor2"; // Sale true
        int x = 10;
        int y = (x > 9) ? 100 : 200; // x=10 & y=100

        int publico = 19500;
        int vendidas = 19000;
        int aforo = 2000;
        String status = (publico < aforo) ? "Cabe mas gente" : (vendidas < aforo) ? "Aun no hemos vendido todo" : "Esta todo vendido"; // Sale aun no hemos vendido todo.

    }
}
