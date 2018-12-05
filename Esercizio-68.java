import java.util.ArrayList;
import java.util.Scanner;

public class MoreThanOnce {

    public static boolean moreThanOnce(ArrayList<Integer> list, int searched) {
        // write your code here
        
        /* 
        I loop For-each non tengono traccia dell'index, quindi una cosa del tipo:
        for (int loop : list) {
            if (list.get(loop) == searched) clonato++;
        }
        è impraticabile...possiamo creare una variabile apposita per l'index
        (vedi sotto) o usare un vecchio for loop normale, tipo:
        
        for (int i = 0; i < list; i++) {
            if (list.get(i) == searched) clonato++;
        }
        
        */
        
        int index = 0; // variabile apposita, vedi sopra
        int clonato = 0;
        
        for (int loop : list) {
            if (list.get(index) == searched) clonato++;
            // se il numero appare nell'array, la variabile clonato aumenta di 1
            if (2 <= clonato) return true;
            // se la variabile clonato è uguale o superiore a 2 il metodo è vero
            index++;
        }
        
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        if (moreThanOnce(list, number)) {
            System.out.println(number + " appears more than once.");
        } else {
            System.out.println(number + " does not appear more than once. ");
        }
    }
}
