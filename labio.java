import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class labio {
    public static void main(String[] args) {
        String path = "grade.txt";
        writeGrade(path);
        readFile(path);
    }

    public static void writeGrade(String path) {

        try {
            Scanner sc = new Scanner(System.in);
            FileWriter fw = new FileWriter(path, false);
            String subName = "";
            String grade = "";
            // System.out.println("Enter 'Java' grade: ");
            while (true) {
                System.out.println("Enter subject name: ('quit' when done): ");
                subName = sc.nextLine();
                if (subName.equals("quit")) {
                    break;
                }
                System.out.println("Enter Grade: ");
                grade = sc.nextLine();
                fw.write(subName + " : " + grade + "\n");
            }
            fw.close();
        } catch (

        IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(String path) {
        try {
            FileReader fr = new FileReader(path);
            Scanner sc = new Scanner(fr);
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
