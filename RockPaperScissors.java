package com.company;
import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        // 0 for Rock
        // 1 for Paper
        // 2 for Scissor

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter : \n 0 for Rock. \n 1 for Paper. \n 2 for Scissor. \n");
        int userInput = sc.nextInt();

        if (userInput < 0 || userInput > 2) {
            System.out.println("Invalid choice. Please enter a number between 0 and 2.");
            
        }

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if (userInput == computerInput) {
            System.out.println("Draw!");
        }else if(userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1){
            System.out.println("You won!");
        }else{
            System.out.println("Computer Won!");
        }
        // System.out.println("Computer chooses: " +computerInput);
        if(computerInput == 0){
            System.out.println("Computer Choice: Rock ");
        }else if(computerInput == 1){
            System.out.println("Computer Choice: Paper ");
        }else{
            System.out.println("Computer Choice: Scissor ");
        }
        if(userInput == 0){
            System.out.println("Your Choice: Rock ");
        }else if(userInput == 1){
            System.out.println("Your Choice: Paper ");
        }else{
            System.out.println("Your Choice: Scissor ");
        }

        sc.close();
    }
}
