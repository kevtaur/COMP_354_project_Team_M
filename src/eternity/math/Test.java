/* COMP 354 - Team M ETERNITY
 * Written by: Kevin Ve,
 * 
 */

package eternity.math;

import eternity.exception.OutOfRangeException;

import java.util.*;
public class Test {
	public static void main(String[] args) {
		System.out.println("Welcome to Eternity!");
		System.out.println("Testing arccos()");
		try {
			System.out.println(Functions.arccosine(1));
			System.out.println(Functions.arccosine(0.5));
			System.out.println(Functions.arccosine(0));
			System.out.println(Functions.arccosine(-0.5));
			System.out.println(Functions.arccosine(-1));
		}
		catch (OutOfRangeException e) {
			System.out.println("MATH ERROR");
		}
		
		System.out.println("\nTest standard deviation");
		try {
			ArrayList<Double> test = new ArrayList<>();
			test.add(3.0);
			test.add(4.0);
			test.add(8.6);
			test.add(9.4);
			test.add(49.3);
			System.out.println(Functions.std_dev(test));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("\nTesting meanAbsoluteDeviation()");
		try {
			ArrayList<Double> test = new ArrayList<>();
			test.add(3.0);
			test.add(4.0);
			test.add(8.6);
			test.add(9.4);
			test.add(49.3);
			System.out.println(Functions.meanAbsoluteDeviation(test));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("\nTesting log()");
		try {
			System.out.println(Functions.log(0.5));
			System.out.println(Functions.log(7.5));
			System.out.println(Functions.log(10));
			
			System.out.println(Functions.log(0.5, 2));
			System.out.println(Functions.log(7.5, 5));
			System.out.println(Functions.log(55, 78));
		}
		catch (OutOfRangeException e) {
			System.out.println("MATH ERROR");
		}
		System.out.println("\nTesting sinh()");
        	try {
            	System.out.println(Functions.sinh(3));
            	System.out.println(Functions.sinh(1.5));
            	System.out.println(Functions.sinh(4));
            	System.out.println(Functions.sinh(-3));
            	System.out.println(Functions.sinh(-2));
            	System.out.println(Functions.sinh(-1.4));
        	}
        	catch (Exception e) {
            	System.out.println("MATH ERROR");
        	}
		
		
	
		System.out.println("\nProgram End.");
	}
}
