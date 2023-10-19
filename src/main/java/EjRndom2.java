
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tomas
 */
public class EjRndom2 {
    /*
    Una persona compra un coche por un precio X y lo va a pagar en N meses. 
    Realiza el cuadro de pagos suponiendo que cada mes paga la mitad de lo que 
    quede por pagar, excepto el último mes del préstamo que paga el resto que quede.
    */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el precio del primer coche");
        double precio = teclado.nextDouble();
        System.out.println("¿En cuantos meses lo vas a pagar?");
        int mesesApagar = teclado.nextInt();
        teclado.nextLine();
        double mitadPagar = precio/2;
        for (int i = 0; i < mesesApagar; i++) {
            if (i == 11) {
                mitadPagar= mitadPagar*2;
            }
            System.out.printf("El Mes %d pagas %.2f € \n",(i+1),mitadPagar);
            mitadPagar/=2;
            
        }
        
        
        
        
        
        
    }
    
}
