import java.util.Scanner;

/*Faça um programa que leia um vetor de 6 caracteres,
 e diga quantas consoantes foram lidas.
 Imprima as consoantes. */

public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantConsoantes = 0;
        int count = 0;

        do{
            System.out.println("Letra: ");
            String letra = scan.next();

            /*equals -> método para compararar strings
            ! pede o oposto da condição */
            if ( ! (letra.equalsIgnoreCase("a")|
                    letra.equalsIgnoreCase("e")|
                    letra.equalsIgnoreCase("i")|
                    letra.equalsIgnoreCase("o")|
                    letra.equalsIgnoreCase("u"))) {
                consoantes[count] = letra;
                quantConsoantes++;
                }

            count++;

        } while(count < consoantes.length);
        //for each -> de um lado o tipo do elemento e do outro lado o array
        
        System.out.println("Consoantes: ");
        for (String consoante : consoantes) { 
            if (consoante != null)
            System.out.print(consoante + " ");
            //"para cada elemento dentro desse array de consoantes, quero que imprima tal elemento "
        }
    }
    
}
