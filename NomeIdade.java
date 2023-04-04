
import java.util.Scanner;

/*Faça um programa que leia conjuntos de 2 valores,
 * o primeiro representando o nome do aluno e o 
 * segundo representando a sua idade. 
 * Pare o programa inserindo o valor 0 no campo nome.*/


public class NomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //guardar a informação passada pelo usuário
        // importar classe
        int nome;
        int idade;

        while(true) {
            System.out.println("Nome: ");
            nome = scan.next(); //método next retorna uma string
            if (nome.equals("0")) break;
           
            System.out.println("Idade: ");
            nome = scan.nextInt();  

        }

        
    }
}