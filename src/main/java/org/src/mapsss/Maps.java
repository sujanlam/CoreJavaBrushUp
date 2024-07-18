package org.src.mapsss;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        Map<Integer, String> mapp = new TreeMap<>();
        mapp.put(1, "A");
        mapp.put(4, "D");
        mapp.put(23, "X");
        mapp.put(2, "B");
        mapp.put(3, "C");

        mapp.forEach((k, v) -> System.out.println(k+" "+v));
        for(Map.Entry<Integer, String> pMap: mapp.entrySet()){
            System.out.println(pMap.getKey()+" "+pMap.getValue());
        }
    }
}
