package array_practice;

public class Main {
    public static void main(String[] args) {

        int[] myIntArray = {1, 2, 3};

        for (int i = 0; i < myIntArray.length ; i++) {
            System.out.println(myIntArray[i]);
        }

        for (int myInt : myIntArray) {
            System.out.println(myInt);
        }
    }
}
