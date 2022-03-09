//oddnumbers.java

import java.util.Scanner;

public class oddnumbers{

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);

		int number1;
		int number2;

		System.out.println("What is the first number?");
		number1 = s.nextInt();

		System.out.println("What is the second number?");
		number2 = s.nextInt();

		if (number1 % 2 != 1){
			number1 --;
		}

		if (number1 < number2){
			System.out.println("Here are all of the odd numbers between your two numbers");
			for(number1 = number1; number1 + 2 < number2; number1 +=2){
				System.out.println(number1 + 2);
			}		

		}
		else{
			System.out.println("There are no numbers between these two.");
		}

	}
}