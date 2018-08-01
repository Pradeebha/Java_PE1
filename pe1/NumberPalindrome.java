package com.stackroute.pe1;
import java.util.*;
public class NumberPalindrome {
	public static void main(String args[]) {
		long rev=0,sum=0,r;
		long no,temp;
		Scanner in=new Scanner(System.in);
		no=in.nextLong();
		temp=no;
		while(temp>0)
		{
			r=temp%10;
			if(r%2==0) sum=sum+r;
			rev=(rev*10)+r;
			temp=temp/10;
		}
		if(no==rev)
		{
			System.out.println(no+"is a palindrome");
			if(sum>25)
				System.out.println("Sum of even digit nos is greater than 25");
			else
				System.out.println("Sum of even digit nos is less than 25");
		}
		else
			System.out.println(no+" is not a palindrome");
		in.close();					
			
	}

}
