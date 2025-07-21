package com.airplane.management.controller;

import com.airplane.management.model.Flight;
import com.airplane.management.service.FlightService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flights")
@CrossOrigin(origins = "http://localhost:3000") // allow React frontend
public class FlightController {

    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping
    public List<Flight> getAllFlights() {
        return flightService.getAllFlights();
    }

    @PostMapping("/book")
    public Flight bookFlight(@RequestBody Flight flight) {
        return flightService.saveFlight(flight);
    }
}
