package practice.OOPs;

import java.util.Random;
import java.util.Scanner;

class GuessTheNumber{
	int randomNumber;
	public GuessTheNumber(int randomNumber) {
		super();
		this.randomNumber = randomNumber;
	}
	public int isCorrect(int userInput,int random) {
		if(userInput==random) {
			System.out.println("Your Guess is Correct...!");
			return 1;
		}
		else if(userInput>random) {
			System.out.println("Your Guess is Greater than the number generated by the system...!");
			return 0;
		}
		else {
			System.out.println("Your Guess is Lesser than the number generated by the system...!");
			return 0;
		}
	}
	
}
public class GuessTheNumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userInput,i=0;
		Random random= new Random();
//		int n=random.nextInt(10)+1;
//		Scanner sc= new Scanner(System.in);
//		System.out.print("Guess the number between 1 and 10:");
//		userInput=sc.nextInt();
//		GuessTheNumber obj= new GuessTheNumber(n);
//		obj.isCorrect(userInput, n);
		int x=0;
		do {
			int n=random.nextInt(10)+1;
			Scanner sc= new Scanner(System.in);
			System.out.print("Guess the number between 1 and 10:");
			userInput=sc.nextInt();
			GuessTheNumber obj= new GuessTheNumber(n);
			x=obj.isCorrect(userInput, n);
			i=i+1;
		}while(x!=1);
		System.out.println("No of attempts taken to guess the correct number is :"+i);
	}

}
