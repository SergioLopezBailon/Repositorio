/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author diurno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        Calculadora c1= new Calculadora(); 
        int a = sc.nextInt();
        
        sc.nextLine();
        int b = sc.nextInt();
        sc.nextLine();
        c1.sumar(a,b);
        
    }
    
}
