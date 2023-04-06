package myPackage1.mySubPackage2;

public class Main22 {

    public static void main(String[] args) {
        MyClass myObject = new MyClass(20, 30, 40);
        System.out.println(myObject.getValue1());
        System.out.println(myObject.getValue2());
        System.out.println(myObject.getValue3());
    }

}

class MyClass {
    private int value1 = 10;
    private int value2 = 10;
    private int value3 = 10;

    public MyClass(int value1, int value2, int xyz) {
        this.value1 = value1;
        value2 = value2;
        value3 = xyz;
    }

    public int getValue1() {
        return value1;
    }

    public int getValue2() {
        return value2;
    }

    public int getValue3() {
        return value3;
    }
}

