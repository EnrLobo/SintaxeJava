/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enriquelobo;

import java.util.Scanner;

/**
 *
 * @author 10414032675
 */
public class VerificacaoIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();
        
        
        
        if(idade>=18){
            System.out.println("Você é maior de idade.");
        }
        else{
            System.out.println("Você é menor de idade");
        }
        
    }
    
}
