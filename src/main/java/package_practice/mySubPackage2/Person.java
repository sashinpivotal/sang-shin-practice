package package_practice.mySubPackage2;

import exception_practice.IPerson;

public class Person implements IPerson {
    @Override
    public void sayHello() {
        System.out.println("hello world");
    }
}
