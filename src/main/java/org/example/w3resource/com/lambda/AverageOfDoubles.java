package org.example.w3resource.com.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class AverageOfDoubles {
    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>(List.of(2.6, 3.5, 15.2, 4.8, 12.4, -35.2, 10.45));
        double sum = numbers.stream().mapToDouble(Double::doubleValue).sum();
        double average = sum / numbers.size();
        System.out.println(average);
        List<Double> doubles = new ArrayList<>(List.of(2.6, 3.5, 15.2, 4.8, 12.4, -35.2, 10.45));
        OptionalDouble average1 = doubles.stream().mapToDouble(Double::doubleValue).average();
        double orElse = doubles.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        System.out.println(average1);
        System.out.printf("%.2f", orElse);
    }
}
