package com.tickersystem.tickersystem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface TickerRepository extends JpaRepository<Ticker, Long> {

    @Query("SELECT t FROM Ticker t WHERE t.ticker = ?1")
    Ticker findStockByTicker(String ticker);

}
