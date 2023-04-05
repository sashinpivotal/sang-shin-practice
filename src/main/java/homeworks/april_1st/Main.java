package homeworks.april_1st;

import homeworks.april_1st.my_sub_package.Address;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setCustomerName("Tracey");

        customer.setEmail("sang@gmail.com");

        Product[] products = new Product[10];
        products[0] = new Product("TV",
                100.0);
        products[1] = new Product("Computer",
                2000.0);
        customer.setProducts(products);

        Address[] addresses = new Address[10];
        customer.setAddresses(addresses);

        Address address1 = new Address(true,
                20,
                "Robert st",
                "Lexington",
                "MA");
        customer.addAddress(address1);
        Address address2 = new Address(false,
                20,
                "Sang st",
                "Wellesley",
                "MA");
        customer.addAddress(address2);

        String customerInfo = customer.getCustomerInfo();
        System.out.println(customerInfo);
    }
}
