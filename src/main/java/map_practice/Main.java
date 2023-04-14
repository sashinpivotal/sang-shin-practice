package map_practice;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Item> itemCollection = new HashMap<>();
        Item pizza
                = new Item("pizza", 10.0, 5);
        itemCollection.put("pizza", pizza);
        Item salad
                = new Item("salad", 5.0, 10);
        itemCollection.put("salad", salad);

        int size = itemCollection.size();
        System.out.println(size);

        Item pizza1 = itemCollection.get("pizza");
        System.out.println(pizza1.getName());

        Item salad1 = itemCollection.remove("salad");
        int size1 = itemCollection.size();
        System.out.println(size1);

        Item salad2 = itemCollection.get("salad");
        if (salad2 != null) {
            System.out.println(salad2.getName());
        }

    }
}

class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
