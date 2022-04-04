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
public class outputAnimal implements Animal{
    String nama, tipe, suara;

    public outputAnimal(String nama, String tipe, String suara) {
        this.nama = nama;
        this.tipe = tipe;
        this.suara = suara;
    }
    
    @Override
    public String getName() {
        return nama;
    }

    @Override
    public String getType() {
        return tipe;
    }

    @Override
    public void makeSound() {
        System.out.println(suara);
    }
    
    public void printAnimal(Animal animal){
        System.out.print(animal.getName() + " adalah " + animal.getType() + " dengan bunyi "); animal.makeSound();
    }
}
