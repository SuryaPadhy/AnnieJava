package com.annie.pattern;
import java.util.Scanner;

public class StarNumber {
	public static void main(String[] args) {
     int n = 5; 
	 int count = 0;
	 for(int i = 1; i<=n; i++)
	 {
		 for(int j = 1; j<=n; j++) 
		 {
			if(i==1 || j==1 || i==n || j==n) 
				{
				System.out.print("*");
				}
			
			else
				{
				// count++;
				 System.out.print(" ");
				}
		 }
			 
	 
	 System.out.println();
	 }
	}


}

