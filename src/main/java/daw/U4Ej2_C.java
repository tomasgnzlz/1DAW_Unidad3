/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Scanner;

/**
 *
 * @author tomas 2.- Utilizando el operador ternario ?: de Java, implementa las
 * siguientes sentencias: Si el número “x” es mayor o igual que 135 se devolverá
 * “mayor”, si es menor se devolverá “menor”. Las cadenas que se devuelven se
 * guardarán en una variable llamada resultado. Si el número “x” es menor o
 * igual que cero se imprimirá en pantalla “Menor que cero”, si no se imprimirá
 * “Mayor que cero”. Guardar el valor absoluto de un número entero en una
 * variable entera (sin usar la función Math.abs())
 *
 */
public class U4Ej2_C {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numX = teclado.nextInt();
        String resultado = "";
        
        //A
        resultado = (numX >= 135) ? "Mayor" : "Menor";

        //B
        resultado = (numX <= 0) ? "Menor" : "Mayor";

        //C
        int valorAbsoluto;

        if (numX < 0) {
            valorAbsoluto = -numX;
        } else {
            valorAbsoluto = numX;
        }
        System.out.println("ValorAbsoluto: "+ valorAbsoluto);

    }

}
