/*1.6 Quadratic Equation

Create a class for solving quadratic equation. Provide an analysis of all possible combinations of coefficients and corresponding results (two roots, one root, if there is a linear equation, no solutions, the infinite number of roots). The method of finding the roots (solve ()) should return the number of roots (-1 if there is an infinite number of roots). Getters for roots (x1 and x2) should return values only if the source data were entered and roots were found.*/

import java.util.Scanner;

public class lab1_6 {

    private static String userInput;
    private static double a, b, c;
    private static Scanner scan;

    public static void main(String[] args) {
        methodCleaner();
    }

    private static void methodCleaner() {
        utils();
        solveQuadric();
        findRoot();
    }

    private static void utils() {
        scan = new Scanner(System.in);
    }

    private static void solveQuadric() {

        System.out.print("Input a: ");
        a = scan.nextDouble();
        System.out.print("Input b: ");
        b = scan.nextDouble();
        System.out.print("Input c: ");
        c = scan.nextDouble();

        double result = b * b - 4.0 * a * c;

        if (result > 0.0) {
            double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        } else if (result == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }

    private static void findRoot() {

        double root1, root2;

        // calculate the determinant (b2 - 4ac)
        double determinant = b * b - 4 * a * c;

        // check if determinant is greater than 0
        if (determinant > 0) {

            // two real and distinct roots
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);

            System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
        }

        // check if determinant is equal to 0
        else if (determinant == 0) {

            // two real and equal roots
            // determinant is equal to 0
            // so -b + 0 == -b
            root1 = root2 = -b / (2 * a);
            System.out.format("root1 = root2 = %.2f;", root1);
        }

        // if determinant is less than zero
        else {
            // roots are complex number and distinct
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-determinant) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }
    }


}
