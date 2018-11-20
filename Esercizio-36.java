// Exercise 36: loops ending and remembering


import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int somma = 0;
        int indice = 0;
        double media; // la media dev'essere un numero decimale, quindi usiamo double e non int (integer)
        int pari = 0;
        int dispari = 0;
        
        System.out.println("Type numbers:");

        while (true) {
            
            int numero = Integer.parseInt(reader.nextLine());
            // qui l'utente inserisce numeri fintanto che il loop è attivo (cioè fino a quando -1 non viene inserito)
            
            if (numero == -1) {
                break;
            } 
            
            // è fondamentale che il break del -1 avvenga prima delle operazioni, altrimenti è un casino
            
            somma += numero; // a ogni ciclo, i numeri inseriti vengono sommati in questa variabile
            indice++; // indica il totale dei numeri inseriti dall'utente
            
            if (numero % 2 == 0) {
                pari++;
            } else {
                dispari++;
            }
            
            /* calcolo dei numeri pari e dispari: se il resto (%) di Numero diviso per due è uguale a 0 il numero è pari, 
               altrimenti (else) è dispari: le rispettive variabili aumentano (++) di conseguenza a seconda del caso */
        }
        
        media = (double) somma / indice; 
        // la media si calcola dividendo la somma dei numeri per il loro numero, e ci rimetto (double) perché mi pare che
        // dividere due interi annulli la proprietà decimale della variabile senza

        System.out.println("Thank you and see you later!");
        System.out.println("The sum is: " + somma);
        System.out.println("How many numbers: " + indice);
        System.out.println("Average: " + media);
        System.out.println("Even numbers: " + pari);
        System.out.println("Odd numbers: " + dispari);

    }
}
