package prac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerDer {
    public static void main(String[] args) {
        Test t = new Test();
        t.a = 12;
        t.st = "suraj";
        String path = "ser.txt";
        Test t2;

        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(t);
            oos.close();
            fos.close();

            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            t2 = (Test) ois.readObject();
            ois.close();
            fis.close();
            System.out.println(t2.a);
            System.out.println(t2.st);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Test implements Serializable {
    int a;
    String st;
}