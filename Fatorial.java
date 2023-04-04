import java.util.Scanner;

//Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário
public class Fatorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 

        System.out.println("Digite o número a ser fatorado: ");
        int fatorado = scan.nextInt();
        
        int multiplicacao = 1;

        System.out.print(fatorado + "!= ");
        for (int i = fatorado; i >= 1; i --){
            multiplicacao = multiplicacao * i;
        }
        System.out.println(multiplicacao);
    
    }

}