import java.util.Random;

/*Faça um programa que leira 20 números inteiros aleatórios
 entre 0 e 100 e armazene-os em um vetor. Ao final,
 mostre esses números e seus sucessores. */

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(bound: 100); //limite do aleatório
            numerosAleatorios[i] = numero;
            //laço vai repetir enquanto o i for menor que o tamanho do array
        }

        System.out.print("\nNúmeros Aleatórios");
        for (int numero : numerosAleatorios) {
            System.out.println(numero + " ");
        }

        System.out.print("\nSucessores Números Aleatórios");
        for (int numero : numerosAleatorios) {
        System.out.println(numero+1 + " ");
        }

        
    }   
    
}
