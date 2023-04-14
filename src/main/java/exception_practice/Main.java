package exception_practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            myMethod2(0);
        } catch (MyOwnArithmeticException e) {
            System.out.println(e.getLocalDate());
        }
    }

    private static void myMethod1() throws FileNotFoundException {
        try {
            myMethod2(0);
            myMethod4();
        } catch (ArithmeticException e) {
            System.out.println("I handled it");
        }

    }

    private static void myMethod4() throws FileNotFoundException {
        File file = new File("sample.txt");
        Scanner scanner = new Scanner(file);
    }

    private static void myMethod2(int divider) {
        File file = new File("sample.txt");
        try {
            if (divider == 0) {
                throw new MyOwnArithmeticException();
            }
            System.out.println(4 / divider);
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This code needs to be executed");
        }
    }
}
