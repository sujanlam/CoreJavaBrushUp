package org.src.aaatestings.timeouts;

import java.util.Arrays;

public class DemoAssertTimeout {
    public static int[] sortArray(int[] array) {
        for (int i = 0; i < 1000000; i++) {
            Arrays.sort(array);
        }
        return array;
    }
}
