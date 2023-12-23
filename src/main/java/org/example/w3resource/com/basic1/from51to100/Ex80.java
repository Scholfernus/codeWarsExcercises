package org.example.w3resource.com.basic1.from51to100;

public class Ex80 {
    //    Write a Java program to get the largest value between the first and
//    last elements of an array (length 3) of integers.
    public static void main(String[] args) {
        int[] origin = {20, 30, 40};
        if (origin[1]>origin[0]&&origin[1]>origin[2]){
            System.out.println(origin[1]);
        } else if (origin[0]>origin[1]||origin[0]>origin[2]) {
            System.out.println(origin[0]);
        }else {
            System.out.println(origin[2]);
        }
        //  int maxVal = origin[0];
        //  if (origin[2] >= maxVal)
        //            maxVal = origin[2];
    }
}
