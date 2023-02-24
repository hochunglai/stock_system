package com.tickersystem.tickersystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/add")
    public String postTicker(@RequestBody Ticker ticker){
        tickerService.saveTicker(ticker);
        return "new ticker added";
    }

}