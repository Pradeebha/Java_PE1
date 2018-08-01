package com.stackroute.pe1;
import java.util.*;
class Guess{
	void guess() {
		int choice;
		Scanner in=new Scanner(System.in);
		choice=in.nextInt();
		if(choice==25) System.out.println("Number guessed matches the original number");
		else if(choice<25) {System.out.println(" Number guessed is less than original number");guess();} 
		else if(choice>25) {System.out.println(" Number guessed is greater than original number");guess();}
		in.close();

	}
}
public class GuessNo {
	
	public static void main(String args[])
	{
		System.out.println("Limit is 1-50");
		Guess g=new Guess();
		g.guess();
	}
		
}