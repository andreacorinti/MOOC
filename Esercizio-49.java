import java.util.Scanner;

public class LastCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String nome = reader.nextLine();
        System.out.println("Last character: " + lastCharacter(nome));
    }
    
    public static char lastCharacter(String text) {
        return text.charAt(text.length()-1);
        // per conoscere l'ultima lettera di una parola, l'index deve avere
        // un valore corrispondente alla sua lunghezza - 1 (es: il text.length di
        // Andrea è 6, -1 diventa 5), il meno uno è fondamentale perché l'indicizzazione
        // parte da 0: A, la prima lettera di Andrea, equivale a 0, mentre 1 è n
    }
}
