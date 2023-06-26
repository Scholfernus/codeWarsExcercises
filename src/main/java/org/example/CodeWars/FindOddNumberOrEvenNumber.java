package org.example.CodeWars;

public class FindOddNumberOrEvenNumber {
    public static void main(String[] args) {
        int[] exampleTest2 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781};
        System.out.println(find(exampleTest2));
    }

    static int find(int[] integers) {
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        if (evenCount == 1) {
            for (int i = 0; i < integers.length; i++) {
                if (integers[i] % 2 == 0) {
                    return integers[i];
                }
            }
        } else {
            for (int i = 0; i < integers.length; i++) {
                if (integers[i] % 2 != 0) {
                    return integers[i];
                }
            }
        }

        return 0; // Obsługa przypadku, gdy tablica jest pusta lub nie ma żadnej liczby
    }

}


//  int[] odd = Arrays.stream(integers).filter(n -> n % 2 != 0).toArray();
//    int[] even = Arrays.stream(integers).filter(n -> n % 2 == 0).toArray();
//
//    return odd.length == 1 ? odd[0] : even[0];