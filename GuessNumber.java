
import java.io.*;

import java.util.*;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();
		int x = 1 + r.nextInt(90);

	
	System.out.println("Enter your Number"); // prompt user to guess number
	
	while (x<=90)
	{
Scanner sc = new Scanner(System.in); 
int guess=sc.nextInt(); // waits for value from user

	if(guess<x) // check if the entered value is less than the random number
	{
		System.out.println("you guessed too low, try  again");
	
	}
	if (guess>x) //checks if the entered value is is greater than the random number
	{
		System.out.println("you guessed too high, try again");
	}
 if (guess==x) // checks if the entered result matches the random number
{
	System.out.println(" you guessed correct");
}
	}
}
}
