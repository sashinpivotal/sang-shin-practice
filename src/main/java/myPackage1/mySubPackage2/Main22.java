package myPackage1.mySubPackage2;

public class Main22 {

    public static void main(String[] args) {
        MyClass myObject = new MyClass(20);
        System.out.println(myObject.getValue());
    }

}

class MyClass {
    private int value = 10;

    public MyClass(int value) {

        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

