package org.src.io;

import java.io.*;

public class ReadAndWriteInFile {
    public static void main(String[] args) throws IOException {
        String source = "C:\\Users\\sujan\\Desktop\\Study_Related\\JAVA_Related\\source.txt";
        String dest = "C:\\Users\\sujan\\Desktop\\Study_Related\\JAVA_Related\\dest.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(source));
             BufferedWriter bw = new BufferedWriter(new FileWriter(dest));) {

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
