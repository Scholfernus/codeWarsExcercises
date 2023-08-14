package org.example.w3resource.com.array;

import java.util.Arrays;

public class FindAllPairsOfElementsInArray {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 45, 6, 4, 9, -12, 5, 12, 16, 11, 3, 7, 8, 100, -3, 6, 4, 2, 15};
        System.out.println(Arrays.toString(numbers));
        findPairs(8,numbers);
    }

    public static void findPairs(int target, int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    System.out.print("Suma liczb " + numbers[i] + " oraz "
                            + numbers[j] + " to  " + target + "\n");
                }
            }
        }
    }
}
class Exercise22 {
    static void  pairs_value(int inputArray[], int inputNumber)
    {
        System.out.println("Pairs of elements and their sum : ");

        for (int i =  0; i < inputArray.length; i++)
        {
            for (int j  = i+1; j < inputArray.length; j++)
            {
                if(inputArray[i]+inputArray[j] == inputNumber)
                {
                    System.out.println(inputArray[i]+" + "+inputArray[j]+" =  "+inputNumber);
                }
            }
        }
    }

    public static void  main(String[] args)
    {
        pairs_value(new int[] {2, 7, 4, -5, 11, 5, 20}, 15);

        pairs_value(new int[] {14, -15, 9, 16, 25, 45, 12, 8}, 30);

    }
}