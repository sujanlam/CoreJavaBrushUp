package org.src.setss;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(91);
        set.add(22);
        set.add(103);
        set.add(44);
        System.out.println(set);

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(91);
        treeSet.add(22);
        treeSet.add(103);
        treeSet.add(44);
        System.out.println(treeSet);

        Iterator<Integer> iterator = set.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Set<Integer> setstream = new HashSet<Integer>();
        setstream.add(291);
        setstream.add(122);
        setstream.add(303);
        setstream.add(24);
        System.out.println(set);
        System.out.println("Printing using stream: ");
        setstream.stream().forEach(System.out::println);
    }

}
