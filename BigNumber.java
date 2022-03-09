//BigNumber.java

import java.util.Scanner;

public class BigNumber
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		int number;

		System.out.println("Enter your number");

		number = s.nextInt();

		if (number > 100)
		{
			System.out.println("You number is a big number");
		}

		else if (number <= 100)
		{
			System.out.println("Your number is not a big number");
		}


	}
}