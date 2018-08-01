package com.stackroute.pe1;
import java.util.*;
public class NumberLoop {
	public static void main(String args[])
	{
		int no;
		Scanner in=new Scanner(System.in);
		no=in.nextInt();
		for(int i=1;i<=no;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.println(i);
		}
		in.close();
	}
		
}
