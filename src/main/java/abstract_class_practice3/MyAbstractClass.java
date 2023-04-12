package abstract_class_practice3;

public abstract class MyAbstractClass {

    public MyAbstractClass() {
    }

    public void myMethod1() {
        myMethod2();
    }

    private void myMethod2() {
    }

    abstract void myMethod3();
    public abstract void myMethod4();
}

interface IMyComputer {
    int HUNDRED = 100;

    void myMethod3();
    void myMethod4();

    default void myMethod5() {
        System.out.println();
    }

    default void myMethod6() {
        System.out.println();
    }

    static void myMethod7() {
        System.out.println("I am static method");
    }
}

interface IMyRecord {

}

class MyComputerImpl implements IMyComputer, IMyRecord {

    @Override
    public void myMethod3() {
    }

    @Override
    public void myMethod4() {
    }

    @Override
    public void myMethod5() {
        System.out.println();
    }
}

class MyClass2 extends MyAbstractClass {

    @Override
    public void myMethod1() {
    }

    @Override
    public void myMethod3() {
    }

    @Override
    public void myMethod4() {
    }
}

class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        MyClass2 myClass2 = new MyClass2();
        MyComputerImpl myComputer = new MyComputerImpl();
        IMyComputer myComputer2 = new MyComputerImpl();
        myComputer2.myMethod5();
        IMyComputer.myMethod7();
        IMyRecord myComputer3 = new MyComputerImpl();
        myComputer.myMethod3();
    }
}
