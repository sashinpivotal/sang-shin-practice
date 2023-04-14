package generics_practice;

import java.util.ArrayList;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        strings.add("sang");
//        strings.add(Integer.valueOf(10));

        List arrayList = new ArrayList();
        arrayList.add("string");
        arrayList.add(Integer.valueOf(10));
        String x = (String) arrayList.get(1);

    }
}
