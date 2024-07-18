package org.src.aaatestings.reverseString;

public class ReverseAString {

    public static String reverseAString(String str) {
        char[] strCharArr = str.toCharArray();
        int left = 0;
        int right = strCharArr.length - 1;
        while(left < right){
            char temp = strCharArr[left];
            strCharArr[left] = strCharArr[right];
            strCharArr[right] = temp;
            left++;
            right--;
        }
        return new String(strCharArr);
    }
}
