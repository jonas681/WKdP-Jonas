package ExerciseSheet1;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int numberToGuess = (int)(Math.random()*20)+1;
        Scanner sc = new Scanner(System.in);
        boolean guessed = false;
        int tries = 1;

        for(int i= 0; i<6; i++){
            if (numberToGuess > sc.nextInt()){
                System.out.println("To Low");

            }if (numberToGuess < sc.nextInt()){
                System.out.println("To Low");
            }if (numberToGuess == sc.nextInt()){
                System.out.println("Win!!!");
            }if(i == 5){
                System.out.println("Lose :(");
            }
        }
    }

}
