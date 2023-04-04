import java.util.Scanner; //biblioteca do teclado

/* Faça um programa que peça N números inteiros,
 * calcule e mostre a quantidade de números pares
 * e a quantidade de números ímpares */

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // abre o teclado para o usuário
    
        int quantNumeros; 
        int count = 0;
        int numero;
        int quantPares = 0, quantImpares = 0; //pode usar mesma linha

        System.out.println("Quantidade de Números: ");
        quantNumeros = scan.nextInt();

        do {
         System.out.println("Número: ");
         numero = scan.nextInt();
         count++; //incremento

         if (numero % 2 == 0) quantPares++; //resto da divisão do número por 2 ser = 0 (significa que é par)
         else quantImpares++; 

         } while (count < quantNumeros);

         System.out.println("Quantidade de Pares: " + quantPares);
         System.out.println("Quantidade de Ímpares: " + quantImpares);



    }
}


