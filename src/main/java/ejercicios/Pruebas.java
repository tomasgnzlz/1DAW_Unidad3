/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Pruebas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Empieza el jugador1");
        String sacaJugador1="";
        boolean repetir = true;
                    do {
                        System.out.println("¿Jugador 1, Que vas a sacar piedra papel o,tijera?");
                        try {
                            sacaJugador1 = teclado.nextLine();
                            repetir = false;
                        } catch (InputMismatchException ime) {
                            System.out.println("ERROR");

                        }

                    } while (repetir || !(sacaJugador1.equalsIgnoreCase("Piedra")
                            || sacaJugador1.equalsIgnoreCase("Papel")
                            || sacaJugador1.equalsIgnoreCase("tijeras")));
    }
    
}
