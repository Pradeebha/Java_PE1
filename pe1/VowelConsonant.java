package com.stackroute.pe1;
import java.util.*;
public class VowelConsonant {
	public static void main(String args[]) {
		String input;
		Scanner in=new Scanner(System.in);
		input=in.nextLine();
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u')
				System.out.println("Vowel");
			else
				System.out.print("Consonant");
			in.close();
				
		}
	}
}
