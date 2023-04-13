package interface_demo;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();

        integers.add(5);
        integers.add(50);
        integers.add(10);
        integers.add(10);

        System.out.println(integers.size());
        Integer integer = integers.get(2);
        System.out.println(integer);
        integers.add(1, 8);
        System.out.println(integers.get(1));
    }
}


