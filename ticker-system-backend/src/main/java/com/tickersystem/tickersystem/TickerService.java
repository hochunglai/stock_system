package com.tickersystem.tickersystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TickerService {

    private TickerRepository tickerRepository;
    @Autowired
    public TickerService(TickerRepository tickerRepository) {
        this.tickerRepository = tickerRepository;
    }

    public List<Ticker> getAll(){
        return tickerRepository.findAll();
    }

    public Ticker getSingleTicker(String ticker){
        return tickerRepository.findStockByTicker(ticker);
    }

    public Ticker saveTicker(Ticker ticker){
        return tickerRepository.save(ticker);
    }
}
