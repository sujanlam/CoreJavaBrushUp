package org.src.stringBuilderBuffer36;

public class TestStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Sujan");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" Hello!!!");
        String str = sb.toString();
        System.out.println(str);
        sb.ensureCapacity(100);

    }
}
