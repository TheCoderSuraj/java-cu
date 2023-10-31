// package mst2;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class file_read {
    public static void main() throws FileNotFoundException {

        String path = "filetest.txt";
        // using file reader
        FileReader fr = new FileReader(path);
    }
}
