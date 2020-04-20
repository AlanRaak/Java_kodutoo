import java.util.Random;
import java.util.Scanner;
class Kodutöö2 {

    private static int moneySpent = 0;
    private static Scanner in = new Scanner(System.in);
    private static int theNumber = new Random().nextInt((1000000 - 0) + 1) + 0;

    private static void setup(){
        System.out.println("Want to win a million dollars?\n" +
                "If so, guess the winning number (a number between 0 and 100000).");
    }

    private static String askToGuess(){
        System.out.println("Insert $1.00 and enter your number or 'q' to quit:");
        String guess = in.nextLine();
        return guess;
    }
    private static String askToHint(){
        System.out.println("Sorry, good guess, but not quite right. Do you want me to give you a hint (y|n)?");
        String answer = in.nextLine();
        return answer;
    }

    private static void giveHint(int a){
        moneySpent += 2;
        System.out.println("Insert $2.00 for the hint!");
        if (a > theNumber){
            System.out.println("Your number is too high!");
        }else{
            System.out.println("Your number is too low!");
        }
    }

    private static Boolean compare(int guess){
        return theNumber == guess;
    }

    public static void main(String args[]) {
        setup();
        while (true){
            String guess = askToGuess();
            if (guess.equals("q")){
                System.out.println(String.format("You lost $%d.00. Thanks for playing. Come again!", moneySpent));
                break;
            }else{
                moneySpent += 1;
                int guessedValue = Integer.parseInt(guess);
                if (compare(guessedValue)){
                    System.out.println("YOU WIN!");
                    break;
                }else{
                    String answer = askToHint();
                    if (answer.equals("y")){
                        giveHint(guessedValue);

                    }
                }
            }
        }
    }
}

