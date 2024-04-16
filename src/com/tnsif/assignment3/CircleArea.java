package com.tnsif.assignment3;

import java.util.Scanner;

public class CircleArea 
{
	Scanner sc=new Scanner(System.in);
	int Radius;
	String Colour;
	double Area;
	
	 void getInputs()
	{
		System.out.println("Enter the radius of the circle:");
		Radius=sc.nextInt();
		System.out.println("Enter the colour of the Circle:");
		Colour=sc.next();
		
		
	}
	
	
	 void calcArea()
	{
		
		Area=3.14*Radius*Radius;
		System.out.println("Area of the circle is:"+Area);
	}
}


