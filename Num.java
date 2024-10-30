import java.util.Scanner;  

public class Num{  
    public static void numgame() {  
        Scanner scanner = new Scanner(System.in);  
        int rand = 1 + (int)(100 * Math.random());  
        int max = 5;  
        int points=10;
        int attempts, guess;  
        System.out.println("Welcome to the Number Game");  
        System.out.println("A number has been chosen between 1 and 100");  
        System.out.println("Your task is to guess the randomly generated number within 5 attempts");  
        for (attempts = 0; attempts < max; attempts++) {  
            System.out.println("Attempt " + (attempts + 1) + ": Enter your guess:");  
            guess = scanner.nextInt();
            points=points-2;  
            if (rand == guess) {  
                System.out.println("Congratulations! You've guessed the correct number.");  
                break;  
            } 
            else if (rand > guess && attempts != max - 1) {  
                System.out.println("The number is greater than your guess.");  
            } else if (rand < guess && attempts != max - 1) {  
                System.out.println("The number is less than your guess.");  
            }  
        } 
        System.out.println("You won "+points+" points");
        if (attempts == max) {  
            System.out.println("Maximum attempts reached...");  
            System.out.println("The random number is " + rand);   
        }  
        scanner.close(); 
    }  
    public static void main(String args[]) {  
        numgame();  
      
    }  
}  
