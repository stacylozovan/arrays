package nl.saxion.iad.arrayBasics;


import nl.saxion.app.SaxionApp;

public class ArrayBasicsMain implements Runnable{

    public void run(){
        int[] numbers = new int[]{1,2,4,7,11,16};
        int newNumber = numbers[1] * numbers[5];

        //TODO: 1. print the result of multiplying the 2nd and 6th number from the numbers array
        SaxionApp.printLine("The result of multiplying the 2nd and 6th number is: " + newNumber);



        //2. Implement the sumOfArray method to show the result of adding all numbers together
        SaxionApp.printLine("The sum of the : "+ sumOfArray(numbers));



        //3. Initialize a new array that stores the same numbers as the numbers array,
        // but each even number is divided by 2 and each odd number is multiplied by 3.
        // Then print the sum of all numbers in the second array
        int[] secondArray = {1, 2, 4, 7, 11, 16, 20};
        int[] transformedArray = new int[secondArray.length];  // Store modified values
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
    }

    //TODO: implement




        //4. Extra challenge: Implement the 'removeElementFromArray' method.
        // Again after removing the second element, print the result of adding all remaining numbers together
        numbers[] = removeElementFromArray(numbers, 1);
        SaxionApp.print("The sum of numbers array after removing the second element is: ");
        SaxionApp.printLine(sumOfArray(numbers));





    /**
     * sums all numbers in the originalArray and returns the result
     * @param originalArray
     * @return
     */
    public static int sumOfArray(int[] originalArray){
        int sum = 0;
        for (int i=0;i<originalArray.length;i++){
            sum += originalArray[i];
        }
        return sum;
    }


    /**
     * Returns a new array based on the originalArray, but the 'element' is removed
     * @param originalArray the original array
     * @param element the index of the element that should be removed
     * @return
     */
    public static int[] removeElementFromArray(int[] originalArray, int element){
        int[] result = new int[originalArray.length-1];
        for (int i=0;i<originalArray.length;i++){
            if (originalArray[i] == element){
               originalArray.
            }
        }

        return result;
    }


    public static void main(String[] args) {
        SaxionApp.start(new ArrayBasicsMain(), 1024, 768);
    }
}
