package com.stackroute.pe1;
import java.util.*;
public class Sum {
	public static void main(String args[])
	{
		int input,sum=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter 0 when finished");
		input=in.nextInt();
		while(input>0) {
			sum=sum+input;
			input=in.nextInt();
		}
		System.out.println(sum);
		in.close();
	}

}
