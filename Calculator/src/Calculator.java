	import java.util.Scanner;

public class Calculator {

		
		  public static void main(String[] args) {

		    char operator;
		    Double number1, number2, result;

		    // Creating an object of Scanner class
		    Scanner input = new Scanner(System.in);

		    // asking user to enter operator
		    System.out.println("Choose an operator: +, -, *, or /");
		    operator = input.next().charAt(0);

		    // asking user to enter numbers
		    System.out.println("Enter first number");
		    number1 = input.nextDouble();

		    System.out.println("Enter second number");
		    number2 = input.nextDouble();

		    switch (operator) {

		      // performing addition between numbers
		      case '+':
		        result = number1 + number2;
		        System.out.println(number1 + " + " + number2 + " = " + result);
		        break;

		      // performing subtraction between numbers
		      case '-':
		        result = number1 - number2;
		        System.out.println(number1 + " - " + number2 + " = " + result);
		        break;

		      // performing multiplication between numbers
		      case '*':
		        result = number1 * number2;
		        System.out.println(number1 + " * " + number2 + " = " + result);
		        break;

		      // performing division between numbers
		      case '/':
		        result = number1 / number2;
		        System.out.println(number1 + " / " + number2 + " = " + result);
		        break;

		      default:
		        System.out.println("Invalid operator!");
		        break;
		    }

		    input.close();
		  }
		}


