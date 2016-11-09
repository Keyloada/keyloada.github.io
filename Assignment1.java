import java.util.Scanner;

public class Assignment1 {

	/*
	 * Author: David Mack
	 * Date: 10/5/2016
	 * Description: This code determines if a number is an Armstrong number.
	 * It gives the user the opportunity to either have a number selected for
	 * it, or input one themselves. 
	 */
	
	
	
	public static void main(String[] args) {
		int number = 9;
		char banana = '1';
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Would you like the computer to generate a random number 1-9999? Yes or No");
		String answer = input.next();
		
		if (answer.equalsIgnoreCase("yes"))
			number = (int) (Math.random()*(9999)*1);
		else if (answer.equalsIgnoreCase("no")){
			System.out.print("Enter an integer 1-9999: ");
			number = input.nextInt();
		}
		else{
			System.out.print("Because you selected an invalid answer, the answer \"no\" was automaticly selected. ");
			System.out.print("Enter an integer 1-9999: ");
			number = input.nextInt();
		}
		System.out.println("the number that has been selected is:" + number);
		
		String test = ""+number;
		
		char first='0', second='0', third='0', fourth='0';
		
		int howLong = test.length();
		
		switch (howLong){
		case 1 : first =  test.charAt(0); break;
		case 2 : second = test.charAt(1); 
		first = test.charAt(0); break;
		case 3 : third = test.charAt(2);
		second = test.charAt(1); 
		first = test.charAt(0);break;
		case 4 : fourth = test.charAt(3);
		third = test.charAt(2);
		second = test.charAt(1); 
		first = test.charAt(0);break;
		default : banana = '@';
		}
		
		int firstNum = Character.getNumericValue(first), secondNum = Character.getNumericValue(second);
		int thirdNum = Character.getNumericValue(third), fourthNum = Character.getNumericValue(fourth);
		
		int alpha = (int) Math.pow(firstNum, 3), bravo = (int) Math.pow(secondNum, 3);
		int charlie = (int) Math.pow(thirdNum, 3), delta = (int) Math.pow(fourthNum, 3);
		int thingy = alpha + bravo + charlie + delta;
		boolean armStrong = number == thingy;
		
		if (armStrong)
			if (banana != '@')
			System.out.println(number + " is an armstrong number.");
			else
			System.out.print("invalid input");
		else{
			if (banana != '@')
			System.out.println(number + " is not an armstrong number");
			else
			System.out.print("invalid input");
		}
		
	}

}
