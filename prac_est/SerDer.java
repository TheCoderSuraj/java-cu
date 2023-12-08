package prac_est;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Test {
    int a;

    Test(int a) {
        this.a = a;
    }
}

public class SerDer {
    public static void main(String[] args) {
        Test a = new Test(12), b;
        String path = "tser.txt";
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(a);
            oos.close();
            fos.close();

            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            b = (Test) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("another instance: " + b.a);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
