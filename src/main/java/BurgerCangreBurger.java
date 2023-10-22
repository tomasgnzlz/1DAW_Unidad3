
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
public class BurgerCangreBurger {

    /*
    En BurgerCrangeBurger están de promoción durante el fin de semana. 
    A cada cliente que se acerque a la caja a pagar su pedido de comida basura 
    le van a descontar unos euros para que pueda dedicarse a ir al dentista. 
    
    Cada vez que un cliente se acerca a la caja, este debe tirar un dado. 
    
    Si la tirada es par, le descuentan un 25% del total del pedido y si la tirada
    es impar, entonces debe sacar una bolita de color de un saco. 
    
        Si la bolita es blanca, no hay descuento,
        si es roja le quitan un 12% 
        y si es amarilla un 5%.
    
    Solicita al cliente que va a pagar el importe del pedido y muestra el descuento,
    la tirada del dado y el color de la bolita, si es que tuvo que sacarla. 
    
    
    Se debe preguntar si hay más clientes, para proceder de igual forma.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Random para generar el dado para indicar si se descuenta o saca bola. 
        Random random = new Random();
        int numRandom = random.nextInt(7);
        String opcion = " ", resultado = " ";
        double cantidadPagar, total;
        final double NO_DESCUENTO = 0.25, DESCUENTO1 = 0, DESCUENTO2 = 0.12, DESCUENTO3 = 0.05;

        do {
            System.out.println("\nIntroduzca su importe a pagar\n");
            cantidadPagar = teclado.nextDouble();
            teclado.nextLine();

            if (numRandom % 2 == 0) {
                System.out.println("\nSe le descuenta del total un 25% al cliente.\n");
                
                total = cantidadPagar -(cantidadPagar*NO_DESCUENTO);
                //total = cantidadPagar * (1 - DESCUENTO3);

                
                resultado = """
                                    *************BURGERCANGREBURGER*************
                                    A PAGAR: %.2f€
                                    DESCUENTO: %.2f%%
                                    TOTAL: %.2f€
                                    """.formatted(cantidadPagar, NO_DESCUENTO, total);
                System.out.println(resultado);

            } else {
                //Como el nº es impar se saca bola.
                System.out.println("""
                               Se sacará una bola de la bolsa
                               · Si la bolita es blanca, no hay descuento.
                               · Si es roja le quitan un 12%.
                               · Si es amarilla un 5%.
                               """);
                // 1 es blanco | 2 es rojo | 3 es amarillo
                int numeroRandom2 = random.nextInt(4);

                switch (numeroRandom2) {
                    case 1 -> {
                        System.out.println("\nHa salido la bola blanca, no hay descuento\n");
                        total = cantidadPagar;
                        resultado = """
                        *************BURGERCANGREBURGER*************
                        A PAGAR: %.2f€
                        DESCUENTO: %.2f%%
                        TOTAL: %.2f€
                        """.formatted(cantidadPagar, DESCUENTO1, total);
                        System.out.println(resultado);
                    }
                    case 2 -> {
                        System.out.println("\nHa salido la bola roja. 12% Descuento\n");
                        total = cantidadPagar -(cantidadPagar*DESCUENTO2);
                        resultado = """
                        *************BURGERCANGREBURGER*************
                        A PAGAR: %.2f€
                        DESCUENTO: %.2f%%
                        TOTAL: %.2f€
                        """.formatted(cantidadPagar, DESCUENTO2, total);
                        System.out.println(resultado);
                    }
                    case 3 -> {
                        System.out.println("\nHa salido la bola amarilla. 5% Descuento\n");
                        total = cantidadPagar -(cantidadPagar*DESCUENTO3);
                        resultado = """
                        *************BURGERCANGREBURGER*************
                        A PAGAR: %.2f€
                        DESCUENTO: %.2f%%
                        TOTAL: %.2f€
                        """.formatted(cantidadPagar, DESCUENTO3, total);
                        System.out.println(resultado);
                    }

                }

            }

            System.out.println("\n¿Hay otro cliente en la cola?");
            opcion = teclado.nextLine();
        } while (opcion.equalsIgnoreCase("Si"));

//        
    }

}
