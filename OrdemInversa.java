/*Crie um vetor de 6 números inteiros
e mostre-os da ordem inversa */

public class OrdemInversa {
    public static void main(String[] args) {
            //posição:  0   1  2    3  4  5
        int[] vetor = {-5, -6, 15, 50, 8, 4};

        System.out.println("Vetor: ");
        int count = 0;
        //length percorre e retorna o tamanho do vetor
        while(count < (vetor.length)) { 
            System.out.println(vetor[count] + " ");
            count++;
        }
        System.out.println("Vetor: ");
        for (int i = (vetor.length - 1); i>=0; i--) {
            System.out.println(vetor[i] + " ");

        }

    }
    
}
