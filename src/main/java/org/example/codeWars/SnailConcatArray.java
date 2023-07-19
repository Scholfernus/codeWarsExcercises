package org.example.codeWars;


import java.util.Arrays;
// Biorąc pod uwagę n x ntablicę, zwróć elementy tablicy ułożone od
// najbardziej zewnętrznych elementów do środkowego elementu, poruszając
// się zgodnie z ruchem wskazówek zegara.


public class SnailConcatArray {
    public static int[] snail(int[][] array) {
        if (array.length == 0 || array[0].length == 0) {
            return new int[0];
        }
        int n = array.length;
        int[] result = new int[n * n];
        int index = 0;

        int rowStart = 0, rowEnd = n - 1;
        int colStart = 0, colEnd = n - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int i = colStart; i <= colEnd; i++) {
                result[index++] = array[rowStart][i];
            }
            rowStart++;
            for (int i = rowStart; i <= rowEnd; i++) {
                result[index++] = array[i][colEnd];
            }
            colEnd--;
            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    result[index++] = array[rowEnd][i];
                }
                rowEnd--;
            }
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    result[index++] = array[i][colStart];
                }
                colStart++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(snail(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})));
    }
}

//  public static int[] snail(int[][] array) {
//      if (array[0].length == 0) return new int[0];
//      int n = array.length;
//      int[] answer = new int[n*n];
//      int index=0;
//      for (int i = 0; i<n/2; i++){
//        for (int j = i; j < n-i; j++) answer[index++] = array[i][j];
//        for (int j = i+1; j < n-i; j++) answer[index++] = array[j][n-i-1];
//        for (int j = i+1; j < n-i; j++) answer[index++] = array[n-i-1][n-j-1];
//        for (int j = i+1; j < n-i-1; j++) answer[index++] = array[n-j-1][i];
//      }
//      if (n%2 != 0) answer[index++] = array[n/2][n/2];
//      return answer;
//    }
//}