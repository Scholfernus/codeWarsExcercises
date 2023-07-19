package org.example.codeWars;

import java.util.Arrays;

public class ConvertStringToCamelCase {
    public static void main(String[] args) {
        System.out.println(toCamelCase("the-Stealth-Warrior"));
    }

    static String toCamelCase(String s) {
        String phrase = "";
        String[] split = s.split("[-_]");

        for (int i = 0; i < split.length; i++) {
            if (i == 0) {
                phrase += split[i];
            } else {
                String s1 = split[i].substring(0, 1).toUpperCase() + split[i].substring(1);
                phrase += s1;
            }
        }
        System.out.println(Arrays.toString(split));
        return phrase;
    }
}

//  String[] words = str.split("[-_]");
//    return Arrays.stream(words, 1, words.length)
//            .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
//            .reduce(words[0], String::concat);


// Matcher m = Pattern.compile("[_|-](\\w)").matcher(s);
//    StringBuffer sb = new StringBuffer();
//    while (m.find()) {
//        m.appendReplacement(sb, m.group(1).toUpperCase());
//    }
//    return m.appendTail(sb).toString();
//  }


// static String toCamelCase(String s){
//    return Pattern.compile("[-|_](.)").matcher(s).replaceAll(r -> r.group(1).toUpperCase());


//  StringBuffer sb = new StringBuffer();
//
//    boolean flToUpperCase = false;
//    for ( char ch: s.toCharArray() ) {
//      if ( ch == '-' || ch == '_' )
//        flToUpperCase = true;
//      else {
//        sb.append( ( flToUpperCase ) ? Character.toUpperCase(ch) : ch );
//        flToUpperCase = false;
//      }
//    }
//
//    return sb.toString();