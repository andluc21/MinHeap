/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw7winterjava;

/**
 *
 * @author lucaandolina
 */



public class Test {
    public static void main(String[] args) {
        MinHeapInterface<String> aHeap=new MinHeap<>();
        aHeap.add("Jared");
        aHeap.add("Brittany");
        aHeap.add("Brett");
        aHeap.add("Doug");
        aHeap.add("Megan");
        aHeap.add("Jim");
        aHeap.add("Whitney");
        aHeap.add("Matt");
        aHeap.add("Regis");
        
        if (aHeap.isEmpty())
            System.out.println("The heap is empty");
        else
            System.out.println("The heap is not empty; it contains "+ aHeap.getSize() +" entries.");
       
        System.out.println("The smallest entry is " + aHeap.getMin());
        System.out.println("Removing entries in ascending order:");
        while(!aHeap.isEmpty())
            System.out.println("Removing " + aHeap.removeMin());
       
        System.out.println("\nTesting constructor with array parameter:");
        String[] nameArray  = {"Banana", "Watermelon", "Orange", "Apple", "Kiwi"};
        MinHeapInterface<String> anotherHeap = new MinHeap<>(nameArray);
       
        if (anotherHeap.isEmpty())
            System.out.println("The heap is empty");
        else
            System.out.println("The heap is not empty; it contains "+ anotherHeap.getSize() +" entries.");
       
        System.out.println("The smallest entry is " + anotherHeap.getMin());
        System.out.println("Remving entries in ascending order:");
        while(!anotherHeap.isEmpty())
            System.out.println("Removing " + anotherHeap.removeMin());
    }
}