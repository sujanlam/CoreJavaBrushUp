package org.src.aaatestings.testarrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayssTest {
    int[] a = {2, 4, 6, 8};
    int[] b = {4, 8, 6, 2};
    int[] c = {2, 4, 6, 8};
    int[] d;
    @BeforeEach
    void testSortArray() {

    }

    @Test
    void testArraysEqual() {
        assertArrayEquals(a, c);
    }


    @Test
    void testArrayEmpty() {
        assertNull(d);
    }

    @Test
    void testArrayNull() {
        /*try{
            int[] aa = null;
            int[] sortedArr = Arrayss.sortArray(aa);
            fail();
        }catch (NullPointerException e){
            System.out.println("Exception caught: null Array");
        }*/
        int[] aa = null;
        assertThrows(NullPointerException.class, () -> Arrayss.sortArray(aa));
    }

    @Test
    void testArrayNotNull() {
        /*try{
            int[] sortedArr = Arrayss.sortArray(b);
        }catch (NullPointerException e){
            System.out.println("Exception caught: null Array");
        }*/
        int[] cc = {2, 4, 6, 8};
        int[] dd = {4, 8, 6, 2};
        int[] actual = Arrayss.sortArray(dd);
        assertArrayEquals(cc, dd);
    }
}
