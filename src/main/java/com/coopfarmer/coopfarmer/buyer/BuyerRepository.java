package com.coopfarmer.coopfarmer.buyer;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BuyerRepository extends JpaRepository<Buyer, UUID> {
}
