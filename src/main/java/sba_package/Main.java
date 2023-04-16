package sba_package;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("----------- Testing reading sample.txt -----");
        System.out.printf("%-20s %-20s %-10s %-10s %n",
                "Name",
                "Description",
                "Price",
                "Available Quantity");

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

            System.out.printf("%-20s %-20s %-10.2f %-10d %n",
                    itemName,
                    itemDescription,
                    itemPrice,
                    itemAvailableQuantity);
        }

        System.out.println("----------- Testing the constructor of Item class -----");
        Item item = new Item("noodle", "really good", 20.0, 20);
        System.out.printf("%-20s %-20s %-10.2f %-10d %-10d %n",
                item.getItemName(),
                item.getItemDescription(),
                item.getPrice(),
                item.getQuantity(),
                item.getAvailableQuantity());

        System.out.println("----------- Testing the constructor of MySystem class -----");
        MySystem mySystem = new MySystem();
        Map<String, Item> myItemsInHashMap
                = mySystem.getMyItemsInHashMap();
        Collection<Item> values = myItemsInHashMap.values();
        for (Item item2: values) {
            System.out.printf("%-20s %-20s %-10.2f %-10d %n",
                    item2.getItemName(),
                    item2.getItemDescription(),
                    item2.getPrice(),
                    item2.getAvailableQuantity());
        }
    }
}
