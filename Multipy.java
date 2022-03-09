import java.util.Scanner;

public class Multipy{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int num1;
		int num2;
		int num3;
		int product;

		System.out.println("What is the first number you want to multiply?");
		num1 = input.nextInt();

		System.out.println("What is the second number you want to multiply?");
		num2 = input.nextInt();

		System.out.println("What is the third number you want to multiply?");
		num3 = input.nextInt();

		product = num1*num2*num3;

		System.out.println("Your product is " + product);


	}
}


num1 = 0
num2 = 0
num3 = 0
product = 0
input("w")