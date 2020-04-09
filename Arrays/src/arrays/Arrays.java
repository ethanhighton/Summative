/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author ethan
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int [] marks = new int[5];
        int average;
        int total = 0;
        System.out.println("Please Enter the marks of the last 5 assignments you have completed ");
        for (int i=0;i<5;i++){
        marks[i]=input.nextInt();
    }
        for (int i=0;i<marks.length;i++){
            total= total + marks[i];
        }
        average = total / 5;
        System.out.println("Your average is ");
        System.out.println(average);
    }
    
}
