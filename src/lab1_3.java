/*1.3 Finding Fibonacci Numbers

Implement a function for computing of Fibonacci numbers (up to the 92nd integer) using an auxiliary array (static field). The function parameter should be Fibonacci number's index. The search for Fibonacci numbers is carried out according to the following rule:
F(1) = F(2) = 1; F(n) = F(n - 2) + F(n - 1)

At the first call, the array is filled until the required number. At subsequent calls, the number either returns from the array, or is calculated using the last two numbers stored in an array. Use the long type to represent numbers.

Perform function testing for different values of numbers entered in an arbitrary order.*/

import java.util.Scanner;

public class lab1_3 {

    private static long[] fIndex;
    private static Scanner scan;
    private static int _fib;

    public static void main(String[] args) {
        methodCleaner();
    }

    private static void methodCleaner() {
        utils();
        calculateFibonacci();
    }

    private static void utils() {
        scan = new Scanner(System.in);
    }

    public static void calculateFibonacci() {

        System.out.println("Please enter a number for calculate fibonacci index : ");
        _fib = scan.nextInt();

        // Print first 10 term
        for (int i = 0; i <= _fib; i++)
            System.out.print("F(" + i + ") = " +fibonacci(i) + "\n ");
    }

    // Function to find the fibonacci Series
    public static long fibonacci(int n) {

        fIndex = new long[n + 2];

        int i;

        fIndex[0] = 0;
        fIndex[1] = 1;

        for (i = 2; i <= n; i++) {
            //F(1) = F(2) = 1; F(n) = F(n - 2) + F(n - 1)
            fIndex[i] = fIndex[i - 2] + fIndex[i - 1];
        }
        return fIndex[n];
    }


}
