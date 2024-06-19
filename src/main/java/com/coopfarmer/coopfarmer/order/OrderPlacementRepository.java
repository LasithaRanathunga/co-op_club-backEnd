package com.coopfarmer.coopfarmer.order;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderPlacementRepository extends JpaRepository<OrderPlacement, UUID> {
}
