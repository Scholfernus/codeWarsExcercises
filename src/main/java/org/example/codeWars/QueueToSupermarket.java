package org.example.codeWars;

public class QueueToSupermarket {
    public static void main(String[] args) {
        System.out.println(solveSuperMarketQueue(new int[]{2, 2, 3, 3, 4, 4}, 2));
    }

    public static int solveSuperMarketQueue(int[] customers, int n) {
        int[] queues = new int[n];
        for (int customer : customers) {
            int minIndex = getMinIndex(queues);
            queues[minIndex] += customer;
        }

        return getMaxValue(queues);
    }

    private static int getMinIndex(int[] arr) {
        int minIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        return minIndex;
    }

    private static int getMaxValue(int[] arr) {
        int maxValue = Integer.MIN_VALUE;

        for (int value : arr) {
            if (value > maxValue) {
                maxValue = value;
            }
        }

        return maxValue;
    }
}
