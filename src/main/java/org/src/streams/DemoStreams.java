package org.src.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStreams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,1,6,3,4,9);
        System.out.println(list);
        List<Integer> doubleEvens = list.stream().filter(x -> x%2==0).map(x -> x*2).collect(Collectors.toList());
        System.out.println(doubleEvens);
        int sumOFDoubleEvens = list.stream().filter(x -> x%2==0).map(x -> x*2).collect(Collectors.toList()).stream().reduce(0, (a,b) -> a+b);
        System.out.println(sumOFDoubleEvens);
        list.forEach(n -> System.out.print(n+" "));
    }
}
