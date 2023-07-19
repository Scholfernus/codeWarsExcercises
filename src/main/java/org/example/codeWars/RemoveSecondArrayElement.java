package org.example.codeWars;

import java.util.ArrayList;
import java.util.List;

public class RemoveSecondArrayElement {
    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>(List.of("Hello", "Goodbye", "Hello Again"));
        System.out.println(removeEveryOther(objects.toArray()));
    }

    public static Object[] removeEveryOther(Object[] arr) {
        Object[] result = new Object[(arr.length + 1) / 2];
        int index = 0;
        for (int i = 0; i < arr.length; i += 2) {
            result[index] = arr[i];
            index++;
        }
        return result;
    }
}

// List<Object> list = new ArrayList<>();
//    for(int i=0; i<arr.length; i++){
//      if(i%2==0){
//         list.add(arr[i]);
//      }
//    }
//    return list.toArray();

// return IntStream.range(0, arr.length).filter(n -> n % 2 == 0).mapToObj(i->arr[i]).toArray();