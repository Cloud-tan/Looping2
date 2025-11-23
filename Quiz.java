import java.util.Scanner;
import java.util.Random;

public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        char menu = 'y';
        do {
            int num = rand.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.println("Guess a number between 1 and 10:");
                int answer = input.nextInt();
                input.nextLine(); 
                success = (answer == num);

                if (answer < 1 || answer > 10) {
                    System.out.println("Please enter a number within the range of 1 to 10.");
                    continue;
                }
                    
                if (!success) {
                    if (answer < num) {
                        System.out.println("Your guess is too smaller than the answer.");
                    } else {
                        System.out.println("Your guess is too greater than the answer.");
                }
            }
        } while (!success);

            System.out.println("~~~Congratulations! You guessed the correct number: " + num + "~~~");
            System.out.println("Do you want to repeat the game? (y/n)");
            menu = input.nextLine().charAt(0);
        } while (menu == 'y');
        System.out.println("Thank you for playing!");
        input.close();
        }
    }

