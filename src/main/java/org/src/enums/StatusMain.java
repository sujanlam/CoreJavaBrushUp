package org.src.enums;

enum Status {
    FAIL,
    CREATED,
    POSTED,
    DONE;
}



public class StatusMain {
    public static void main(String[] args) {
        int i = 6;
        Status status = Status.DONE;
        Status[] all = Status.values();
        System.out.println(status);
        System.out.println(status.ordinal());
        for(Status s : all) {
            System.out.println(s);
        }
        System.out.println(status.getClass().getSuperclass());
    }

}
