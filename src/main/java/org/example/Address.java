package org.example;

public class Address {

    // To update users with addresses and contacts

    private String streetName;
    private String nameCity;
    private Long postalCode;
    private String country;

    public Address(String streetName, String nameCity, Long postalCode, String country) {
        this.streetName = streetName;
        this.nameCity = nameCity;
        this.postalCode = postalCode;
        this.country = country;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    public Long getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Long postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
