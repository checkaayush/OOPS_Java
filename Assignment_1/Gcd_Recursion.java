/**Program to find gcd of 2 numbers using recursion.
*
* @author 	Aayush Sarva
* version	1.0
* @since	06-08-2014 
*/

import java.util.Scanner;

public class Gcd_Recursion
{
	public static int findGcd(int a, int b)
	{	
		if(a==0 || b==0)
			return (a+b);
		else
			return findGcd(b,a%b);
	}

	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

		int number1, number2, result;

		System.out.println("Enter the numbers:");
		number1 = input.nextInt();
		number2 = input.nextInt();
		
		result = findGcd(number1, number2);

		System.out.println("GCD of numbers "+number1+" and "+number2+" is "+result+".");
	}
}
