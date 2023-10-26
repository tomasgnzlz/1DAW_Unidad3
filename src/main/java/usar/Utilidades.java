/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usar;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author tomas
 */
public class Utilidades {

    public static void main(String[] args) {

    }

    public static void menuJOption() {
        // Ejemplo con JOption
        Scanner teclado = new Scanner(System.in);
        String opcionesMenu = """
                               1.- opcion1
                               2.- opcion2
                               3.- Salir
                               """;
        boolean repetir = true;
        int opcion = 0;

        // Filtro y controlo la excepción de la opción de juego.
        do {

            do {

                try {
                    opcion = Integer.parseInt(JOptionPane.showInputDialog(opcionesMenu));
                    repetir = false;
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "ERROR");
                }
            } while (repetir || (opcion < 1 || opcion > 4));

            // Aqui pongo el switch con el codigo correspondiente a lo que tenga que realizar en cada momento. 
        } while (opcion != 3);

    }

    public static void menuScanner() {
        Scanner teclado = new Scanner(System.in);
        String opcionesMenu = """
                               1.- opcion1
                               2.- opcion2
                               3.- Salir
                               """;
        boolean repetir = true;
        int opcion = 0;

        // Filtro y controlo la excepción de la opción de juego.
        do {
            System.out.println(opcionesMenu);
            try {
                opcion = teclado.nextInt();
                repetir = false;
            } catch (InputMismatchException ime) {
                System.out.println("ERROR");
                teclado.nextLine();
            }
        } while (repetir || (opcion < 1 || opcion > 4));
        System.out.println("HOLA");
    }

    public static void textBlock() {
        String texto = "HOLA";
        int num = 1;
        double numero = 2.5;
        float numfloat = 3.5F;
        boolean verdaderoFalso = true;

        String resultado = """
                            Para los textos:             %s
                            Para los enteros:            %d
                            Para los Float y Double:     %.2f 
                            Para los booleanos:          %b
                           """.formatted(texto, num, numero, verdaderoFalso);
        System.out.println(resultado);
    }

    public static void tiposPrints() {
        System.out.println("println se ve x cada linea");
        System.out.print("se ve en la misma linea");
        System.out.print(" &&&& se ve en la misma linea");
        System.out.println(" ");
        System.out.printf("Se ve con el Formato"
                + "que queramos"
                + "nosotros");

        // OPERADOR TERNARIO
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

    }

}
