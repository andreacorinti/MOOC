// Exercise 40: PrintingLikeboss
public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int stelle = 0;
        while (stelle < amount) {
            System.out.print("*");
            stelle++;
        }
        System.out.println(); // linebreak, importante che sia solo nelle stelle
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int spazi = 0;
        while (spazi < amount) {
            System.out.print(" ");
            spazi++;
        }
        // gli spazi si adeguano allo stesso linebreak delle stelle, quindi qui non c'è!
    }

    public static void printTriangle(int size) {
        // 40.2
        // gli spazi partono con la dimensionione del triangolo (size) meno uno
        // quell'uno è la prima stella del triangolo (vedi prima variabile)
        // più aumentano le stelle (++) più diminuiscono gli spazi (--)
        
        int triangolo = 1;
        int spaziTr = (size -1); 
        while (triangolo <= size) {
            printWhitespaces(spaziTr); // prima gli spazi
            printStars(triangolo); // poi i triangoli
            triangolo++;
            spaziTr--;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        // per l'albero usiamo una variabile separata per il loop (i)
        // e una apposita per le stelle (albero)
        // visto che le stelle non aumentano di una in una ma in un x + 2
        
        int i = 1;
        int albero = 1;
        int spaziAl = (height -1);
        while (i <= height) {
            printWhitespaces(spaziAl);
            printStars(albero);
            albero = albero + 2;
            i++;
            spaziAl--;
        }
        // gambo (stand) 
        // il fulcro è (altezza -2), che lo mette al centro 
        // lo ripeto per pigrizia al momento, non la migliore cosa però
        printWhitespaces(height - 2);
        printStars(3);
        printWhitespaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
