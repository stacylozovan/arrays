package nl.saxion.iad.arrayBasics;

import nl.saxion.app.SaxionApp;

public class ArrayBasicsMain implements Runnable {

    public void run() {
        int[] numbers = new int[]{1, 2, 4, 7, 11, 16};
        int newNumber = numbers[1] * numbers[5];

        // 1. Print the result of multiplying the 2nd and 6th number from the numbers array
        SaxionApp.printLine("The result of multiplying the 2nd and 6th number is: " + newNumber);

        // 2. Implement the sumOfArray method to show the result of adding all numbers together
        SaxionApp.printLine("The sum of the array is: " + sumOfArray(numbers));

        // 3. Transform numbers: even numbers are divided by 2, odd numbers are multiplied by 3
        int[] secondArray = new int[]{1, 2, 4, 7, 11, 16, 20};
        int[] transformedArray = new int[secondArray.length];
        int sum = 0;

        for (int i = 0; i < secondArray.length; i++) {
            if (secondArray[i] % 2 == 0) {  // If even, divide by 2
                transformedArray[i] = secondArray[i] / 2;
            } else {  // If odd, multiply by 3
                transformedArray[i] = secondArray[i] * 3;
            }
            sum += transformedArray[i];  // Add transformed values to sum
        }

        // Print the sum of transformed array
        SaxionApp.printLine("The sum of transformed numbers is: " + sum);

        // 4. Remove the second element from numbers array
        numbers = removeElementFromArray(numbers, 1); // Corrected syntax
        SaxionApp.printLine("The sum of numbers array after removing the second element is: " + sumOfArray(numbers));
    }

    /**
     * Sums all numbers in the originalArray and returns the result
     * @param originalArray The array to sum
     * @return The sum of all elements in the array
     */
    public static int sumOfArray(int[] originalArray) {
        int sum = 0;
        for (int i = 0; i < originalArray.length; i++) {
            sum += originalArray[i];
        }
        return sum;
    }

    /**
     * Returns a new array based on the originalArray, but with the specified element removed.
     * @param originalArray The original array
     * @param element The index of the element that should be removed
     * @return A new array with the element removed
     */
    public static int[] removeElementFromArray(int[] originalArray, int element) {
        if (element < 0 || element >= originalArray.length) {
            throw new IllegalArgumentException("Invalid index: " + element);
        }

        int[] result = new int[originalArray.length - 1]; // New array with one less element
        int j = 0; // Index for the result array

        for (int i = 0; i < originalArray.length; i++) {
            if (i == element) {
                continue; // Skip the element to remove
            }
            result[j++] = originalArray[i]; // Copy remaining elements
        }

        return result;
    }

    public static void main(String[] args) {
        SaxionApp.start(new ArrayBasicsMain(), 1024, 768);
    }
}
