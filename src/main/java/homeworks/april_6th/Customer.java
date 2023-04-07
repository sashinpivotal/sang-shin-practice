package homeworks.april_6th;

public class Customer {
    private String customerName;
    private String email;
    private Product[] products;
    private Address[] addresses;
    private int currentAddressIndex = 0;

    public Customer() {
    }

    public void addAddress(Address address) {
//        int i = 0;
//        for (; i < addresses.length; i++) {
//            if (addresses[i] == null) {
//                break;
//            }
//        }
//        addresses[i] = address;
        addresses[currentAddressIndex++] = address;
    }

    public String getCustomerInfo() {

        String result = "customerName = " + customerName + " "
                + "email = " + email;

        for (int ii = 0; ii < products.length; ii++) {
            if (products[ii] == null) {
                break;
            }
            result += "\n"
                    + " Product name = "
                    + products[ii].getProductName();
        }

        for (int ii = 0; ii < addresses.length; ii++) {
            if (addresses[ii] == null) {
                break;
            }
            result += "\n"
                    + " Address = "
                    + addresses[ii].getStreetNumber() + " "
                    + addresses[ii].getCity() + " ";
        }

        return result;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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

    public void setAddresses(Address[] addresses) {
        this.addresses = addresses;
    }
}
