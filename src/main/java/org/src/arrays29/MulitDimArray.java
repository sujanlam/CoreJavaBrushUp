package org.src.arrays29;

import java.util.concurrent.ThreadLocalRandom;

public class MulitDimArray {

    public static void main(String[] args) {
     int[][] multiDimArray = new int[5][5];
        for (int row = 0; row < multiDimArray.length; row++) {
            for (int column = 0; column < multiDimArray[0].length; column++) {
                multiDimArray[row][column] = (int)(Math.random()*100);
            }

        }
        for (int row = 0; row < multiDimArray.length; row++) {
            for (int column = 0; column < multiDimArray[0].length; column++) {
                System.out.print(multiDimArray[row][column] + " ");
            }
            System.out.println();
        }
        int min=5;
        int max=16;
        int randomBetn = (int)(Math.random()*(max-min+1)) + min;
        System.out.println(randomBetn);

        int randNum = ThreadLocalRandom.current().nextInt(15,16);
        System.out.println(randNum);
    }
}
