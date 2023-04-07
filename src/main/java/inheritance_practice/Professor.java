package inheritance_practice;

public class Professor extends Person{
    public Professor(String name, int age) {
        super(name, age);
    }
}

class Main6 {
    public static void main(String[] args) {
        Person person1 = new Professor("sang", 20);
        Object object1 = new Student("Tracey", 12, "B");
    }
}
