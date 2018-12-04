// con while

import java.util.ArrayList;

public class LengthsOfStrings {
    public static ArrayList<Integer> lengths(ArrayList<String> list) {
        ArrayList<Integer> lengthList = new ArrayList<Integer>();
        // write code here
        int i = 0;
   
        while (i < list.size()) { // il loop prosegue fino a quando non raggiunge la lunghezza dell'array
            String elemento = list.get(i); // identifica progressivamente l'elemento della lista (0, 1, 2, ecc)
            lengthList.add(elemento.length()); // aggiungo la lunghezza dell'elemento all'array lengthList
            i++; // aumento il valore di i a ogni ciclo
        }
        
        return lengthList;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ciao");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");
        ArrayList<Integer> lengths = lengths(list);
        
        System.out.println("The lengths of the Strings: " + lengths);
    }
}

// con for

import java.util.ArrayList;

 

public class LengthsOfStrings {

    public static ArrayList<Integer> lengths(ArrayList<String> list) {

        ArrayList<Integer> lengthList = new ArrayList<Integer>();

        // write code here

        

        for (String s : list) {

            lengthList.add(s.length());

        }

 

        return lengthList;

    }

 

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("Ciao");

        list.add("Moi");

        list.add("Benvenuto!");

        list.add("badger badger badger badger");

        ArrayList<Integer> lengths = lengths(list);

        

        System.out.println("The lengths of the Strings: " + lengths);

    }

}

 
