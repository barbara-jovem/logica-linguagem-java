import java.util.Scanner;
/*Faça um programa que leia 5 números e informe o 
 maior deles e a média desses números */

public class MaiorEMedia {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); //ler números que serão solicitados

    int numero; //criar variável para número
    int count = 0; // criar contador de vezes do looping
    int maior = 0; // variável para salvar o maior número dentre os informados
    
    int soma = 0;

    do {
        System.out.println("Insira um número: "); //solicitar números
        numero = scan.nextInt(); //guardar números na memória

        if (numero > maior) maior = numero; //se o número informado for maior do que o que está salvo na variável maior, essa última deve ser igual ao número.

        soma = soma + numero;

        count = count + 1;
    } while(count < 5);
    
    System.out.println("Maior número é: " + maior);
    System.out.println("Média dos números é: " + (soma/5));
    
}
}