package myPackage1.mySubPackage1;

public class MyClass3 {

    private int x;

    public void myMethod() {
      myMethodPrivate();
    }

    private void myMethodPrivate() {
    }

    protected void myMethodProtected() {
    }

    void myMethodDefault() {

    }


    public void myMethod5(String name, int age) {

    }

}

class MyChildMyClass3  {

    public static void main(String[] args) {
        MyClass3 myClass3 = new MyClass3();
        myClass3.myMethod5(new String("xyz"), 24);
    }
}


