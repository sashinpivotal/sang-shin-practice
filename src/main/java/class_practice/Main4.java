package class_practice;

class Main4 {
    public static void main(String[] args) {
        StudentRecord student1 = new StudentRecord();
        student1.setName("Robert");
        student1.setMathScore(3.9);
        student1.setSciScore(3.2);
        StudentRecord student2 = new StudentRecord();
        student2.setName("Alisa");
        student2.setMathScore(3.7);
        student2.setSciScore(3.5);
        StudentRecord student3
                = new StudentRecord("Tony");
        student3.setMathScore(2.7);
        student3.setSciScore(3.6);
        StudentRecord student4
                = new StudentRecord("Ben", 2.5, 4.5);


        int numberOfStudents1 = student1.getNumberOfStudents();
        System.out.println(numberOfStudents1);

        double totalScores = student1.getMathScore() + student1.getSciScore();
        double averageScore = totalScores / 2;
//        System.out.println("name = " + student1.getName() +
//                "average score = " + averageScore);

        student1.print(student1.getName());
        student1.print(averageScore);

        int numberOfStudents2 = student2.getNumberOfStudents();
        System.out.println(numberOfStudents2);

    }

    public void myMethod() {
        StudentRecord studentRecord
                = new StudentRecord();

        StudentRecord studentRecord2 = new StudentRecord();
    }
}
