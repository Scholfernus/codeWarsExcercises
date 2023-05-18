package org.example.genericClass;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ListWrapper<T> {
    private List<T> list;

    public ListWrapper(List<T> list) {
        this.list = list;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public List<T> filter(Predicate<T> predicate) {
        List<T> filterdeList = new ArrayList<>();
        for (T element : list) {
            if (predicate.test(element)) {
                filterdeList.add(element);
            }
        }
        return filterdeList;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        ListWrapper<Integer> listWrapper = new ListWrapper<>(numbers);

        List<Integer> evenNumbers = listWrapper.filter(n -> n % 2 == 0);
        System.out.println(evenNumbers);
    }
}
