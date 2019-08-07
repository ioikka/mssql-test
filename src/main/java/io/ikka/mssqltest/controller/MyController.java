package io.ikka.mssqltest.controller;

import io.ikka.mssqltest.CustomerRepository;
import io.ikka.mssqltest.model.entity.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
public class MyController {

    private final CustomerRepository customerRepository;

    @GetMapping(value = "/time")
    public ResponseEntity<?> get() {
        return ResponseEntity.ok(LocalDateTime.now());
    }

    @GetMapping(value = "/customer/{id}")
    public ResponseEntity<?> getCustomer(@PathVariable(name = "id") Long id) {
        Optional<Customer> byId = customerRepository.findById(id);
        return ResponseEntity.ok(byId.orElse(new Customer()));
    }

    @GetMapping(value = "/ccustomer/{id}")
    public ResponseEntity<?> getCcustomer(@PathVariable(name = "id") Long id) {
        Object byId = customerRepository.cccc(id);
        return ResponseEntity.ok(byId);
    }
 }
