package com.stackroute.pe1;
import java.util.*;
public class Sort {
	public static void main(String args[]) {
		int no,r,i=0,temp,sum=0;
		int a[]=new int[10];
		Scanner in=new Scanner(System.in);
		no=in.nextInt();
		
		while(no>0) {
			r=no%10;
			if(r%2==0)sum=sum+r;
			a[i]=r;
			i++;
			no=no/10;
		}
		
		
		
		for(i=0;i<10;i++)	{
			for(int j=1;j<10;j++)
			{
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		System.out.println("Sorted number in non-increasing order");
		for(int arr:a) System.out.println(arr);
		System.out.println("Sum of even nos"+sum);
		if(sum>15) System.out.println("True");
		else System.out.println("False");
		in.close();
	}

}
