/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xab
 */
public class Product {
    
    // questi attributi vengono incapsuclati nella classe Product e non vengono resi pubblici
    private String nome; 
    private double prezzo;
    private int ammontare;
    
    public Product (String nameAtStart, double priceAtStart, int amountAtStart) {
        // constructor
        this.nome = nameAtStart;
        this.prezzo = priceAtStart;
        this.ammontare = amountAtStart;
    }
    
    public void printProduct() {
        System.out.println(this.nome + ", " + this.prezzo + ", " + this.ammontare);
    }
}
