package prac;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class write {
    public static void main(String[] args) {
        String path = "test.txt";
        try {
            // FileWriter fw = new FileWriter(path);
            // fw.write("this is test writing in file");
            // fw.close();

            // FileOutputStream fos = new FileOutputStream(path);
            // fos.write('c');
            // fos.closed();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
