package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Instructions: Paste in your text(Ctrl-v). Maximum is 10 paragraphs. Press the 'Enter' button until the next prompt.");

        System.out.println("**********************************************************");

        System.out.println("Type or paste in your text(Ctrl-V):");


        String text = String.join("\n", scanner.nextLine(), scanner.nextLine(), scanner.nextLine(),
                scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(),
                scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(),
                scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(),
                scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(),
                scanner.nextLine());


        String[] splitText = text.split("\\s+");

        System.out.println("**********************************************************");

        System.out.println("Enter the word you want to count: ");

        String word = scanner.next();

        int count = 0;


        for (String s : splitText) {
            if (s.toLowerCase().contains(word.toLowerCase())) {
                count++;
            }

        }


        System.out.println("The word '" + word + "' appears " + count + " times.");


    }
}

