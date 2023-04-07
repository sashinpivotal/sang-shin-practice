package inheritance_practice;

class GrandParent {
    public GrandParent() {
        System.out.println("I am grandparent");
    }
}

public class Parent extends GrandParent{
    public Parent() {
        System.out.println("I am parent");
    }
}

class Main3 {
    public static void main(String[] args) {
        Child child = new Child();
    }
}
