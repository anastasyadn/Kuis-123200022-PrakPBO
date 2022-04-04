/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_pbo_b_123200022;

/**
 *
 * @author ACER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        outputAnimal macan = new outputAnimal("ml", "macan", "p");
        outputAnimal macan2 = new outputAnimal("ml", "macan", "pp");
        outputAnimal kambing = new outputAnimal("k", "kambing", "k");
        outputAnimal ayam = new outputAnimal("a", "ayam", "a");

        macan.printAnimal(macan);
        macan2.printAnimal(macan2);
        kambing.printAnimal(kambing);
        ayam.printAnimal(ayam);
    }
    
}
