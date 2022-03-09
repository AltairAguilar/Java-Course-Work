//negative.java
import java.util.Scanner;

public class negative
{

	public static void main( String[] args )
	{
		Scanner s = new Scanner(System.in);

		int number;

		System.out.println("What is your number?");
		number = s.nextInt();

		if (number > 0){
			System.out.println("Your numbr is positive");
		}

		else if (number < 0){
			System.out.println("Your number is negative");
		}

		else{
			System.out.println("Your number is 0");
		}


	}
}