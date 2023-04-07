package inheritance_practice;

public class Teacher extends Person {

    private String subject;

    public Teacher(String name, int age) {
        super(name, age);
    }

//    @Override
//    public void walk() {
//        System.out.println(getName() + " walks like Teacher");
//    }

    public void teach() {
        System.out.println(getName() + " teaches");
    }
}
