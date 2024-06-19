package com.coopfarmer.coopfarmer.item;

import com.coopfarmer.coopfarmer.seller.Seller;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;
@Entity
public class Item {

    @Id
    @GeneratedValue(generator="UUID")
    @GenericGenerator(
            name ="UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name ="id", updatable = false, nullable = false)
    private UUID id;
    private String name;
    private Double unitPrice;
    private String description;
    @ManyToOne
    private Seller owner;


}


