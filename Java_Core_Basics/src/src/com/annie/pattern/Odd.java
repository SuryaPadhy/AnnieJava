package com.annie.pattern;

public class Odd {
	public static void main(String[] args) {
		
	
	int n =5;

	for (int i =1; i<=n ; i++)
	{
		int j=(i*2)-1;
	
		for(int k =1;k<=n;k++)
		{
			System.out.print(j+" ");
			j=j+2;
			if(j>(n*2)-1)
				j=1;
		}
		System.out.println();
		}
	}

}
