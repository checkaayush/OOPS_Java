/**Program to find square root of number without using predefined methods.
*
* @author 	Aayush Sarva
* version	1.0
* @since	06-08-2014 
*/

/*  The Bakhshali Approximation is used for majority test cases as it is faster. 
*	Babylonian Method also used for trivial cases.
*/

/*
TODO: 
	*Use a lighter to remember algorithm (Preferably, Newton's Method)
	*Handle negative input number exception.
*/

import java.util.Scanner;

public class My_sqrt
{
	static double findSqrt(double n)
	{
		double a,p,x,root_n;
		int i=0;


		/*Using Bakhsali Approximation
		* Cases: n>1 and 0<n<1
		* Note : sqrt of number less than 1 is greater than 1
		*/
		if(n>1)
		{
			while(i*i<n)
			i++;

			if(i*i == n)			//If n is already a perfect square
				return (double)i;
			else
			{
				i-=1;

				a = n - i*i;
				p = a/(2*i);
				x = i + p;

				root_n = x - p*p/(2*i);

				return root_n;
			}
		}

		/*Using Babylonian Method*/
		else
		{
			x=1;
			root_n = 0.5*(x + n/x);

			return root_n;
		}
	}

	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		double number=0,result;

		System.out.println("Enter the number:");
		try
		{
			number = input.nextDouble();
			if(number<0)
				throw new NotInDomainException(number);
			else
			{
				result = findSqrt(number);
				System.out.println("Square root of "+number+" is "+result); 	
			}
		}
		catch(NotInDomainException e)
		{
			System.out.println(e);
			//e.printStackTrace();
		}
	}
}

class NotInDomainException extends Exception
{
	private double b;
	
	//Constructor
	NotInDomainException(double a)
	{
		b=a;
	}

	//toString() 
	public String toString()
	{
		return (b+" is "+"not in domain.");
	}

}