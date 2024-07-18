package org.src.io;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DemoMain {
    public static void main(String[] args) throws IOException {
        /*System.out.print("Enter a number: ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int n = Integer.parseInt(br.readLine());
        System.out.println(n);

        br.close();
        isr.close();*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n2 = sc.nextInt();
        System.out.println(n2+3);
        sc.close();
    }
}
