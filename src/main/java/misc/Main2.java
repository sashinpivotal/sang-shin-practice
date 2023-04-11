package misc;

public class Main2 {
    public static void main(String[] args) {
        Person person = new Person();
        Boy boy = new Boy();

        Person person1 = boy;
        person1.walk();

        Girl girl = new Girl();
        person1 = girl;
        person1.walk();

        person1 = new Whatever();
        person1.walk();
        person1.sing();

    }
}

class Person {
    public void walk() {
        System.out.println("Person walks");
    }

    public void sing() {
        System.out.println("Person sings");
    }
}

class Boy extends Person {
    @Override
    public void walk() {
        System.out.println("Boy walks");
    }

    public void actWild() {
        System.out.println("Boys are boys");
    }
}

class Girl extends Person {
    @Override
    public void walk() {
        System.out.println("Girl walks");
    }
}

class Whatever extends Person {
    @Override
    public void walk() {
        System.out.println("Whatever walks");
    }
}
