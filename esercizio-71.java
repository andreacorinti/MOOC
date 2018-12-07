
import java.util.ArrayList;
import java.util.Collections;

public class SmartCombining {

    public static void smartCombine(ArrayList<Integer> primo, ArrayList<Integer> secondo) {

        int lunghezza;

        if (primo.size() > secondo.size()) {
            lunghezza = primo.size(); // se primo è più lungo
        } else {
            lunghezza = secondo.size(); // se secondo è più lungo
        }

        for (int i = 0; i < lunghezza; i++) { // i cresce fino a ragginugere lunghezza
          int numero = secondo.get(i); // numero dell'array iterato dal loop
          
          if (!primo.contains(numero)) { // se il primo array NON (-> !) contiene il numero
              primo.add(numero); // lo aggiungiamo
          }
          
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        Collections.addAll(list1, 4, 3);

        Collections.addAll(list2, 5, 10, 4, 3, 7);

        // remove comment when method ready
        smartCombine(list1, list2);
        System.out.println(list1);
        System.out.println(list2);
    }

}
