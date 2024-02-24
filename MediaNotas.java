package sintaxe.java;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Quiqu
 */
public class MediaNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int med=0;
        
        System.out.println("Digite o número de alunos da turma: ");
        int numAlunos = entrada.nextInt();
        
        int vet[] = new int[numAlunos];
        
        for(int i=0;i<numAlunos;i++){
            System.out.println("Digite a nota do aluno: "+(i+1));
            int nota = entrada.nextInt();
            
            med = med + nota;
        }
        
        int medFim = med / numAlunos;
        System.out.println("A média é: "+medFim);
    }
}
