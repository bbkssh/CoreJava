package com.company;
import java.io.IOException;
import java.util.ArrayList;

//java program to demonstrate working of ArrayList in Java
public class Main {

    public static void main(String[] args) throws IOException {

    	//declaring ArrayList with string as a data type
		ArrayList<String> list = new ArrayList<String>();

			//appending the new element at the end of the list
			list.add("chicago");
			list.add("New York");
			list.add("dallas");

			//change the value at certain position
			list.set(1, "denver");

			//delete element at certain position
			list.remove(1);

			//append certain element at certain position
			list.add(1, "Miami");

			//get size of an arrayList
			list.size();  //size method to get the size of array list

			//access an individual element
			System.out.printf("position 1: %s\n", list.get(1));
    }
}
