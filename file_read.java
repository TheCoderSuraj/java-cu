import java.io.*;
import java.util.Scanner;

public class file_read {
    // using fileReader -> string and text
    // public static void main(String[] arg) {
    // try {

    // // String path = "F:\\CU\\projects\\java\\test.txt";
    // String path = "test.txt";
    // FileReader fs = new FileReader(path);
    // // reading file
    // // int c;

    // // while ((c = fs.read()) != -1) // running loop till eof of file
    // // {
    // // System.out.print((char) c);
    // // }

    // // using scanner
    // Scanner sc = new Scanner(fs);
    // while (sc.hasNext()) {
    // System.out.println(sc.nextLine());
    // }

    // fs.close();
    // } catch (IOException exc) {
    // // exc.printStackTrace();
    // System.out.println("Error: " + exc.getMessage());
    // }
    // }

    // using FileInputStream -> in bytes (int)
    public static void main(String[] arg) {
        try {

            // String path = "F:\\CU\\projects\\java\\test.txt";
            String path = "test.txt";
            FileInputStream fs = new FileInputStream(path);
            // reading file
            // int c;

            // while ((c = fs.read()) != -1) // running loop till eof of file
            // {
            // System.out.print((char) c);
            // }
            System.out.println("available: " + fs.available());
            // using scanner
            Scanner sc = new Scanner(fs);
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }

            fs.close();
        } catch (IOException exc) {
            // exc.printStackTrace();
            System.out.println("Error: " + exc.getMessage());
        }
    }
}
