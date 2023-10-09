/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class EjClaseSwitch {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String menu = """
                        A - Par o Impar.
                        B - Meses Válidos.  
                        C - HorasMinutosSegundos
                        """;
        System.out.println(menu);
        String opcion = teclado.nextLine();

        switch (menu) {
            case "A", "a":
                System.out.println("Introduce un numero entero");
                int num = teclado.nextInt();
                String resultado = (num % 2 == 0) ? "PAR" : "IMPAR";
                break;

            //    
            case "B", "b":

                System.out.print("Introduce un número del mes: ");
                int numMes = teclado.nextInt();

                switch (numMes) {
                    case 1 ->
                        System.out.println("Enero");
                    case 2 ->
                        System.out.println("Febrero");
                    case 3 ->
                        System.out.println("Marzo");
                    case 4 ->
                        System.out.println("Abril");
                    case 5 ->
                        System.out.println("Mayo");
                    case 6 ->
                        System.out.println("Junio");
                    case 7 ->
                        System.out.println("Julio");
                    case 8 ->
                        System.out.println("Agosto");
                    case 9 ->
                        System.out.println("Septiembre");
                    case 10 ->
                        System.out.println("Octubre");
                    case 11 ->
                        System.out.println("Noviembre");
                    case 12 ->
                        System.out.println("Diciembre");
                    default ->
                        System.out.println("Mes no válido");
                }

                break;

            //
            case "C", "c":
                System.out.println("Introduce 3 valores");
                System.out.print("Num1:");
                int num1 = teclado.nextInt();
                System.out.print("Num2:");
                int num2 = teclado.nextInt();
                System.out.print("Num3:");
                int num3 = teclado.nextInt();

                if ((num1 >= 1 && num1 <= 24) && (num2 >= 1 && num2 <= 60)
                        && (num3 >= 1 && num3 <= 60)) {
                    System.out.println("Hora correcta");
                    System.out.printf("%d : %d : %d", num1,
                            num2, num3);
                } else {
                    System.out.println("Hora incorrecta");
                }
                break;
            default:
                System.out.println("EEE");
        }
    }
}
