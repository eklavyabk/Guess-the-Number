import java.util.Random;
import java.util.Scanner;

class NumberGuessingGame{
    private int randomNumber;
    private int playerNumber;
    private int attempt;

    public NumberGuessingGame(){
        Random random=new Random();
        randomNumber=random.nextInt(101);
        attempt=0;
    }
     public void game(){
         System.out.println("--------Welcome to the Game-------");
         System.out.println("Guess any Number between 1 to 100");

         while(true){
             Scanner sc = new Scanner(System.in);
             System.out.print("Please Enter your Number: ");
             playerNumber=sc.nextInt();
             attempt++;

             if(playerNumber<randomNumber) {
                 System.out.println("Too Low. Try guessing a higher Number than "+playerNumber);
             } else if (playerNumber>randomNumber) {
                 System.out.println("Too High. Try guessing a lower Number than "+playerNumber);
             }else{
                 System.out.println("Yipee, you guessed the number in "+attempt+" attempts. Congratulations!!!");
                 break;
             }
         }
         System.out.println("Thanks for playing the game");
     }
}

public class Main {
    public static void main(String[] args) {
        NumberGuessingGame NGS = new NumberGuessingGame();
        NGS.game();
    }
}
