import java.io.*;

public class file_write {
    // using FileWriter -> works with string and character
    // public static void main(String[] args) {
    // try {
    // String path = "test1.txt";

    // FileWriter fw = new FileWriter(path, false);
    // fw.write("I am suraj");
    // char[] c = { 'a', 'b', 'c' };
    // fw.write(c, 1, 2);
    // // fw.write(c);
    // fw.close();
    // } catch (IOException e) {
    // // e.printStackTrace();
    // System.out.println(e.getMessage());
    // }
    // }

    // using fileOutputStream
    public static void main(String[] args) {
        try {
            String path = "test1.txt";

            // in byte format (int)
            FileOutputStream fw = new FileOutputStream(path, false);
            fw.write('c');
            fw.close();
        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
