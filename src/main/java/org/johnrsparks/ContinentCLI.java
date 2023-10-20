package org.johnrsparks;

import java.util.Scanner;

public class ContinentCLI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxAttempts = 3;
        int numOfAttempts = 0;


            System.out.println("*******************************************************");
            System.out.println(" ");
            System.out.println("        Welcome to the continent-city info center, ");
            System.out.println("             where you provide us a continent, ");
            System.out.println("and we provide you the largest city* for said continent");
            System.out.println(" ");
            System.out.println("      * Data provided referenced from 2021 results.");
            System.out.println(" ");
            System.out.println("********************************************************");
        while (numOfAttempts < maxAttempts){
            System.out.println("Please enter a continent name: ");
            String continentName = scanner.nextLine();

            Continent continentInfo = new Continent();
            continentInfo.setCity(continentName);

            String cityName = continentInfo.getCity();

            if (cityName.equals("Undefined continent!")){
                numOfAttempts++;
                System.out.println("Hmm, I don't believe that's a continent. Please check your input and try again.");
                System.out.println("You have " + (maxAttempts - numOfAttempts) + " tries left!");
            } else {
                System.out.println("The largest city in " + continentName + " is: " + cityName + "!");
                break;
            }
        }

        if (numOfAttempts >= maxAttempts){
            System.out.println("You've exceeded the maximum number of attempts. Goodbye!");
        }


    }
}
