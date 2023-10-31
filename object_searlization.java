import java.io.*;
import java.io.Serializable;

class Student implements Serializable {
    String name;
    int rollNo;

    Student(String name, int roll) {
        this.name = name;
        this.rollNo = roll;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNo=" + rollNo + "]";
    }
}

public class object_searlization {

    public static void main(String[] arg) {
        String path = "student.txt";
        Student student = new Student("Suraj", 12);
        Student std2 = new Student("", 0);

        try {
            FileOutputStream fs = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fs);
            oos.writeObject(student);
            oos.close();
            fs.close();
            System.out.println("Serialization successfully");

            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            std2 = (Student) ois.readObject();
            ois.close();
            fis.close();
            String st = std2.toString();
            System.out.println(st);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // public static void serializeStudent(String path){

    // }
}
