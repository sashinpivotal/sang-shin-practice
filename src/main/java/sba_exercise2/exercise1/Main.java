package sba_exercise2.exercise1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] myStringArrayTestValue
                = {"life", "is", "worth", "living"};
        MyOperation myOperation = new MyOperation();
        myOperation
                .convertStringArrayIntoArrayList(
                        myStringArrayTestValue);
        ArrayList<String> myArrayList = myOperation.getMyArrayList();
        System.out.println(myArrayList);

        myOperation.replaceAnElementInTheStringArrayListGiven(2);
        System.out.println(myArrayList);

        ArrayList<String> aNewArrayListFromExistingArray = myOperation.createANewArrayListFromExistingArray();
        System.out.println(aNewArrayListFromExistingArray);

        try {
            throw new MyOwnException("This is my own exception message");
        } catch (MyOwnException e) {
            System.out.println("----");
            System.out.println(e.getMessage());
        }

    }
}

class MyOwnException extends Exception{
    public MyOwnException(String message) {
        super(message);
    }
}

interface IMyOperation {
    void convertStringArrayIntoArrayList(String[] stringArray);

    void replaceAnElementInTheStringArrayListGiven(int index);

    ArrayList<String> createANewArrayListFromExistingArray();
}

class MyOperation implements IMyOperation {

    private ArrayList<String> myArrayList;

    public MyOperation() {
        myArrayList = new ArrayList<>();
    }

    @Override
    public void convertStringArrayIntoArrayList(String[] stringArray) {
        for (String string : stringArray) {
            myArrayList.add(string);
        }
    }

    @Override
    public void replaceAnElementInTheStringArrayListGiven(int index) {
        myArrayList.set(index, "Nah");
    }

    @Override
    public ArrayList<String> createANewArrayListFromExistingArray() {
        ArrayList<String> newList = new ArrayList<>();
        for (String string : myArrayList) {
            if (!string.equals("Nah")) {
                newList.add(string);
            }
        }
        return newList;
    }

    public ArrayList<String> getMyArrayList() {
        return myArrayList;
    }
}
