package prac_est;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class write {
    public static void main(String[] args) {
        String path = "test.txt";
        try {
            FileOutputStream fos = new FileOutputStream(path);
            // fos.write('c');
            // fos.close();

            // FileWriter fw = new FileWriter(path);
            // fw.write("hi kiran! suraj this side...");
            // fw.close();

            String st = "hi suraj! I am kiran";
            byte buf[] = st.getBytes();

            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            bos.write(buf);
            bos.writeTo(fos);
            bos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
