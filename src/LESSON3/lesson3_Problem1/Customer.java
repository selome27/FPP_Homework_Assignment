package Lesson3_Problem1;

public class Customer {
private String firstName;
private  String lastName;
private String socSecurity;
private Address billingAddress;
private Address shippingAddress;
    public Customer(String firstName , String lastName , String socSecurity){
        this.firstName =firstName;
        this.lastName = lastName;
        this.socSecurity =socSecurity;
    }
    public Address getShippingAddress() {
        return shippingAddress;
    }

    public String getSocSecurity() {
        return socSecurity;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSocSecurity(String socSecurity) {
        this.socSecurity = socSecurity;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }



    public Address getBillingAddress() {
        return billingAddress;
    }



    public void setBillingAddress(Address billingAddress){

     this.billingAddress = billingAddress;


}

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socSecurity='" + socSecurity + '\'' +
                '}';
    }
}
