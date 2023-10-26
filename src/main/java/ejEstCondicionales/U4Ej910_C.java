/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejEstCondicionales;

/**
 *
 * @author tomas
 */
public class U4Ej910_C {

    public static void main(String[] args) {
        int variable = 3, variable2;
        switch (variable) {

            case 1:
                variable2 = 5;
                break;
            case 2:
                variable2 = 20;
                break;
            case 3:
                variable2 = 30;
                //break --> 10
            case 4:
                variable2 = 10;
            default:
                variable2 = 100;
                break;

        }

    }
}
