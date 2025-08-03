package com.rinha.model;

import lombok.Getter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
public class Payment {
    private UUID correlationId;
    private BigDecimal amount;

    public Payment(UUID correlationId, long amount) {
        this.correlationId = correlationId;
        this.amount = new BigDecimal(amount).movePointRight(2);
    }
}
