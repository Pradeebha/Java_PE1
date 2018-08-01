package com.stackroute.pe1;
import java.util.*;
public class ReverseString {
	public static void main(String args[])
	{
		String input,reverse="";int length;
		Scanner in=new Scanner(System.in);
		input=in.nextLine();
		length=input.length();
		for(int i=length-1;i>=0;i--)
			reverse=reverse+input.charAt(i);
		System.out.println(reverse);
		in.close();
	}

}
