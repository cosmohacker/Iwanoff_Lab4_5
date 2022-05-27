/*1.4 Alignment of a String

Read string from command line and then add spaces until string length will be equal to a given value. Spaces must be even added at the beginning and at the end of string.*/

import java.util.Scanner;

public class lab1_4 {

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

        addSpaces(userInput);
        System.out.println(userInput);
        addSpaces(userInput);

    }

    private static void addSpaces(String input){
        int spaceCount = input.length();
        for (int i = 0 ; i <spaceCount ;i++){
            System.out.println(" ");
        }
    }


}
