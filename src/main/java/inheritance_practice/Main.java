package inheritance_practice;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Venessa", 40);
        Student student
                = new Student("Tracey", 20, "A" );
        Teacher teacher = new Teacher("Robert", 30);
        person.walk();
        student.walk();
        teacher.walk();
    }
}
