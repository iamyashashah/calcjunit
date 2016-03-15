
import java.util.Scanner;



public class Calculator {

	public static void main(String[] args) {

		Calculationmethod cal = new Calculationmethod();
		Scanner sc = new Scanner(System.in);
		double nOne=0;
		double nTwo = 0;
		double choice;
		double result;


		System.out.println("Simple Calculator");
		
		System.out.print("\nFirst Number: ");
		nOne = sc.nextDouble();


		System.out.println("\nHere are your options:");
		System.out.println("\n1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Division");
		System.out.println("4. Multiplication");
		System.out.println("5. Modulus");

		System.out.print("\nWhat would you like to do?: ");
		choice = sc.nextDouble();
		System.out.println();
		
		System.out.print("\nSecond Number: ");
		nTwo = sc.nextDouble();


		if (choice == 1){
			
			result = cal.Calc(nOne, nTwo,choice);
			System.out.println(result);
		}
		else if (choice == 2){
			result = cal.Calc(nOne, nTwo,choice);
			System.out.println(result);
		}
		else if (choice == 3){
			result = cal.Calc(nOne, nTwo,choice);
			System.out.println(result);
		}
		else if (choice == 4){
			result = cal.Calc(nOne, nTwo,choice);
			System.out.println(result);
		}
		else if (choice == 5){
			result = cal.Calc(nOne, nTwo,choice);
			System.out.println(result);
		}

		System.out.println();
		sc.close();
	}

}
