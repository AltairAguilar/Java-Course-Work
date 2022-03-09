import java.util.Scanner;

public class comparer{

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);

		double num1;
		double num2;

		System.out.println("Enter the first number");
		num1 = s.nextDouble();

		System.out.println("Enter the second number");
		num2 = s.nextDouble();


		System.out.println("The first number is equal to the second: " + (num1 == num2));

		System.out.println("The first number is greater than or equal to the second: " + (num1 >= num2));

		System.out.println("The first number is less than the second: " + (num1 < num2));

	}
}