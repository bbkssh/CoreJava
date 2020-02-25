package com.company;

public class Main {

	//demonstration of array
    public static void main(String[] args) {

    	//creation of string array to store months
		String[] month_names = {"January", "February", "March", "April", "May",
                             "June", "July", "August", "September",
                            "October", "November", "December"};

		//creation of integer array to store months length
		int[] month_lengths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		//loop for iteration to every months
		for(int i = 0; i < 12; i++){

			//print number of days in every months
	    	System.out.printf("%s has %d days.\n", month_names[i], month_lengths[i]);

    	}
    }
}
