/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejEstRepeticion;

/**
 *
 * @author tomas
 */
public class U4Ej13_R {

    // 12.- Modifica el programa del ejercicio 10 para que se vea el código numérico (número entero) de cada una de las letras.
    public static void main(String[] args) {
        char letra = 'a';

        do {
            int valorNumerico = (int) letra; // Convierte el carácter en un valor numérico
            System.out.println(letra + " - " + valorNumerico);
            letra++;
        } while (letra <= 'z');
    }

}
