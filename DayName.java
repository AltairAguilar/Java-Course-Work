//DayName.java

import java.util.Scanner;

public class DayName{

	public static void main( String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Insert a number.");
		int number = s.nextInt();

		System.out.println("The day of the week is " + GetName(number));
	}

	private static String GetName(int number)
	{
		if (number < 8 && number > 0)
		{
			if (number == 1)
			{
				return "Sunday";
			}
			else if (number == 2)
			{
				return "Monday";
			}
			else if (number == 3)
			{
				return "Tuesday";
			}
			else if (number == 4)
			{
				return "Wednesday";
			}
			else if (number == 5)
			{
				return "Thursday";
			}
			else if (number == 6)
			{
				return "Friday";
			}
			else if (number == 7)
			{
				return "Saturday";
			}
		}
		else
		{
			return "That is not a valid number";
		}
		return "I shouldn't need this return statement but whatever.";
	}

}