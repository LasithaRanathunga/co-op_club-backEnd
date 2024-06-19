package com.coopfarmer.coopfarmer.buyer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuyerController {
    @Autowired
    private BuyerRepository repository;
    @PostMapping("/signin-buyer")
    private Buyer createBuyer(@RequestBody Buyer buyer) {
        repository.save(buyer);

        return buyer;
    }
}
