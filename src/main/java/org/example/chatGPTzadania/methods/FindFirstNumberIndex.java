package org.example.chatGPTzadania.methods;

public class FindFirstNumberIndex {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9, -4};
        int target = 7;
        int index = findFirstIndex(numbers, target);
        System.out.println("Indeks pierwszego wystąpienia liczby " + target + " to: " + index);
    }
    public static int findFirstIndex(int[] numbers, int target){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]==target){
               return i;
            }
        }
        return -1;
    }
}
