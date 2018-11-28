
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        
        /* 
        
        La condizione per il loop è la lunghezza della parola
        (cioè text.length()) meno 1, poiché l'indicizzazione parte a 0
        
        Esempio:
        
        ciao ha un index di 3 (0123) ma i = ciao.length() ha un valore di 4.

        
        */

        int i = text.length() - 1; // variabile per il loop
        String contenitore = ""; // contiene le singole lettere

        while (i >= 0) {
            contenitore = contenitore + text.charAt(i);
            // ad ogni ciclo le lettere vengono aggiunte alla var contenitore
            i--; // l'indice dimunisce progressivamente e si ferma a 0
        }
        
        return contenitore; // il contenitore è riempito!
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
