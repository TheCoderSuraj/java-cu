import java.io.*;

public class eval {
    public static void main(String[] main) {
        String path = "lecture.txt";
        File file = new File(path);
        try {
            FileInputStream fis = new FileInputStream(file);
            byte[] arr = new byte[(int) file.length()];
            fis.read(arr);
            ByteArrayInputStream bis = new ByteArrayInputStream(arr);
            // for (int i = 0; i < file.length(); i++) {
            // System.out.print((char) bis.read());
            // }
            int b;
            while ((b = bis.read()) != -1) {
                System.out.print((char) b);
            }
            bis.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
