package lambda_practice;

public class Main {
    public static void main(String[] args) {
        IMyInterface my = new MyImpl();

        IMyInterface my2 = new IMyInterface(){
            @Override
            public String myMethod(String myArgument) {
                return null;
            }
        };

        Runnable myRunnable = new MyRunnable();

        Runnable myRunnable2 = new Runnable() {

            @Override
            public void run() {
                System.out.println("hello world!");
            }
        };

        Runnable myRunnable3
                = ()->System.out.println("hello world!");
        myRunnable3.run();

    }
}

@FunctionalInterface
interface IMyInterface {
    public String myMethod(String myArgument);
}

class MyImpl implements IMyInterface {

    @Override
    public String myMethod(String myArgument) {
        return "sang";
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {

    }
}
