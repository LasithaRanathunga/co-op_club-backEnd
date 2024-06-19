package com.coopfarmer.coopfarmer.buyer;

import com.coopfarmer.coopfarmer.order.OrderPlacement;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;
import java.util.UUID;
@Entity
public class Buyer {
    @Id
    @GeneratedValue(generator="UUID")
    @GenericGenerator(
            name ="UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name ="id", updatable = false, nullable = false)
    private UUID id;
    private String firstName;
    private String lastName;
    private  String address;
    private String password;
    private String telNumber;
    private String role;
    @OneToMany(mappedBy = "owner")
    private List<OrderPlacement> orderPlacements;

    public Buyer() {

    }

    public Buyer(String firstName, String lastName, String address, String password, String telNumber, String role, List<OrderPlacement> orderPlacements) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.password = password;
        this.telNumber = telNumber;
        this.role = role;
        this.orderPlacements = orderPlacements;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<OrderPlacement> getItems() {
        return orderPlacements;
    }

    public void setItems(List<OrderPlacement> orderPlacements) {
        this.orderPlacements = orderPlacements;
    }
}
