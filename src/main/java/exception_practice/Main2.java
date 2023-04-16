package exception_practice;

import java.io.FileNotFoundException;

public class Main2 {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {

            method2();


    }

    private static void method2() {
        method3();
    }

    private static void method3() {
        try {
            // some business logic
            throw new SangShinOwnException();
        } catch (SangShinOwnException e) {
            System.out.println("deal with it");
        }


    }
}

class SangShinOwnException extends RuntimeException {

}
