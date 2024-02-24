/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintaxe.java;

import java.util.Scanner;

/**
 *
 * @author Quiqu
 */
public class TabuadaInterativa {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int i = 1, resp;
        
        System.out.println("Digite um número inteiro: ");
        int num = entrada.nextInt();
        
        while(i<=10){
            resp = num*i;
            System.out.println(num+"*"+i+"="+resp);
            i++;
        }
        
    }
    
}
