/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejEstCondicionales;

/**
 *
 * @author Usuario
 */
public class U4Ej8_C {

    public static void main(String args[]) {
        char departamento = 'B';

        switch (departamento) {
            case 'A':
                System.out.println("Desarrollo");
                break;
            case 'B':
                System.out.println("Recursos Humanos");
                break;
            case 'C':
                System.out.println("Finanzas");
                break;
            case 'D':
                System.out.println("RRHH");
            default:
                System.out.println("Departamento no válido");
        }
        System.out.println("Código para el departamento es " + departamento);
    }

}
