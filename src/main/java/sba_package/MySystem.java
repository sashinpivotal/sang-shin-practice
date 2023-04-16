package sba_package;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MySystem {

    private Map<String, Item> myItemsInHashMap;

    public MySystem() throws FileNotFoundException {
        myItemsInHashMap = new HashMap<>();
        File file = new File("sample.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String regex = "\\s ";
            String[] strings = line.split(regex);

            String itemName = strings[0];
            String itemDescription = strings[1];
            double itemPrice = Double.parseDouble(strings[2]);
            int itemAvailableQuantity = Integer.parseInt(strings[3]);

            Item item = new Item(itemName,
                    itemDescription,
                    itemPrice,
                    itemAvailableQuantity);
            myItemsInHashMap.put(item.getItemName(), item);
        }
    }

    public Map<String, Item> getMyItemsInHashMap() {
        return myItemsInHashMap;
    }

    public void setMyItemsInHashMap(Map<String, Item> myItemsInHashMap) {
        this.myItemsInHashMap = myItemsInHashMap;
    }
}
