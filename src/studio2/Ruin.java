package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("How much money did you start with?");
		double startAmount = in.nextDouble();
		System.out.println("You are starting with " + startAmount);
		
		System.out.println("What is the probability that you will win a single play?");
		double winChance = in.nextDouble();
		System.out.println("Your probability of winning is " + winChance);
		
		System.out.println("What amount of money do you need to reach to have a succesful day and leave?");
		double winLimit = in.nextDouble();
		System.out.println("The amount of money you need to make in order to leave is " + winLimit);
		
		int winNumber = 0;
		
		int lossNumber = 0;
		while (startAmount < winLimit && startAmount > 0) //the conditions that must be true for the while loop to run
		{
			if (winChance > Math.random()) {
			winNumber++;
			startAmount++;
	}
		else
		{
		
			lossNumber++;
			startAmount--;
		}
		}
	

	if (startAmount == winLimit) {
		System.out.println("Go home. You are a winner.");
		System.out.println("Win:" + winNumber);
		System.out.println("Ruin" + lossNumber);
	}
	else if (startAmount == 0) {
		System.out.println("Go home. You suck.");
		System.out.println("Ruin:"+ lossNumber);
		System.out.println("Win:" + winNumber);
	}
}}

