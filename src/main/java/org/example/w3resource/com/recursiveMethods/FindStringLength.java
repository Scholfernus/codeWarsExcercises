package org.example.w3resource.com.recursiveMethods;

public class FindStringLength {
    public static int wordLength(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        return str.length();
    }
    public static void main(String[] args) {
        String word = "Find a string length";
        System.out.printf("Długość słowa ma %d znaków", wordLength(word));
    }
}

  class StringLengthCalculator {

  public static int calculateStringLength(String str) {
    // Base case: if the string is empty, the length is 0
    if (str.isEmpty()) {
      return 0;
    }

    // Recursive case: remove the first character of the
    // string and recursively call the method
    // with the remaining substring, and add 1 to the length
    return 1 + calculateStringLength(str.substring(1));
  }

  public static void main(String[] args) {
    String input = "Java Ex10!";
    int length = calculateStringLength(input);
    System.out.println("The length of the string \"" + input + "\" is: " + length);
  }
}
