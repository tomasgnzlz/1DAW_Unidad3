/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author tomas ARITMETIC NUMBERFORMAT INPUTMISMATCH
 */
/*
En la opción 1,  juego de dos jugadores, se debe preguntar el nombre a cada uno. 



Aleatoriamente comenzará uno de los jugadores indicando si saca piedra, papel o tijera. 
Estos datos se piden usando Scanner y no se permite otro dato que no sea uno de
esos tres, ignorando mayúsculas y minúsculas (pidra, papel, tijera). 



Supuestamente el otro jugador no "sabe" lo que ha elegido. 
Seguidamente el otro jugador elige entre una de las tres opciones y una vez los dos jugadores tienen su elección, 
entonces el juego informa por consola de la elección de cada uno y también debe indicar quien gana la ronda. 
La partida la gana el mejor de 5 rondas. El programa informará con el nombre del ganador de la partida. 
Ten en cuenta que el número de rondas puede ser susceptible de cambiar.*/
public class PiedraPapelTijeras {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int opcionModoJuego = 0; //
        int dado = 0;

        String opcionesDeJuego = """
                               1.- Juego de dos jugadores
                               2.- Juego de un jugador contra la máquina
                               3.- Salir
                               """;
        boolean repetir = true;
        // Filtro y controlo la excepción de la opción de juego.
        do {
            try {
                opcionModoJuego = Integer.parseInt(JOptionPane.showInputDialog(opcionesDeJuego));
                repetir = false;
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "ERROR");
            }

        } while (repetir || (opcionModoJuego < 1 || opcionModoJuego > 4));

        switch (opcionModoJuego) {
            case 1 -> {
                System.out.println(" ");
                System.out.println("JUEGO DE DOS JUGADORES");
                String jugador1 = JOptionPane.showInputDialog("¿Nombre jugador 1?");
                String jugador2 = JOptionPane.showInputDialog("¿Nombre jugador 2?");
                dado = random.nextInt(3);
                dado = 1;
                //El dado decide quien empieza
                String sacaJugador1 = "", sacaJugador2 = "";
                repetir = true; // Actualizo la variable
                if (dado == 1) {
                    System.out.println("Empieza el jugador1");
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
                    System.out.println("¿Vas a sacar piedra papel o,tijera?");

                } else {
                    System.out.println("Empieza el jugador2");
                }
            }
            default ->
                throw new AssertionError();
        }

    }
}
