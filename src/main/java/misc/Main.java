package misc;

import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        Parent parent1 = child;
    }
}

class Parent {

}

class Child extends Parent {

}
