/*1.5 Abbreviation

Enter a string of several words from the keyboard. Create a new string consisting of the first letters of words with the converting these letters to uppercase.*/

import java.util.Scanner;

public class lab1_5 {

    private static String userInput;
    private static Scanner scan;

    public static void main(String[] args) {
        methodCleaner();
    }

    private static void methodCleaner() {
        utils();
        readString();
    }

    private static void utils() {
        scan = new Scanner(System.in);
    }

    private static void readString(){
        System.out.println("Please enter string value : ");
        userInput = scan.nextLine();

        uppendString(userInput);
    }

    private static void uppendString(String input){
        //First letter upper
        String capFirst = input.substring(0, 1).toUpperCase() + input.substring(1);
        System.out.println(capFirst);

        //Full Upper
        System.out.println(input.toUpperCase());
    }


}
