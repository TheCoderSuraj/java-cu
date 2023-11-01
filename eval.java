import java.io.*;

public class eval {
    public static void main(String[] main) {
        String path = "testsome.txt";
        File file = new File(path);
        try {
            FileInputStream fis = new FileInputStream(file);
            byte[] arr = new byte[(int) file.length()];
            fis.read(arr);
            ByteArrayInputStream bis = new ByteArrayInputStream(arr);
            for (int i = 0; i < file.length(); i++) {
                System.out.print((char) bis.read());
            }
            bis.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
