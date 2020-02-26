package com.hashtable;

import java.util.Hashtable;

public class Main {

    //java code illustrating clear() and clone method
    //method call return a clone of the hashtable
    public static void main(String[] args) {

        //creating a hash table
        Hashtable<Integer, String> h = new Hashtable<Integer, String>();
        Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();

        h.put(3, "Connie");
        h.put(2, "Alexia");
        h.put(1, "Maria");

        //create a clone or shallow copy of hash table h
        h1 = (Hashtable<Integer, String>)h.clone();

        //checking clone h1
        System.out.println("values in clone: " + h1);

        //clear hash table h
        h.clear();

        //checking hash table h
        System.out.println("after clearing: " + h);
    }
}
