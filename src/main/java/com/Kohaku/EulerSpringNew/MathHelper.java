package com.Kohaku.EulerSpringNew;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MathHelper {

    /**
     * Generates a list containing the first N prime numbers.
     *
     * @param primeNumberCount The total number of prime numbers to find.
     * @return A List of the first {@code primeNumberCount} prime numbers.
     */
    public List<Long> getPrimeNumbers(int primeNumberCount) {
        List<Long> primeNumbers = new ArrayList<>();
        long candidateNumber = 2;

        while (primeNumbers.size() < primeNumberCount) {
            if (isPrimeNumber(candidateNumber)) {
                primeNumbers.add(candidateNumber);
            }
            candidateNumber++;
        }
        return primeNumbers;
    }

    /**
     * Generates a list of all prime numbers up to a specified upper limit.
     *
     * @param primeNumberUpperLimit The maximum number (inclusive) to check for primality.
     * @return A {@link List} of all prime numbers less than or equal to the {@code primeNumberUpperLimit}.
     */
    public List<Long> getPrimeNumbers(long primeNumberUpperLimit) {
        List<Long> primeNumbers = new ArrayList<>();
        long candidateNumber = 2;

        while (candidateNumber <= primeNumberUpperLimit) {
            if (isPrimeNumber(candidateNumber)) {
                primeNumbers.add(candidateNumber);
            }
            candidateNumber++;
        }
        return primeNumbers;
    }

    /**
     * Checks if a given number is prime using the trial division method.
     *
     * @param testNumber The number to test for primality.
     * @return {@code true} if the number is prime, {@code false} otherwise.
     */
    public boolean isPrimeNumber(long testNumber) {
        if (testNumber < 2) return false;

        for (long x = 2L; x * x <= testNumber; x++) {
            if (testNumber % x == 0)
                return false;
        }
        return true;
    }

    /**
     * Calculates the product of all digits within a string.
     *
     * @param numbers The string of digits whose product is to be calculated (e.g., "482").
     * @return The product of all digits as a {@code long}. Returns 0 if the string contains a '0'.
     */
    public long getProductOfNumbers(String numbers) {
        long product = 1;
        for (int x = 0; x < numbers.length(); x++) {
            int digit = Character.getNumericValue(numbers.charAt(x)); //get number as int at index x

            if (digit == 0) {
                return 0;
            }

            product *= digit;
        }
        return product;
    }

    /**
     * Calculates the sum of the squares of the first 100 natural numbers.
     *
     * This method computes the value of the expression: 1² + 2² + 3² + ... + 100².
     *
     * @return The integer result of the sum of squares.
     */
    public int getSumOfSquares() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i * i;
        }
        return sum;
    }

    /**
     * Calculates the square of the sum of the first 100 natural numbers.
     *
     * It computes the value of: (1 + 2 + 3 + ... + 100)².
     *
     * @return The integer result of the square of the sum.
     */
    public int getSquareOfSum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum * sum;
    }
}
