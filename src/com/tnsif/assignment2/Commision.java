package com.tnsif.assignment2;

import java.util.Scanner;

public class Commision
{
	private String Name;
	private String Address;
	private String phone_no;
	private long Sales_amount;
	
	public void methodDefault()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name:");
		Name=sc.nextLine();
		System.out.println("Enter the address:");
		Address=sc.nextLine();
		System.out.println("Enter the phoneNumber");
		phone_no=sc.nextLine();
		System.out.println("Enter the amount:");
		Sales_amount=sc.nextInt();
	}
	
	
	public void methodNew()
	{
		if(Sales_amount>=100000)
		{
			System.out.println("commission=10%");
		}
		else
		{
			if(Sales_amount<=50000&&Sales_amount<100000)
			{
				System.out.println("commission=5%");
			}
			else
			{
				if(Sales_amount<=30000&&Sales_amount<50000)
				{
					System.out.println("Commission=3%");
;				}
				else
				{
					if(Sales_amount<30000)
					{
						System.out.println("No Commission");
					}
				}
			}
		}
	}
}
