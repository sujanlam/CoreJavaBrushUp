package org.src.comparators;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoComparator {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23, 12, 24, 14, 7, 25);
        List<String> listofStrings = Arrays.asList("Haleee", "Kalee", "Bale", "Saleeeee");
        System.out.println(list);
        //Collections.sort(list);
        //System.out.println(list);
        Comparator<String> sortedNamesByLength =(a, b) -> (a.length()>b.length())? 1:-1;
        Collections.sort(listofStrings, sortedNamesByLength);
        System.out.println(listofStrings);

            }
        }