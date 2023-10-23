/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class EjAceitunerosTomas {

    public static void main(String[] args) {
        //Declaro el objeto Scanner
        Scanner teclado = new Scanner(System.in);
        // Declaro unas variables y constantes
        final String NOMBRE_EMPRESA = "La asociación de olivareros de Málaga";
        final double PRECIO_INICIAL = 2.43;
        final double VEINTE = 0.20, TREINTA = 0.30, QUINCE = 0.15, CINCO = 0.05;
        final double AC_PICUAL_GRUESA = PRECIO_INICIAL + VEINTE;
        final double AC_PICUAL_FINA = PRECIO_INICIAL + TREINTA;
        final double AC_ALORENIA_GRUESA = PRECIO_INICIAL - QUINCE;
        final double AC_ALORENIA_FINA = PRECIO_INICIAL - TREINTA;
        final double AC_HOJIBLANCA_GRUESA = PRECIO_INICIAL + QUINCE;
        final double AC_HOJIBLANCA_FINA = PRECIO_INICIAL - CINCO;
        int tipoAceitunaNombre = 0;
        int tipoAceitunaTamanio = 0;
        double kilos = 0;
        double totalGanancias = 0;
        String opcion = ""; // para filtar la opción del usuario. 
        do {

            System.out.println("*************************************************");
            System.out.println(NOMBRE_EMPRESA);
            System.out.println("*************************************************");
            do {                
                try {
                    System.out.println("Seleccione el tipo de Aceituna");
                    System.out.print("1.Picual \n2. Alorenia \n3. HojiBlanca\n");
                    tipoAceitunaNombre = teclado.nextInt();// Guardo la opción del usuario. 
                } catch (InputMismatchException nfe) {
                    System.out.println("Introduce correctamente las opciones(1-2-3)");
                } catch (NumberFormatException nfe) {
                    System.out.println("Introduce solo numeros y no letras");
                }
            } while (tipoAceitunaNombre ==1 || tipoAceitunaNombre ==2 || tipoAceitunaNombre ==3 );

            //Creo un switch para que se haga una cosa u otra dependiendo de la opcion.
            switch (tipoAceitunaNombre) {
                case 1 -> {
                    System.out.print("Aceitunas Picual\n 1. Fina \n 2. Gruesa\n");
                    tipoAceitunaTamanio = teclado.nextInt();
                    System.out.println("Introduce la cantidad(Kg)");
                    kilos = teclado.nextDouble();
                    // para filtrar el tamanio de la aceituna.
                    if (tipoAceitunaTamanio == 1) {
                        totalGanancias = kilos * AC_PICUAL_FINA;
                        String resultado = """
                                                           El Total es --> %.2f €
                                                           """.formatted(totalGanancias);
                        System.out.println(resultado);
                    } else {
                        totalGanancias = kilos * AC_PICUAL_GRUESA;
                        String resultado = """
                                                           El Total es --> %.2f €
                                                           """.formatted(totalGanancias);
                        System.out.println(resultado);
                    }
                }
                case 2 -> {
                    System.out.print("Aceitunas Alorenia\n 1. Fina \n 2. Gruesa\n");
                    tipoAceitunaTamanio = teclado.nextInt();
                    System.out.println("Introduce la cantidad(Kg)");
                    kilos = teclado.nextDouble();
                    if (tipoAceitunaTamanio == 1) {
                        totalGanancias = kilos * AC_ALORENIA_FINA;
                        String resultado = """
                                                           El Total es --> %.2f €
                                                           """.formatted(totalGanancias);
                        System.out.println(resultado);
                    } else {
                        totalGanancias = kilos * AC_ALORENIA_GRUESA;
                        String resultado = """
                                                           El Total es --> %.2f €
                                                           """.formatted(totalGanancias);
                        System.out.println(resultado);
                    }
                }
                case 3 -> {
                    System.out.print("Aceitunas HojiBlanca\n 1. Fina \n 2. Gruesa\n");
                    tipoAceitunaTamanio = teclado.nextInt();
                    System.out.println("Introduce la cantidad(Kg)");
                    kilos = teclado.nextDouble();
                    if (tipoAceitunaTamanio == 1) {
                        totalGanancias = kilos * AC_HOJIBLANCA_FINA;
                        String resultado = """
                                                           El Total es --> %.2f €
                                                           """.formatted(totalGanancias);
                        System.out.println(resultado);
                    } else {
                        totalGanancias = kilos * AC_HOJIBLANCA_GRUESA;
                        String resultado = """
                                                           El Total es --> %.2f €
                                                           """.formatted(totalGanancias);
                        System.out.println(resultado);
                    }
                }
            }

            //
            //
            teclado.nextLine();
            System.out.println("¿Hay otro anciano con aceitunas?");
            opcion = teclado.nextLine();
        } while (opcion.equalsIgnoreCase("Si"));

    }
}
