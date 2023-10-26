/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author tomas
 *
 */
/*
Una cadena de tiendas de autoservicio cuenta con sucursales en C ciudades del país, 
en cada ciudad cuenta con T tiendas y cada tienda tiene E empleados. 

Cada día una tienda pregunta lo que vende cada empleado de manera individual, 
para saber cuánto vendió la tienda en total, cuánto se vendió en la ciudad y el total
recaudado por la cadena de tiendas en el país. 

Realiza el programa para introducir en un día lo que vendió cada empleado de cada 
tienda de cada ciudad y saber las ventas de cada tienda, de cada ciudad y del total en el país
 */
public class EjExamenn {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numCiudades = 2, numTiendas = 2, numEmpleados = 2;
        double dineroRecaudadoEmpleados = 0.0, recaudoTiendas = 0.0, recaudoCiudades = 0.0, recaudoTotal = 0.0;
        //
        //
        for (int i = 0; i < numCiudades; i++) {
            System.out.println("\n********Ciudad " + (i + 1) + "********");
            // 
            //

            for (int j = 0; j < numTiendas; j++) {
                //
                //

                for (int k = 0; k < numEmpleados; k++) {
                    System.out.println("¿Cuanto vendió Empleado " + (k + 1) + " de Tienda " + (j + 1) + " de Ciudad" + (i + 1) + "?");
                    dineroRecaudadoEmpleados = teclado.nextDouble();
                    dineroRecaudadoEmpleados += dineroRecaudadoEmpleados;
                    //
                    //
                }
                recaudoTiendas = dineroRecaudadoEmpleados;
                System.out.println("En la tienda " + (j + 1) + " se ha recaudado: " + recaudoTiendas + "€\n");
                recaudoTiendas += recaudoTiendas;
            }
            recaudoCiudades = recaudoTiendas;
            System.out.println("Ciudad " + (i + 1) + " :" + recaudoCiudades);
            recaudoCiudades += recaudoCiudades;
        }
        recaudoTotal = recaudoCiudades;
        System.out.println("PAIS: " + recaudoTotal);

    }

}
