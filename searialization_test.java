import java.io.*;
import java.io.Serializable;

class searialization_test {
    public static void main(String[] arg) {
        Test t = new Test();
        t.age = 12;
        t.name = "Suraj";

        Test t2 = new Test();
        String path = "test.txt";
        try {
            // writing object
            FileOutputStream fos = new FileOutputStream(path, false);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(t);
            oos.close();
            fos.close();

            // reading object
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            t2 = (Test) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("your age is " + t2.age);
        } catch (Exception e) {
            e.printStackTrace();
            // System.out.println();
        }
    }
}

class Test implements Serializable {
    int age;
    String name;

}