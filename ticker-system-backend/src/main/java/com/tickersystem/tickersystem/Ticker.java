package com.tickersystem.tickersystem;

import jakarta.persistence.*;
import org.springframework.stereotype.Service;

@Entity
@Table
public class Ticker {
    @Id
    @SequenceGenerator(
            name = "ticker_sequence",
            sequenceName = "ticker_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "ticker_sequence"
    )
    private Long id;

    private String ticker;
    private int market_cap;

    public Ticker() {
    }

    public Ticker(String ticker, int market_cap) {
        this.ticker = ticker;
        this.market_cap = market_cap;
    }

    public Ticker(Long id, String ticker, int market_cap) {
        this.id = id;
        this.ticker = ticker;
        this.market_cap = market_cap;
    }

    public Long getId() {
        return id;
    }

    public String getTicker() {
        return ticker;
    }

    public int getMarket_cap() {
        return market_cap;
    }
}
