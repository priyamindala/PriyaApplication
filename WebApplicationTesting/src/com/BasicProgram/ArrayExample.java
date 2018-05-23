package com.BasicProgram;

public class ArrayExample {

	public static void main(String[] args) 
	{
		//int i=10;
	//	i=20;
		
		//System.out.println(i);
		   //Array   
		int priya[] = new int[4]; // Array index always starts with 0 
		                          // we should declare the DataType
		                          // we should also declare the Size of the Array 
		priya[0]=10;
		priya[1]=20;
		priya[2]=30;
		priya[3]=40;
		
		
		/*System.out.println(priya[0]);
		System.out.println(priya[1]);
		System.out.println(priya[2]);*/
		
		for(int i=0;i<priya.length;i++) // 
		{
			System.out.println(priya[i]);
		}
		
		
		
		

	}

}
