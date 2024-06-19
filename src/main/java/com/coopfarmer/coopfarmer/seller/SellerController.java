package com.coopfarmer.coopfarmer.seller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SellerController {

    @Autowired
    private SellerRepository repository;

    @PostMapping("/signin-seller")
    public Seller addUser(@RequestBody Seller seller) {
        repository.save(seller);
        return seller;
    }

}
