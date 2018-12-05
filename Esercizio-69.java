
import java.util.Scanner;

public class Palindromi {

    public static String reverse(String text) {

        String contenitore = "";
        int ultimaLettera = text.length() -1;
        for (int i = 0; ultimaLettera >= i; ultimaLettera--) {
            /* 
            il loop prosegue fino a quando il valore di lunghezza del testo
            (text.length(), inserito nella var ultimaLettera) non raggiunge 0
            */
            
            contenitore = contenitore + text.charAt(ultimaLettera);
            /*il contenitore prende le lettere a ritroso, partendo con l'ultima
            (il nome non è scelto a caso :)) e via a scendere, visto che ultimaLettera
            muove il loop e l'index della parola
            */
        }
        return contenitore;
    }

    public static boolean palindrome(String text) {
        if (text.equals(reverse(text))) return true;
        // con il metodo reverse si risolve tutto con un semplice comparatore
        // if (x.equals(reverse(y)) {}
        
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
