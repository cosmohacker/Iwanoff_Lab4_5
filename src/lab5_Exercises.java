/*All exercises involve creating a console application. Calculations of the main result should be performed in a separate static function, which is called from the main() function. Input and output are performed in the main() function.

  1  Initialize one-dimensional array of real numbers with a list of initial values. Calculate sum of positive elements.
  2  Initialize one-dimensional array of real numbers with a list of initial values. Calculate sum of second powers of elements.
  3  Initialize one-dimensional array of integer numbers with a list of initial values. Calculate sum of even elements.
  4  Read from keyboard array size and elements of one-dimensional array of integers. Calculate product of odd elements.
  5  Initialize one-dimensional array of real numbers with a list of initial values. Calculate sum of maximum and minimum elements.
  6  Read from keyboard array size and elements of one-dimensional array of integers. Calculate product of maximum and minimum elements.
  7  Initialize one-dimensional array of real numbers with a list of initial values. Replace positive elements with zeros.
  8  Create and fill two-dimensional array of integers with initial values. Calculate product of non-zero elements. Use continue keyword to skip zero elements.
  9  Initialize an array of doubles and then place elements in reverse order without auxiliary array.
 10  Read from keyboard array size and elements of one-dimensional array of integers. Sort array elements in increasing order.
 11  Enter a string and then place its characters in reverse order.
 12  Enter a string and then remove letter "a" from this string.
 13  Initialize one-dimensional array of strings with a list of initial values. Sort items alphabetically.
 14  Create class that represents 3D point.
 15  Create a class with a constructor to represent commodity (name and price should be stored).
 16  Create a class with a constructor to represent user (username and password should be stored).

 */

import utils.Exercises;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.Scanner;
public class lab5_Exercises implements Exercises {

    public static void main(String[] args) {
        initializeAndAsk();
    }

    @Override
    public void exec1() {
        float[] real_numbers = {10, -50, 12.549f, 25, -10, -23, 0, 2.5f, 675, -125};
        float sum = 0;
        for (int i = 0; i < real_numbers.length; i++) {
            if (real_numbers[i] > 0.0)
                sum += real_numbers[i];
        }
        System.out.println("Total sum of real numbers : " + sum);
    }

    @Override
    public void exec2() {
        float[] real_numbers = {10, -50, 12.549f, 25, -10, -23, 0, 2.5f, 675, -125};
        float sumOfPowers = 0;
        for (int i = 0; i < real_numbers.length; i++) {
            System.out.println("Powers of 2 : " + real_numbers[i] * real_numbers[i]);
            sumOfPowers += real_numbers[i] * real_numbers[i];
        }
        System.out.println("Sum of Squares : " + sumOfPowers);
    }

    @Override
    public void exec3() {
        int[] maybeEven = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        int sumOfEvens = 0;
        for (int i = 0; i < maybeEven.length; i++) {
            if (maybeEven[i] % 2 == 0) {
                sumOfEvens += maybeEven[i];
            }
        }
        System.out.println("Sum of Even Elements : " + sumOfEvens);
    }

    @Override
    public void exec4() {
        Scanner scanner = new Scanner(System.in);
        int arrSize = 0;
        System.out.println("Please enter array size : ");
        arrSize = scanner.nextInt();
        int[] numberOfArray = new int[arrSize];
        int productOfOdds = 1, number = 0;
        System.out.println("Please enter " + arrSize + " elements for array : ");
        for (int i = 0; i < numberOfArray.length; i++) {
            number = scanner.nextInt();
            numberOfArray[i] = number;
        }

        for (int i = 0; i < numberOfArray.length; i++) {
            if (numberOfArray[i] % 2 != 0) {
                productOfOdds *= numberOfArray[i];
            }
        }
        System.out.println("Product of Odd Elements : " + productOfOdds);
    }

    @Override
    public void exec5() {
        float[] real_numbers = new float[]{10, -50, 12.549f, 25, -10, -23, 0, 2.5f, 675, -125};
        float min = real_numbers[0], max = real_numbers[0];
        for (int i = 0; i < real_numbers.length; i++) {
            //Compare elements of array with min
            if (real_numbers[i] < min)
                min = real_numbers[i];
            else if (real_numbers[i] > max)
                max = real_numbers[i];
        }
        System.out.println("Minimum element present in given array: " + min);
        System.out.println("Maximum element present in given array: " + max);

        System.out.println("Calculation of Min. Max. Values: " + (max + min));
    }

