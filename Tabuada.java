import java.util.Scanner;

//Desenvolva um gerador de tabuadas de 1 a 10

public class Tabuada{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número que deseja calcular a tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);

        // contagem + limita + incremento
        for(int i=1; i<=10; i++  ) {
            System.out.println(tabuada + " x 5" + i + " = " + (tabuada * i));
        }

    
    }
}