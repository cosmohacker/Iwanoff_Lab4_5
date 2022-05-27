/*1.2 Sieve of Eratosthenes

Fill an array of 300 elements with consecutive positive integer numbers. Replace all non-prime numbers with some negative value. To do this, consistently exclude all numbers that are divisors of other numbers. Print all remaining positive values (prime numbers).

Do not use division and getting the remainder of the division in the program.*/

public class lab1_2 {

    private static int[] numbers;

    public static void main(String[] args) {
        methodCleaner();
    }

    private static void methodCleaner() {
        utils();
        insertArrayElements();
    }

    private static void utils() {
        numbers = new int[300];
    }


    private static void insertArrayElements() {

        int counter = 0;

        for (int i = 0; i < 300; i++) {
            numbers[i] = i;
        }

        for (int x = 1; x < 300; x++) {
            counter = 0;
            for (int j = 1; j <= numbers[x]; j++) {
                if ((numbers[x] % j) == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                //Print all remaining positive values (prime numbers).
                System.out.println(numbers[x] + " Prime Number");
            }else
                //Replace all non-prime numbers with some negative value
                numbers[x] = -numbers[x];

        }

    }

}
