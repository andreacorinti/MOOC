// Exercise 39: Printing

public class Printing {

    public static void printStars(int amount) {
        // 39.1
        // questo è basilare (sì, sarebbe meglio un for loop ma il MOOC li spiega dopo :) )
        
        int stelle = 0; // variabile per il loop
        while (stelle < amount) {
            System.out.print("*");
            stelle++; // la variabile aumenta di 1 ad ogni ciclo
        }
        
        System.out.println(); // linebreak
    }

    public static void printSquare(int sideSize) {
        // 39.2
        // il loop crea una nuova linea fino a quando non raggiunge il sideSize
        // il metodo printStars() stampa tante stelle quante sono nel sideSize
        
        int quadrato = 0;
        while (quadrato < sideSize) { 
            printStars(sideSize); 
            quadrato++; 
        }
        System.out.println(); // linebreak
    }

    public static void printRectangle(int width, int height) {
        // 39.3
        // simile al quadrato, questa volta essendo i lati differenti abbiamo due variabili
        // larghezza (width) e altezza (height)
        // la prima interessa il metodo printStars (che "scrive" in orizzontale)
        // la seconda il loop (che aggiunge una nuova linea fino a quando raggiunge height)
        int rettangolo = 0;
        while (rettangolo < height) {
            printStars(width);
            rettangolo++;
        }
        System.out.println(); // linebreak
    }

    public static void printTriangle(int size) {
        // 39.4
        // in questo caso il triangolo parte con 1, determinando sia il loop
        // che le stelle nel metodo printStars(), visto che entrambi aumentano
        // progressivamente allo stesso modo
        
        int triangolo = 1;
        while (triangolo <= size) {
            printStars(triangolo);
            triangolo++;
        }
    }

    public static void main(String[] args) {

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
