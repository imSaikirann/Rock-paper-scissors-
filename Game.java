package com.company;
import java.util.Random;
import java.util.Scanner;


public class Game {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Let's play ROCK PAPER & SCISSOR \n0 for Rock\n1 for paper\n2 for scissor");
        System.out.print("Enter your Choice:-");
        int myinput = sc.nextInt();

        Random random = new Random();
        int CompInput = random.nextInt(3);

        if (myinput == CompInput) {
            System.out.println("DRAW!!");
        } else if (myinput == 0 && CompInput == 2 || myinput == 2 && CompInput == 1 || myinput == 1 && CompInput == 0) {
            System.out.println("YOU WON:)");
        } else {
            System.out.println("OPPONENT win:(");

        }
        System.out.println("Computer input:-"+CompInput);
        if (CompInput==1)
        {
            System.out.println("Computer choice is ROCK");
        }
        else if(CompInput==1)
        {
            System.out.println("Computer choice is PAPER");
        }
        else if (CompInput==2)
        {
            System.out.println("Computer choice is SCISSOR" );
        }

    }
}
