package org.example.bingChat;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListOfDouble {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        List<Double> numbers= new ArrayList<>();
        double average = 0;
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            double numb = random.nextDouble();
            numbers.add(numb);
        }
        for (double elem: numbers) {
            average +=elem;
        }
        double listAverage = average / numbers.size();
        System.out.println("Śrdnia: " + df.format(listAverage));
    }
}
