package com.stackroute.pe1;
import java.util.*;
public class OddEven {
	public static void main(String args[])
	{
		int input;
		Scanner in=new Scanner(System.in);
		input=in.nextInt();
		if(input>20&&input<30)
		{
			if(input%2!=0)
				System.out.println("Tom");
			else 
			System.out.println("Jerry");
		}
		else
			System.out.println("Try again");
		in.close();
						
	}
}