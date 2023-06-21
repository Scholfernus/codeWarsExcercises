package org.example.bingChat;

public class ChangeFromArrayToString {
    public static void main(String[] args) {
        char[] array = {'T', 'h', 'e', ' ', 'b', 'o', 'o', 'k', ' ',
                'c', 'o', 'n', 't', 'a', 'i', 'n', 's', ' ', '2', '3',
                '4', ' ', 'p', 'a', 'g', 'e', 's', '.'};
        String str = new String(array);
        System.out.println(str);
    }
}
