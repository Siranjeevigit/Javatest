package org.company;

public class Company extends Client
{
	public void companyName() 
	{
		System.out.println("company name is guru");
		System.out.println("company name is guru");
	}
	
	public static void main(String[] args) 
	{
		Company c = new Company();
		c.companyName();
		c.clientName();
		
	}

}
