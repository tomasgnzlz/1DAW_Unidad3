package random;


import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author tomas
 */
/*Adivinia adivinanza. Vamos a jugar a acertar un número pensado por la máquina entre 100 y 200. 
        Hay 4 intentos para adiviniarlo. Si se acierta, mostrar mensaje informando, 
        en caso contrario se debe ayudar al jugador indicando si el número pensado es
        mayor o menor al que ha puesto. Una vez finalizada la partida, se debe preguntar si quiere jugar otra vez.*/
public class EjRandom1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        String opcion = "";

        /////////int numeroAleatorio = random.nextInt(100, 201);
        int numeroAleatorio = 5;
        int intentos;
        boolean adivinado = false;

        do {
            System.out.println("Introduce el numero de intentos que quieres que tenga");
            int cantidadIntentos = teclado.nextInt();
            System.out.println("Adivina el numero entre 100 y 200 (includos). 4 intentos");
            for (int i = 1; i < cantidadIntentos + 1; i++) {
                System.out.println("Intento Nº: " + i);
                intentos = teclado.nextInt();
                teclado.nextLine();//Limpio el buffer

                if (intentos == numeroAleatorio) {
                    adivinado = true;
                    break;
                } else if (intentos < numeroAleatorio && i <= 3) {
                    System.out.println("El número es mayor.");
                } else if (intentos < numeroAleatorio && i <= 3) {
                    System.out.println("El número es menor.");
                }
                adivinado = false;
            }

            String resultado = (adivinado == true) ? "Felicidades has acertado" : "El numero a adivinar era: " + numeroAleatorio;
            System.out.println(resultado);

            System.out.println("¿Quieres seguir?");
            opcion = teclado.nextLine();

        } while (opcion.equalsIgnoreCase("Si"));
    }
}