    @Override
    public void exec6() {
        Scanner scanner = new Scanner(System.in);
        int arrSize = 0;
        System.out.println("Please enter array size : ");
        arrSize = scanner.nextInt();
        int[] numberOfArray = new int[arrSize];
        int min = Integer.MAX_VALUE, max = numberOfArray[0], number = 0;
        System.out.println("Please enter " + arrSize + " elements for array : ");
        for (int i = 0; i < numberOfArray.length; i++) {
            number = scanner.nextInt();
            numberOfArray[i] = number;
        }
        for (int i = 0; i < numberOfArray.length; i++) {
            if (numberOfArray[i] < min)
                min = numberOfArray[i];
            else if (numberOfArray[i] > max)
                max = numberOfArray[i];
        }
        System.out.println("Minimum element present in given array: " + min);
        System.out.println("Maximum element present in given array: " + max);
        System.out.println("Calculation of Min. Max. Values: " + (max * min));
    }

    @Override
    public void exec7() {
        float[] real_numbers = new float[]{10, -50, 12.549f, 69, -10, -23, 0, 2.5f, 675, -125};
        System.out.println("Before replacing positive elements with zeros : ");
        for (int i = 0; i < real_numbers.length; i++) {
            System.out.println(real_numbers[i]);
            if (real_numbers[i] > 0)
                real_numbers[i] = -real_numbers[i];
        }
        System.out.println("After replacing positive elements with zeros : ");
        for (int i = 0; i < real_numbers.length; i++) {
            System.out.println(real_numbers[i]);
        }
    }

    @Override
    public void exec8() {
        int[][] arr = {{1, 2, 3, 4, 0, 5}, {3, 0, 4, 8, 9, 2}};
        int productOfValues = 1;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                if (arr[i][j] == 0) {
                    continue;
                }
                productOfValues *= arr[i][j];
            }
        }
        System.out.println(productOfValues);
    }

    @Override
    public void exec9() {
        double[] reverse = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        for (int i = 0; i < reverse.length / 2; i++) {
            double temp = reverse[i];
            reverse[i] = reverse[reverse.length - i - 1];
            reverse[reverse.length - i - 1] = temp;
        }

        for (double v : reverse) {
            System.out.println(v);
        }
    }

    @Override
    public void exec10() {
        Scanner scanner = new Scanner(System.in);
        int arrSize = 0;
        System.out.println("Please enter array size : ");
        arrSize = scanner.nextInt();
        int[] numberOfArray = new int[arrSize];
        int number = 0;
        System.out.println("Please enter " + arrSize + " elements for array : ");
        for (int i = 0; i < numberOfArray.length; i++) {
            number = scanner.nextInt();
            numberOfArray[i] = number;
        }

        Arrays.sort(numberOfArray);

        for (int i = 0; i < numberOfArray.length; i++) {
            System.out.println(numberOfArray[i]);
        }
    }

    @Override
    public void exec11() {
        Scanner scanner = new Scanner(System.in);
        String willReverse, nstr = "";
        char ch;

        System.out.print("Please type a word : ");

        willReverse = scanner.nextLine();

        System.out.print("Original word: ");
        System.out.println(willReverse); //Example word

        for (int i = 0; i < willReverse.length(); i++) {
            ch = willReverse.charAt(i); //extracts each character
            nstr = ch + nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: " + nstr);
    }

    @Override
    public void exec12() {
        String delet_dis = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. aliquam cursus sagittis tortor, sit amet finibus diam interdum eget.", already_delet = delet_dis.replace("a", "");
        System.out.println(delet_dis);
        System.out.println(already_delet);
    }

    @Override
    public void exec13() {
        String[] alph = {"Alex", "Charles", "Dean", "Amanda", "Brian"};
        alph = Stream.of(alph)
                .sorted()
                .toArray(String[]::new);
        // Sorted array
        System.out.println("Sorted : " + Arrays.toString(alph));
    }

    private static void initializeAndAsk() {
        lab5_Exercises lab5_exercises = new lab5_Exercises();
        System.out.println("Please choose exercise number between 1-13 : ");
        Scanner scanner = new Scanner(System.in);
        String number;
        number = scanner.nextLine();

        switch (number) {
            case "1":
                lab5_exercises.exec1();
                break;
            case "2":
                lab5_exercises.exec2();
                break;
            case "3":
                lab5_exercises.exec3();
                break;
            case "4":
                lab5_exercises.exec4();
                break;
            case "5":
                lab5_exercises.exec5();
                break;
            case "6":
                lab5_exercises.exec6();
                break;
            case "7":
                lab5_exercises.exec7();
                break;
            case "8":
                lab5_exercises.exec8();
                break;
            case "9":
                lab5_exercises.exec9();
                break;
            case "10":
                lab5_exercises.exec10();
                break;
            case "11":
                lab5_exercises.exec11();
                break;
            case "12":
                lab5_exercises.exec12();
                break;
            case "13":
                lab5_exercises.exec13();
                break;
        }


    }

}
