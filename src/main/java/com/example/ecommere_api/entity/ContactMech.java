package com.example.ecommere_api.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "contact_mech")
public class ContactMech {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int contactMechId; // Correct field naming convention

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    private String streetAddress; // Correct type and naming
    private String city;          // Correct type and naming
    private String state;         // Correct type and naming
    private String postalCode;    // Correct type and naming
    private String phoneNumber;   // Correct type and naming
    private String email;         // Correct type and naming

    // Default Constructor
    public ContactMech() {
    }

    // Constructor with parameters
    public ContactMech(Customer customer, String streetAddress, String city, String state, String postalCode, String phoneNumber, String email) {
        this.customer = customer;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Getters and Setters
    public int getContactMechId() {
        return contactMechId;
    }

    public void setContactMechId(int contactMechId) {
        this.contactMechId = contactMechId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
