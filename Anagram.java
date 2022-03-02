package com.DataStructureAnAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	 public void anagram(String first , String second) {
	        first = first.toLowerCase();
	        second = second.toLowerCase();

	        if(first.length() == second.length()) {
	            char[] charArray1 = first.toCharArray();
	            char[] charArray2 = second.toCharArray();

	            Arrays.sort(charArray1);
	            Arrays.sort(charArray2);

	            boolean result = Arrays.equals(charArray1, charArray2);

	            if(result) {
	                System.out.println(first +" And " + second+ " Are Anagram");
	            }else {
	                System.out.println(first +" And " + second+ " Are Not Anagram");
	            }
	        }
	    }

	    public static void main(String[] args) {

	        Scanner scan = new Scanner(System.in);

	        System.out.print("String1: ");
	        String first = scan.nextLine();

	        System.out.print("String2: ");
	        String second = scan.nextLine();

	        Anagram anagram = new Anagram();
	        anagram.anagram(first,second);
	    }
}
