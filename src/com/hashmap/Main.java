package com.hashmap;

import java.util.HashMap;

public class Main {

    //java program illustrating use of HashMap methods
    //put(), get(), isEmpty(), size()
    public static void main(String[] args) {

        //creation of Hashmap
        HashMap<String, String> obj = new HashMap<>();

        //adding values to Hashmap as ("keys", "values")
        obj.put("Language", "Java");
        obj.put("Code", "Hashmap");
        obj.put("IDE", "Intellij");

        //checks whether the HashMap is empty or not
        //Not empty so printing the values
        if(!obj.isEmpty()){
            System.out.printf("Hashmap Geeks is notempty");

            //Accessing the contents of HashMap through keys
            System.out.printf(obj.get("Language"));
            System.out.printf(obj.get("Code"));
            System.out.printf(obj.get("IDE"));

            //size() method prints the size of HashMap
            System.out.printf("Size of a Hashmap: " + obj.size());
        }
    }
}
