package inheritance_practice;

public class Student extends Person{

    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void walk() {
        System.out.println(getName() + " walks like student");
    }

    public void learn() {
        System.out.println(getName() + " learns");
    }
}
