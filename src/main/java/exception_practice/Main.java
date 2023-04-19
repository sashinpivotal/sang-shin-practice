package exception_practice;

import inheritance_practice.Student;
import package_practice.mySubPackage2.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {


        // Type safe code example
        List<String> strings = new ArrayList<String>();
        strings.add("jon");
        strings.add("mary");

        // Code example that is not "type-safe"
        List strings2 = new ArrayList();
        strings2.add("sang");
        strings2.add(2);
        String x = (String) strings2.get(1);
        System.out.println(x);

        Person person1 = new Person();
        myMethod10(person1);

        IPerson person = new Janitor();
        myMethod11(person);

    }

    public static void myMethod10(Person person) {
        person.sayHello();
    }

    public static void myMethod11(IPerson person) {
        person.sayHello();
    }

    private static void myMethod1()
            throws FileNotFoundException, ArithmeticException {
        myMethod2(0);
        myMethod4();
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
