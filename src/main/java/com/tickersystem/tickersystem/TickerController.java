package com.tickersystem.tickersystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/ticker")
public class TickerController {

    private final TickerService tickerService;

    @Autowired
    public TickerController(TickerService tickerService) {
        this.tickerService = tickerService;
    }

    @GetMapping
    public List<Ticker> getAllTicker() {
        return tickerService.getAll();
    }

    @GetMapping("/{ticker}")
    public Ticker getTicker(@PathVariable String ticker){
        return tickerService.getSingleTicker(ticker);
    }

}