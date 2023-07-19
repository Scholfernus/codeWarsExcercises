package org.example.codeWars;

public class CalculateBMI {
    public static void main(String[] args) {
        System.out.println(bmi(80,1.80));
    }

    public static String bmi(double weight, double height) {
        double bmi = weight / (height * height);
        if (bmi <= 18.5){
            return "Underweight";
        } else if (bmi <= 25.0){
            return "Normal";
        } else if (bmi <= 30.0) {
            return "Overweight";
        }else if(bmi>30){
            return "Obese";
        }else
        return "";
    }
}


// double bmi = weight / (height * height);
//
//			if ( bmi <= 18.5) return "Underweight";
//			if ( bmi <= 25) return "Normal";
//			if ( bmi <= 30) return "Overweight";
//			return "Obese";
