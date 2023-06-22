package javaAdvancedConcepts.commonTypes.scannerExample;

import java.util.Scanner;

public class Scan {
    public Scan() {
    }

    public static void main(String[] args) {
        boolean keepRunning = true;

        try (Scanner scanner = new Scanner(System.in)){
                while (keepRunning)
                        try {
                    System.out.println("Snacks for the break");
                    System.out.println("1. Fruit ");
                    System.out.println("2. Chips ");
                    System.out.println("3. Candy ");
                    System.out.println("Please select your selection");
                    int selection = Integer.parseInt(scanner.nextLine());

                    if (selection == 1) {
                        System.out.println("Fruit");
                        keepRunning = false;
                    } else if (selection == 2) {
                        System.out.println("Chips");
                        keepRunning = false;
                    } else if (selection == 3) {
                        System.out.println("Candy");
                        keepRunning = false;
                    } else {
                        System.out.println("Please enter the number between 1 to 3 : ");
                    }
                } catch (Exception ex) {
                    System.out.println("Error - Invalid input");
                }
            }
    }
}

