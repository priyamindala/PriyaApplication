package com.BasicProgram;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args)
	{
		List<String>priya = new ArrayList<>();
		priya.add("Selenium");
		priya.add("LoadRunner");
		priya.add("QTP");
		
		/*System.out.println(priya.get(0));
		System.out.println(priya.get(1));
		System.out.println(priya.get(2));*/
		
		for(int i=0;i<priya.size();i++)
		{
			System.out.println(priya.get(i));
		}

	}

}
