/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summative;

import java.util.Scanner;

/**
 *
 * @author ethan
 */
public class Summative {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int wins = 0;
        int losses = 0;
        int draws = 0;  
        while (true){
        int Choice;
        int max = 3; 
        int min = 1; 
        int range = max - min + 1; 
        int random = (int)(Math.random() * range) + min;
        Scanner keyedInput=new Scanner(System.in);
        System.out.println("Choose one");
        System.out.println("1:Rock");
        System.out.println("2:Paper");
        System.out.println("3:Scissors");
        Choice = keyedInput.nextInt();
        switch (random){
            case 1:
                System.out.println("They chose rock!");
                switch (Choice){
                    case 1:
                        System.out.println("Draw!");
                        draws = draws + 1;
                        break;
                    case 2:
                        System.out.println("Win!");
                        wins = wins + 1;
                        break;
                    case 3:
                        System.out.println("Lose...");
                        losses = losses + 1;
                    break;
                }
                break;
            case 2: 
                System.out.println("They chose Paper!");
               switch (Choice){
                    case 1:
                        System.out.println("Lose...");
                        losses = losses + 1;
                        break;
                    case 2:
                        System.out.println("Draw!");
                        draws = draws + 1;
                        break;
                    case 3:
                        System.out.println("Win!");
                        wins = wins + 1;
                        break;
                }
                    break;
            case 3:
                System.out.println("They chose scissors!");
                switch (Choice){
                    case 1:
                        System.out.println("Win!");
                        wins = wins + 1;
                        break;
                    case 2:
                        System.out.println("Lose...");
                        losses = losses + 1;
                        break;
                    case 3:
                        System.out.println("Draw!");
                        draws = draws + 1;
                        break;
                }
                break;
                     
        }
        System.out.println("Wins:"+ wins +"");
        System.out.println("Draws:"+ draws +"");
        System.out.println("Losses:"+ losses +"");
      }
    }
}
