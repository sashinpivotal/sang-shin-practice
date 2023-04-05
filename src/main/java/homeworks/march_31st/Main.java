package homeworks.march_31st;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setCustomerName("Tracey");
        customer.setAddress("Boston");
        customer.setEmail("sang@gmail.com");

        Product[] products = new Product[10];
        products[0] = new Product("TV", 100.0);
        products[1] = new Product("Computer", 2000.0);

        customer.setProducts(products);

        String customerInfo = customer.getCustomerInfo();
        System.out.println(customerInfo);
    }
}
