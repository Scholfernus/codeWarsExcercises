package org.example.codeWars;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(digital_root(8456));

    }
    public static int digital_root(int n) {
        while (n>9) {
            int sum =0;
            String number = String.valueOf(n);
            for (int i = 0; i < number.length(); i++) {
                sum += Character.getNumericValue(number.charAt(i));
            }
            n = sum;
        }
        return n;
    }
}
//  return (n != 0 && n%9 == 0) ? 9 : n % 9;

// while(n > 9){
//      n = n/10 + n % 10;
//      }
//    return(n);

// return (1 + (n - 1) % 9);

// return --n % 9 + 1;