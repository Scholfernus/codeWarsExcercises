package org.example.codeWars;

public class BreakCamelCase {
    public static void main(String[] args) {
        System.out.println(camelCase("camelCasingTest"));
    }
    public static String camelCase(String input) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.toString());
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isUpperCase(currentChar) && i > 0){
                sb.append(" ");
            }
            sb.append(currentChar);
        }
        return sb.toString();
    }
}

//  return input.replaceAll("([A-Z])", " $1");