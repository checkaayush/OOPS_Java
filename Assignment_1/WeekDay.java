/**Program to find day of week given the date.
*
* @author 	Aayush Sarva
* version	1.0
* @since	06-08-2014 
*/

/*TODO:
	*Learn and code the shorter way from geeksforgeeks
*/

import java.util.Scanner;
/*Concept of odd days is used.*/
public class WeekDay
{
	public static boolean isLeap(int year)
	{
		if(year%400==0)
			return true;
		else if(year%100==0)
			return false;
		else if(year%4==0)
			return true;
		else 
			return false;
	}


	static void findWeekday(int date, int month, int year)
	{
		String dayOfWeek = new String();
 
		int oddDays = calculateOddDays(date, month, year); //Normalized final odd days.

 		/**Finding weekday based on calculated number of odd days
 		*dayOfWeek : Weekday name string
 		*/
		switch(oddDays)
		{
			case 0:	dayOfWeek="Sunday";
					break;
			case 1:	dayOfWeek="Monday";
					break;
			case 2:	dayOfWeek="Tuesday";
					break;
			case 3:	dayOfWeek="Wednesday";
					break;
			case 4:	dayOfWeek="Thursday";
					break;
			case 5:	dayOfWeek="Friday";
					break;
			case 6:	dayOfWeek="Saturday";
					break;
		}

		//Showing output
		System.out.println("Weekday on given date : "+dayOfWeek+".");
	} 


	static int calculateOddDays(int date, int month, int year)
	{
		int p1,p2,od1,od2,od3,total,sum=0,add,leaps,ord_years;

		/*Odd days till present century : od1*/
		p1 = (year-1)/100;
		od1 = (p1%4)*5;
		//


		/*Odd days till last year : od2*/
		p2 = (year-1)%100;
		leaps = p2/4;
		ord_years = p2-leaps;
		od2 = leaps*2 + ord_years;
		//

		
		//Odd days for months from Jan to Nov.
		//For Feb: 1 if leap year and 0 if not.
		int oddDays[] = {3,((isLeap(year))?(1):(0)),3,2,3,2,3,3,2,3,2};


		/*Odd days till last month :sum 
		* Odd days till present date : od3
		*/
		for(int i=0;i<month-1;i++)
		{
			add = oddDays[i];
			sum += add;//Get odd days till previous month
		}

		od3=sum+date;	//Odd days till present date
		//


		total = (od1+od2+od3) % 7; //Normalized final odd days.

		return total;
	}


	public static void main(String args[])
	{
		int date, month, year;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter date in 'dd mm yyyy' format:");
		date = input.nextInt();
		month = input.nextInt();
		year = input.nextInt();

		findWeekday(date, month, year); 
	}
}
