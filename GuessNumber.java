
import java.io.*;

import java.util.*;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();
		int x = 1 + r.nextInt(90);

	//System.out.println( x);
	System.out.println("Enter your Number");
	while (x<=90)
	{
Scanner sc = new Scanner(System.in);
int guess=sc.nextInt();

	if(guess<x)
	{
		System.out.println("you guessed too low, try  again");
	
	}
	if (guess>x)
	{
		System.out.println("you guessed too high, try again");
	}
 if (guess==x)
{
	System.out.println(" you guessed correct");
}
	}
}
}
