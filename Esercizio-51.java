import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String nome = reader.nextLine();
        int i = 0; // variabile index
        
        while (i < nome.length()) {
            System.out.println((i+1) + ". character: " + nome.charAt(i));
            i++; // aumenta a ogni ciclo del loop fino al raggiungimento
            // della lunghezza del nome (nome.length)
            // notare che nell'elenco numerato utilizziamo la stessa variabile
            // sommata a 1 (i+1) perché altrimenti stamperebbe partendo da 0
        }
            
    }
}
