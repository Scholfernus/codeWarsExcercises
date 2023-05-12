package org.example.chatGPTzadania;

import java.util.Arrays;

public class SumaLiczbTablica {
    public static void main(String[] args) {
    int[]numbers = {2,6,-8,7,15,23,44,-12,-54,33};
        System.out.println(sumaLiczb(numbers));
    }
    public static int sumaLiczb(int[]tab){
        int suma = 0;
        for (var elem :tab ) {
            suma+=elem;
        }
        return suma;
    }
}
