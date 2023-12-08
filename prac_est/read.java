package prac_est;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class read {
    public static void main(String[] args) {
        String path = "test.txt";
        try {
            // FileInputStream fis = new FileInputStream(path);
            // // int c;
            // // while ((c = fis.read()) != -1) {
            // // System.out.print((char) c);
            // // }
            // // Scanner sc = new Scanner(fis);
            // // while (sc.hasNext()) {
            // // System.out.println(sc.nextLine());
            // // }
            // fis.close();

            // String t = "Hi suraj";
            // byte buf[] = t.getBytes();
            // ByteArrayInputStream bis = new ByteArrayInputStream(buf);
            // int c;
            // while ((c = bis.read()) != -1) {
            // System.out.print((char) c);
            // }

            // File f = new File(path);
            // byte buf[] = new byte[(int) f.length()];
            // FileInputStream fis = new FileInputStream(f);
            // fis.read(buf);
            // ByteArrayInputStream bis = new ByteArrayInputStream(buf);
            // int c;
            // while ((c = bis.read()) != -1) {
            // System.out.print((char) c);
            // }

            // FileReader fr = new FileReader(path);
            // // Scanner sc = new Scanner(fr);
            // // while (sc.hasNext()) {
            // // System.out.println(sc.nextLine());
            // // }
            // int c;
            // while ((c = fr.read()) != -1) {
            // System.out.print((char) c);
            // }
            // fr.close();

        } catch (Exception e) {

            e.printStackTrace();
        }

    }
}
