package polymorphism_practice;

public interface IMyInterface {
}

class MyClass implements IMyInterface {
}

class A {
    String E = "extraction ";
    String T = "transformation ";
    String L = "loading ";

    void ETL() {
        System.out.println(L + T + E);
    };
}

class B extends A {
    void ETL() {
        System.out.println(E + T + L);
    }
}

class Main {
    public static void main(String args[]) {
        A obj = new B();
        obj.ETL();
        int x = 4;
        int y = 0;
    }
}

