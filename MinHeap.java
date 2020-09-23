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



public class MinHeap < T extends Comparable<? super T>> implements MinHeapInterface<T> {
    	
   private int maxSize;
   private T[] pqArray; //use array to implement 
   private int length = 0;
   private int frontIndex = 0;
   private static final int DEFAULT_CAPACITY=25;
   
   public MinHeap(){
       this(DEFAULT_CAPACITY);
   }
   
   //Constructor, Time O(1), Space O(1)
   public MinHeap(int capacity) {
	   this.maxSize = capacity;
	   this.pqArray =   (T[])new Comparable[capacity+1];	   
   }
   
   public MinHeap(T[] entries) {
	   int n = entries.length;
	   this.maxSize = n;
	   this.pqArray =  (T[])new Comparable[n+1];	
       for (int i=0; i<entries.length; i++)
    	   add(entries[i]);
   }
 
   //Add at the back, Time O(n), Space O(1), n is priority queue length  
   public void add(T value) {
	   int i;
	   if (length == 0)                       
		   pqArray[length++] = value;     
	   else {
		   pqArray[length+1] = pqArray[length];
		   for (i = length-1; i >= frontIndex; i--) {			   
			   if (value.compareTo(pqArray[i]) < 0) //ascending order
				   pqArray[i+1] = pqArray[i];
			   else 
				   break;                     
		   }  
		   pqArray[i+1] = value;
		   length++;
	   } 
   } 
   
   //Remove from the front, Time O(1), Space O(1)
   public T removeMin() { 
	   T res = null;
	   if (length >= -1) {
		   res = pqArray[frontIndex++];
		   length--;
	   }
	   return res;
   }
   
   //Return the front value, Time O(1), Space O(1)
   public T getMin() { 
	   return pqArray[frontIndex]; 
   }
   
   //print all, Time O(n), Space O(1)
   public void print() {
		for (int i = frontIndex; i < length+frontIndex; i++)
			System.out.print(pqArray[i] + " ");
		System.out.println();
   }
	
   //Return the length, Time O(1), Space O(1)
   public int getSize() {
	   return length;
   }
  
   //Check empty, Time O(1), Space O(1)
   public boolean isEmpty() { 
	   return length == 0; 
   }
   
   //Check full, Time O(1), Space O(1)
	public boolean isFull() { 
		return length == maxSize; 
	}
	
	public void checkCapacity(){
		System.out.println("length: " + length + ", capacity: "+ maxSize);
	}

	
}