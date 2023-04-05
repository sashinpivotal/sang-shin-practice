package homeworks.march_31st;

public class Customer {
    private String customerName;
    private String address;
    private String email;
    private Product[] products;


    public Customer() {
    }

    public String getCustomerInfo() {

        String result = "customerName = " + customerName + " "
                + "address = " + address + " "
                + "email = " + email;

        for (int ii = 0; ii < products.length; ii++) {
            if (products[ii] == null) {
                break;
            }
            result += "\n"
                    + " Product name = "
                    + products[ii].getProductName();
        }

        return result;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }


}
