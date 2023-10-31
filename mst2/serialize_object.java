// package mst2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Test implements Serializable {
    int age;
    String name;

    @Override
    public String toString() {
        return "Test [age=" + age + ", name=" + name + "]";
    }
}

public class serialize_object {
    public static void main(String[] arg) {
        String path = "test.txt";
        Test t = new Test();
        t.age = 12;
        t.name = "Suraj";
        Test t2 = new Test();
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(t);
            oos.close();
            fos.close();
            System.out.println("Object serialized successfully");

            // deserialization
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            t2 = (Test) ois.readObject();
            ois.close();
            fis.close();

            System.out.println("Object de-serialized successfully: " + t2.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
