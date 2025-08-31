import java.util.Random;
import java.util.Scanner;
import java.util.SequencedCollection;

public class RPS {
    public static void main(String[] args) {
        // Constructing a Rock-Paper-Scissor Game
        System.out.println("🙏WELCOME🙏");     // Welcoming the user
        System.out.println("\nPlay Rock,Paper,Scissor with me (You v/s Computer)");
        System.out.println("Press the number :\n0 --> Rock🪨\n1 -->Paper📃\n2 -->Scissor✂️ ");  // Assigning values

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();    // Taking Input's Choice
        System.out.print("Your Choice -->  ");    // Printing Input's Choice value
        switch (num) {
            case 0:
                System.out.println("Rock🪨");
                break;
            case 1:
                System.out.println("Paper📃");
                break;
            case 2:
                System.out.println("Scissor✂️");
                break;
            default:
                System.out.println("Invalid Choice❌ ");
        }
        Random r = new Random();
        int random = r.nextInt(3);  // Taking any random number up to a bound of 3
        System.out.println(random);
        System.out.print("My Choice --> ");  // Printing Computer's Choice value
        switch (random) {
            case 0:
                System.out.println("Rock🪨");
                break;
            case 1:
                System.out.println("Paper📃");
                break;
            case 2:
                System.out.println("Scissor✂️");
                break;
            default:
                System.out.println("Invalid Choice❌ ");
        }


        System.out.print("\nResults --> ");  // Displaying Results
        if (num == 0 || num == 1 || num == 2) {
            if (num == 0 && random == 2) {
                System.out.println("You Win🏆");
            } else if (num == 2 && random == 0) {
                System.out.println("I Win🏆");
            } else if (num > random) {
                System.out.println("You Win🏆");
            } else if (random > num) {
                System.out.println("I Win🏆");
            } else if (random == num) {
                System.out.println("Tie");
            }
            System.out.println("\n\tThank You for Visiting 😊");

        } else {
            System.out.println("Try Again (Incorrect Choice)");
        }
    }
}
