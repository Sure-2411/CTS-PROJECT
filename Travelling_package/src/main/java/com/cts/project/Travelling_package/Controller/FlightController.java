package com.cts.project.Travelling_package.Controller;

import com.cts.project.Travelling_package.Model.Flight;
import com.cts.project.Travelling_package.Service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flights")
public class FlightController {

    @Autowired
    private FlightService flightService;

//    @GetMapping
//    public ResponseEntity> getAllFlights() {
//        List flights = flightService.getAllFlights();
//        return ResponseEntity.ok(flights);
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity getFlightById(@PathVariable Long id) {
//        Flight flight = flightService.getFlightById(id);
//        return ResponseEntity.ok(flight);
//    }
//
//    @PostMapping
//    public ResponseEntity createFlight(@RequestBody Flight flight) {
//        Flight newFlight = flightService.createFlight(flight);
//        return ResponseEntity.ok(newFlight);
//    }

    @PutMapping("/{id}")
    public ResponseEntity updateFlight(@PathVariable Long id, @RequestBody Flight flightDetails) {
        Flight updatedFlight = flightService.updateFlight(id, flightDetails);
        return ResponseEntity.ok(updatedFlight);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteFlight(@PathVariable Long id) {
        flightService.deleteFlight(id);
        return ResponseEntity.noContent().build();
    }
}
