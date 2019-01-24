package edu.cnm.deepdive;


import java.util.Random;
import java.util.Scanner;

public class guessANumber {
  private static Random random = new Random();
  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    while (roundOne());
  }

  private static boolean roundOne() {
    boolean playAgain;
    boolean guessAgain = true;
    int guess;
    int randomized;

    randomized = random.nextInt(100) + 1;
    System.out.println("Please input a number between 1 and 100. Press 0 to give up.");
    do {
      guessAgain = guessAndCheck(randomized);


    } while (guessAgain);
    System.out.println("Do you want to play again? Yes or no");
    String answer;
    do {
      answer = input.nextLine().trim().toLowerCase(); //this is called chained method calls. trim() trims off any excess white space, and
      //.toLowerCase() converts the string produced into lowercase.
    } while (answer.isEmpty());
    return answer.charAt(0) == 'y';
  }

  private static boolean guessAndCheck(int randomized) {
    int guess;
    boolean guessAgain;
    guess = input.nextInt();
    if (guess == 0) {
      guessAgain = false;
    } else if (guess < randomized) {
      System.out.println("That's too low");
      guessAgain = true;
    } else if (guess > randomized) {
      System.out.println("That's too high");
      guessAgain = true;
    } else {
      System.out.println("That's right!");
      guessAgain = false;
    }
    return guessAgain;
  }
}
