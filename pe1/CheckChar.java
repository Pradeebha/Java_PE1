package com.stackroute.pe1;
import java.util.*;
public class CheckChar {
	public static void main(String args[])
	{
		String input1;
		Scanner in=new Scanner(System.in);
		input1=in.nextLine();
		char input2=input1.charAt(0);
		if(Character.isUpperCase(input2)) System.out.println("Capital letter");
		else if(Character.isLowerCase(input2)) System.out.println("Small case letter");
		else if(Character.isDigit(input2)) System.out.println("Digit");
		else if(Character.isWhitespace(input2)) System.out.println("White space");
		else System.out.println("Special symbol");
		in.close();
	}

}
