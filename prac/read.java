package prac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class read {
    public static void main(String[] args) {
        String path = "test.txt";

        try {
            FileReader fr = new FileReader(path);
            // Scanner sc = new Scanner(fr);
            // while (sc.hasNext()) {
            // System.out.println(sc.nextLine());
            // }
            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
            fr.close();

            // FileInputStream fis = new FileInputStream(path);
            // Scanner sc = new Scanner(fis);
            // while (sc.hasNext()) {
            // System.out.println(sc.nextLine());
            // }
            // fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
