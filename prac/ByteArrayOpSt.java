package prac;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOpSt {
    public static void main(String[] args) {
        String s = "This is test from baos";
        byte buf[] = s.getBytes();

        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            baos.write(buf);

            byte b[] = baos.toByteArray();
            for (int i = 0; i < b.length; i++) {
                System.out.print((char) b[i]);
            }

            // writing in file
            FileOutputStream fos = new FileOutputStream("test.txt");
            baos.writeTo(fos);
            fos.close();
            baos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
