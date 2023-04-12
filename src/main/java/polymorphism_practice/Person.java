package polymorphism_practice;

public abstract class Person {
    public void myConcreteMethod() {

    }

    public abstract String getName();
}

interface IPerson {
    public String getName();
}

class Employee extends Person
        implements IPerson {

    @Override
    public String getName() {
        return ("I am employee");
    }
}

class Student2 extends Person
        implements IPerson {

    @Override
    public String getName() {
        return ("I am student");
    }
}

class Main {
    public static void main(String[] args) {
        Student2 studentObject = new Student2();
        Employee employeeObject = new Employee();

        // refPerson points to a Student object
        IPerson refPerson = studentObject;
        // getName() method of Student class is called
        String temp = refPerson.getName();
        System.out.println(temp);

        // refPerson now points to an Employee object
        refPerson = employeeObject;
        // getName() method of Employee class is called
        temp = refPerson.getName();
        System.out.println(temp);
    }
}
