package daw;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author tomas
 */
public class EjPassword {

    /*
    Un banco establece una contraeña secreta para acceso a sus cajeros. 
    Debe tener cuatro dígitos numéricos (entre 0 y 9) de forma que ninguno se repita 
    y la suma de los digitos intermedios sea par. El programa debe solicitar al usuario tantos pin como sean necesarios hasta encontrar uno válido.
     */
    public static void main(String[] args) {
        Scanner tecl = new Scanner(System.in);
        boolean valido = true;

        do {

            System.out.println("Introduce tu código de 4 digitos");
            int num1 = tecl.nextInt();
            int num2 = tecl.nextInt();
            int num3 = tecl.nextInt();
            int num4 = tecl.nextInt();

            if (num1 == num2) {
                System.out.println("PIN ERRONEO");
                valido = false;
            } else if (num1 == num3) {
                System.out.println("PIN ERRONEO");
                valido = false;
            } else if (num1 == num4) {
                System.out.println("PIN ERRONEO");
                valido = false;
            } else if (num2 == num3) {
                System.out.println("PIN ERRONEO");
                valido = false;
            } else if (num2 == num4) {
                System.out.println("PIN ERRONEO");
                valido = false;
            } else if (num3 == num4) {
                System.out.println("PIN ERRONEO");
                valido = false;
            } else {
                valido = true;
            }
            
            
//            if (num1 == num2 || num1 == num3 || num1 == num4 || num2 == num3 || num2 == num4 || num3 == num4 ) {
//                System.out.println("ERROR,Pin no Valido");
//            }

            int suma = num2 + num3;

            if (suma % 2 == 0 && valido == true) {
                System.out.println("PIN VALIDO");
                valido = true;
            } else {
                valido = false;
            }

        } while (!valido);

    }

}
