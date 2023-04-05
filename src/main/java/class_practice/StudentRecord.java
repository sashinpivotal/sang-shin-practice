package class_practice;

public class StudentRecord {

    private String name;
    private double mathScore;
    private double sciScore;

    private static int numberOfStudents;

    public StudentRecord() {
        numberOfStudents++;
    }

    public StudentRecord(String name) {
       this.name = name;
    }

    public StudentRecord(String name, double mathScore) {
        this.name = name;
        this.mathScore = mathScore;
    }

    public StudentRecord(String name, double mathScore, double sciScore) {
        this.name = name;
        this.mathScore = mathScore;
        this.sciScore = sciScore;
    }


    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getSciScore() {
        return sciScore;
    }

    public void setSciScore(double sciScore) {
        this.sciScore = sciScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void print(String name) {
        System.out.println("student name is " + name);
    }

    public void print(int x) {
        System.out.println("student name is " + name);
    }

    public void print(double mathScore, double sciScore, double algebraScore) {

    }

    public void print(double averageScore) {
        System.out.println("average = " + averageScore);
    }
}


