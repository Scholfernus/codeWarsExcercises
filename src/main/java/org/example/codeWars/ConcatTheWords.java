package org.example.codeWars;

public class ConcatTheWords {
    public static String smash(String... words) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i!= words.length-1){
                sb.append(words[i] + " ");
            }else sb.append(words[i]);
        }return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(smash(new String[]{"hello", "world", "this", "is", "great"}));
    }
}
// return String.join(" ", words);

//  StringBuilder sb = new StringBuilder();
//    for (String word : words)
//    {
//      sb.append(word + " ");
//    }
//    return sb.toString().trim();
//  }

//  return Stream.of(words).collect(Collectors.joining(" "));