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
public class Verificacao_Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int num1, num2, num3;
        
        System.out.println("Digite um número inteiro: ");
        num1 = entrada.nextInt();
        
        System.out.println("Digite mais um número inteiro: ");
        num2 = entrada.nextInt();
        
        System.out.println("Digite mais um número inteiro: ");
        num3 = entrada.nextInt();
        
        if(num1 > num2 || num1 > num3){
            System.out.println("O maior número é: "+num1);
        }
        else if(num2>num1 || num2>num3){
        System.out.println("O maior número é: "+num2);
    }
        else {
            System.out.println("O maior número é: "+num3);
        }
        
        if(num1 > 0){
            System.out.println("O primeiro é positivo");
        }else{
            System.out.println("O primeiro é negativo");
        }
        if(num2 > 0){
            System.out.println("O segundo é positivo");
        }else{
            System.out.println("O segundo é negativo");
        }
        if(num3 > 0){
            System.out.println("O terceiro é positivo");
        }else{
            System.out.println("O segundo é negativo");
        }
        
        
    }
    
}
