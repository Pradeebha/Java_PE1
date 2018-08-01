package com.stackroute.pe1;
import java.util.*;
public class RepeatString {
	public static void main(String args[])
	{
		int limit,l,length;
		String input,repeat="";
		Scanner in=new Scanner(System.in);
		input=in.nextLine();
		limit=in.nextInt();
		length=input.length();
		l=length-limit;
		for(int i=l;i<length;i++)
			repeat=repeat+input.charAt(i);
		for(int j=1;j<=limit;j++)
			input=input+repeat;
		System.out.println(input);
		in.close();
		
	}
}
