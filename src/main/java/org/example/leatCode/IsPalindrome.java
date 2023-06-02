package org.example.leatCode;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(5));
        System.out.println(isPalindromeStr("Kajak"));
    }

    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeStr(String isPalind) {
        int n = isPalind.length();
        for (int i = 0; i < n / 2; i++) {
            if (isPalind.toLowerCase().charAt(i) != isPalind.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
