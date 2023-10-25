/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class Margarita {

    public static void main(String[] args) {
        // Declaración de variables. 
        int numMargaritas, dadoRandom;

        // Pregunto el número de margaritas. 
        numMargaritas = numeroMargaritas();
        dadoRandom = dado();
        numHojasMargaritas(numMargaritas, dadoRandom);

    }

    public static int numeroMargaritas() {
        Scanner teclado = new Scanner(System.in);
        int numeroMargaritas = 0;
        System.out.println("¿Cuantás margaritas tienes(1-10)?");
        numeroMargaritas = teclado.nextInt();
        System.out.println("Número margaritas: " + numeroMargaritas);
        return numeroMargaritas;
    }

    public static void numHojasMargaritas(int numMargaritas, int dado) {
        Scanner teclado = new Scanner(System.in);

        // Pregunto cuantas hojas tiene la margarita numero1,2,3,4,...
        int numeroHojas;
        for (int i = 0; i < numMargaritas; i++) {
            System.out.println("¿Cuantas hojas tiene la margarita Nº: " + (i + 1) + " ?");
            numeroHojas = teclado.nextInt();
            // Dependiendo de la tirada del dado empieza por una opción o por la otra. 
            if (dado % 2 == 0) {
                System.out.println("La tirada fue: " + dado + " y empieza con 'Me Quiere'");

                // Muestro el resultado, es decir, si lo quiere o si no lo quiere
                if (numeroHojas % 2 == 0) {
                    System.out.println("El resultado final es no: No Me Quiere");
                } else {
                    System.out.println("El resultado final es: Me Quiere ");
                }

            } else {
                System.out.println("La tirada fue: " + dado + " y empieza con 'No Me Quiere'");

                // Muestro el resultado, es decir, si lo quiere o si no lo quiere
                if (numeroHojas % 2 == 0) {
                    System.out.println("El resultado final es no: No Me Quiere");
                } else {
                    System.out.println("El resultado final es: Me Quiere ");
                }
            }

        }

    }

    public static int dado() {
        Random random = new Random();
        int dado = 0;
        do {
            dado = random.nextInt(7);
            if (dado == 3) {
                System.out.println("HA SALIDO 3. Se repetirá la tirada");
            }
        } while (dado == 3);
        return dado;
    }

}
