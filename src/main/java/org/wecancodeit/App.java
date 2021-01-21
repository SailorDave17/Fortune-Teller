package org.wecancodeit;

import java.util.Scanner;

class FortuneTellerApp {


    public static void main(String[] args) {
        System.out.println("Welcome to the fortune teller app!");
        System.out.println("What is your first name?");
        String firstName;
        Scanner inputScanner = new Scanner(System.in);

        firstName = inputScanner.nextLine();
        System.out.println("You entered " + firstName);

        System.out.println("What is your last name?");
        String lastName = inputScanner.nextLine();
        System.out.println("You entered " + lastName);

        System.out.println("How old are you?");
        int age = inputScanner.nextInt();
        System.out.println("You entered " + age);


        System.out.println("What month were your born? (please give me the number of the month)");
        int birthMonth = inputScanner.nextInt();
        inputScanner.nextLine();
        System.out.println("You entered " + birthMonth);

        System.out.println("what is your favorite ROYGBIV color? If you dont know what ROYGBIV means, enter \"HELP\"");
        String favoriteColor = inputScanner.nextLine();
        if (favoriteColor.equalsIgnoreCase("HELP")) {
            System.out.println("ROYGBIV stands for RED, ORANGE, YELLOW, GREEN, BLUE INDIGO, VIOLET");
            favoriteColor = inputScanner.nextLine();
        }


        System.out.println("You entered " + favoriteColor);

        System.out.println("How many siblings do you have?");
        int howManySiblings = inputScanner.nextInt();
        System.out.println("You entered " + howManySiblings);

        int yearsUntilRetirement;

        if (age % 2 == 0) {
            yearsUntilRetirement = 20;
        } else {
            yearsUntilRetirement = 16;
        }


        String vacationHomeLocation;
        if (howManySiblings == 0) {
            vacationHomeLocation = "in Cleveland, OH";
        } else if (howManySiblings == 1) {
            vacationHomeLocation = "on a Royal Caribean Cruise Ship";
        } else if (howManySiblings == 2) {
            vacationHomeLocation = "in Belize";
        } else if (howManySiblings == 3) {
            vacationHomeLocation = "in Hawaii";
        } else if (howManySiblings > 3) {
            vacationHomeLocation = "in Northern Michigan";
        } else {
            vacationHomeLocation = "nowhere";
        }



        String kindOfCar = "";

        switch (favoriteColor.toLowerCase()) {
            case "red":
                kindOfCar = "Corvette";
                break;
            case "orange":
                kindOfCar = "Ford Explorer";
                break;
            case "yellow":
                kindOfCar = "Yugo";
                break;
            case "green":
                kindOfCar = "Lincoln Navigator";
                break;
            case "blue":
                kindOfCar = "Ferrari";
                break;
            case "indigo":
                kindOfCar = "Lexus LX";
                break;
            case "violet":
                kindOfCar = "Honda Civic";
                break;
            default:
                kindOfCar = "Rusty Bike";
        }


        double bankBalance = 0.00;

        if (birthMonth >= 1 && birthMonth <= 4) {
            bankBalance = 10000000;
        } else if (birthMonth >= 5 && birthMonth <= 9) {
            bankBalance = 75000.69;
        } else if (birthMonth >= 10 && birthMonth <= 12) {
            bankBalance = 25000;
        }


        System.out.println(firstName + " " + lastName + " will retire in " + yearsUntilRetirement + " years. Will vacation " + vacationHomeLocation + ". Will drive a " + kindOfCar + ". Will have $" + bankBalance + " in the bank.");
    }

}
