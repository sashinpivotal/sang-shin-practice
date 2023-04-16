package sba_package;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

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

        Item item = new Item("noodle", "really good", 20.0, 20);
        System.out.printf("%-20s %-20s %-10.2f %-10d %-10d %n",
                item.getItemName(),
                item.getItemDescription(),
                item.getPrice(),
                item.getQuantity(),
                item.getAvailableQuantity());
    }
}
