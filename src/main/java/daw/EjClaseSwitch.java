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

//    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//        String opcion = """
//                        A - Par o Impar.
//                        B - Meses Válidos.
//                        C - HorasMinutosSegundos
//                        """;
//
//        switch (opcion) {
//            case "A", "a":
//                        System.out.println("Introduce un numero entero");
//                        int num = teclado.nextInt();
//                        String resultado = (num%2==0)? "PAR" :"IMPAR";
//                break;
//
//                
//            //    
//            case "B", "b":
//
//                break;
//                
//                
//            //
//            case "C","c":
//                System.out.println("Introduce 3 numeros");
//                String numeros = teclado.nextLine();
//                int num1 = numeros.charAt(1);
//                int num2 = numeros.charAt(2);
//                int num3 = numeros.charAt(3);
//                System.out.printf("%d horas, %d minutos, %d segundos",num1,num2,num3);//¿¿?¿?¿?¿??¿??
//                
//                break;
//            default:
//                throw new AssertionError("EEE");    
//        }
//    }
    public static void main(String[] args) {
        System.out.println("Introduce 3 numeros");
        Scanner teclado = new Scanner(System.in);
                String numeros = teclado.nextLine();
                int num1 = numeros.charAt(1);
                int num2 = numeros.charAt(2);
                int num3 = numeros.charAt(3);
                System.out.printf("%d horas, %d minutos, %d segundos",num1,num2,num3);//¿¿?¿?¿?¿??¿??
    }
}

