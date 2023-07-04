package org.example.CodeWars;

public class StringUtils {
    public static String toAlternativeString(String string) {
        StringBuilder result = new StringBuilder();
        for (Character character : string.toCharArray()) {
            if (Character.isLowerCase(character)){
               result.append(Character.toUpperCase(character));
            }else if(Character.isUpperCase(character))    {
             result.append(Character.toLowerCase(character));
            }else {
                result.append(character);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(toAlternativeString("hello world"));
        System.out.println(toAlternativeString("HELLO WORLD"));
        System.out.println(toAlternativeString("altERnaTIng cAsE"));
        System.out.println(toAlternativeString("ALTerNAtiNG CaSe"));
    }
}

//  String result = "";
//        for (char c : string.toCharArray()) {
//            if(Character.isUpperCase(c)) {
//                result += Character.toLowerCase(c);
//            } else {
//                result += Character.toUpperCase(c);
//            }
//        }
//        return result;
//    }