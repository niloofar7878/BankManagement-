package com.example.BankManagement.modules.customer.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class CustomerController {

    public ResponseEntity<CustomerDTO> registerCustomer() {}

    @PutMapping("/update")
    public ResponseEntity<CustomerDTO> updateCustomer() {}

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteById() {}

    @GetMapping("/get/customers")
    @ResponseBody
    public List<CustomerDTO> getAllCustomers() {}


    @PutMapping("/block/{cusId}")
    public void Blocked() {}

    @PutMapping("/unblock/{cusId}")
    public void unBlocked() {}


}
