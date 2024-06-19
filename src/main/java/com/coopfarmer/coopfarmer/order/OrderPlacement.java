package com.coopfarmer.coopfarmer.order;

import com.coopfarmer.coopfarmer.buyer.Buyer;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Entity
public class OrderPlacement {

    @Id
    @GeneratedValue(generator="UUID")
    @GenericGenerator(
            name ="UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name ="id", updatable = false, nullable = false)
    private UUID id;
    private String name;
    private Double amount;
    @ManyToOne
    private Buyer owner;
    private Boolean delivered;

    public OrderPlacement() {

    }

    public OrderPlacement(String name, Double amount, Buyer owner, Boolean delivered) {
        this.name = name;
        this.amount = amount;
        this.owner = owner;
        this.delivered = delivered;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Buyer getOwner() {
        return owner;
    }

    public void setOwner(Buyer owner) {
        this.owner = owner;
    }

    public Boolean getDelivered() {
        return delivered;
    }

    public void setDelivered(Boolean delivered) {
        this.delivered = delivered;
    }
}
