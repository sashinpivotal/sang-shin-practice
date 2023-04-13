package interface_demo;

import java.util.ArrayList;
import java.util.Collection;

public interface IMyInterface {
    public void myMethod1();
    public void myMethod2();
}

interface IMyChildInterface extends IMyInterface {
    public void myMethod3();
}

class MyImpl implements IMyChildInterface {

    @Override
    public void myMethod1() {

        Collection objects = new ArrayList<>();
        boolean joe = objects.add(new String("joe"));
        System.out.println(joe);
        objects.add(new Integer(34));
        boolean empty = objects.isEmpty();
        System.out.println(empty);

    }

    @Override
    public void myMethod2() {

    }

    @Override
    public void myMethod3() {

    }
}

class Main {
    public static void main(String[] args) {
        MyImpl my = new MyImpl();
        my.myMethod1();
    }
}
