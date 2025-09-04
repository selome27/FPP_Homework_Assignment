package Lesson3_Problem1;

public class Address{

    private String city;
    private String street;
    private String state;
    private String zip;

    public Address(String city, String street, String state, String zip){

        this.city = city;
        this. street = street;
        this.state = state ;
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }
}
