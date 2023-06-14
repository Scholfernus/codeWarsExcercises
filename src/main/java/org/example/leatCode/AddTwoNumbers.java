package org.example.leatCode;

public class AddTwoNumbers {
    public static void main(String[] args) {
        int[] l1 = {2, 4, 3};
        int[] l2 = {5, 6, 4};

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        int[] result = addTwoNumbers.addTwoNumbers(l1, l2);

        int finalResult = result[0] * 100 + result[1] * 10 + result[2];
        System.out.println("Wynik: " + finalResult);
    }

    public int[] addTwoNumbers(int[] l1, int[] l2) {
        int[] result = new int[l1.length + 1];
        int carry = 0;

        for (int i = 0; i < l1.length; i++) {
            int sum = l1[i] + l2[i] + carry;
            result[i] = sum % 10;
            carry = sum / 10;
        }
        result[l1.length] = carry;

        return result;
    }
}
