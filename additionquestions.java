/**
 *  Author: shushhhhhh
 *  Description: Asks user for their name, asks 10 simple addition questions
 *  and then outputs the users score.
 */

import java.util.Scanner;
import java.util.Random;

public class additionquestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
        //Variables

		int count = 0;
        int score = 0;
        
        //Scanner and Random creation

		Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        
        //Asks user for their name
		
		System.out.println("Hello, what's your name? \n");
		String name = scan.nextLine();
		
		System.out.println("\nHello " + name + ", no one gives a shit what your name is, fuck off.\n");
        System.out.println("");
        
        //Continues to ask questions until the counter reaches 10

		while (count <= 10) {

			int num1 = rand.nextInt(20);
			int num2 = rand.nextInt(20);
			System.out.println("What is " + num1 + "+" + num2 + "?\n");
			double guess = scan.nextDouble();

			int answer = num1 + num2;

			if (guess == answer) {
				System.out.println("Correct\n");
				count ++;
				score++;
			}

			else {
				System.out.println("Incorrect\n");
				count ++;
			}
        }
        
        //Different responses to users score depending on how many they got correct

		if (score <= 3) {
		System.out.println("You're a dumb cunt that only scored " + score + "/10");

		}

		else if (score >= 4 && score <= 7) {
			System.out.println("You're mediocre and will never achieve anything, you got " + score + "/10");
		}

		else {
			System.out.println("Congrats, you're a fat nerd and got " + score + "/10. Get a life loser.");
		}

		scan.close();
		
		
		
		
	}
}
