package org.example.codeWars;

public class CorrectLetters {
    public static void main(String[] args) {
        System.out.println(correct("R1CHARD P. FEYNMAN - THE FEYNMAN LECTURE5 0N PHY51C5"));
    }

    public static String correct(String string) {
        String result = string;
        if (string.contains("5")) {
            result = string.replace("5", "S");
        }
        if (string.contains("0")) {
            result = result.replace("0", "O");
        }
        if (string.contains("1")) {
            result = result.replace("1", "I");
        }
        return result;
    }
}

// return string.replace("5","S").replace("0", "O").replace("1","I");