package homeworks.april_1st.my_sub_package;

public class Address {

    private boolean isPrimaryAddress;
    private int streetNumber;
    private String streetName;
    private String city;
    private String state;

    public Address(boolean isPrimaryAddress,
                   int streetNumber,
                   String streetName,
                   String city,
                   String state) {
        this.isPrimaryAddress = isPrimaryAddress;
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
    }

    public boolean isPrimaryAddress() {
        return isPrimaryAddress;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }
}
