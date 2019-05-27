package app.model;

public class User {

    String country, customerName, buyerUnitNumber;

    public User(String country, String customerName, String buyerUnitNumber) {
        this.country = country;
        this.customerName = customerName;
        this.buyerUnitNumber = buyerUnitNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getBuyerUnitNumber() {
        return buyerUnitNumber;
    }

    public void setBuyerUnitNumber(String buyerUnitNumber) {
        this.buyerUnitNumber = buyerUnitNumber;
    }
}
