package org.example.codeWars;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("The greatest victory is that which requires no battle"));
    }
    public static String reverseWords(String str) {
        String[] split = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = split.length - 1; i >= 0; i--) {
            sb.append(split[i]);
            if (i > 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
// List Words = Arrays.asList(str.split(" "));
//     Collections.reverse(Words);
//     return String.join(" ", Words);

//List<String> words = Arrays.asList(str.split(" "));
//    Collections.reverse(words);
//    return String.join(" ", words);

//return Arrays.stream(str.split(" ")).reduce((x, y) -> y+" "+x).get();

//String[] s = str.split(" ");
//        StringBuilder sb = new StringBuilder();
//        for (int i = s.length-1; i >=0; i--) {
//            sb.append(s[i] + " ");
//        }
//        return sb.toString().trim();
//    }