package file_practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // c:/temp
        File file = new File("myDir/myFile");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            String[] strings = nextLine.split("  ");
            String s = Arrays.toString(strings);
            System.out.println(s);
        }

        Reader x;
        InputStream y;
    }
}
