package com.example.BankManagement.modules.account.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class AccountController {


    @PostMapping("/register/{customerId}/{bankId}")
    public ResponseEntity<AccountDTO> registerAccount() {

    }

    @GetMapping("/get/accounts")
    public List<AccountDTO> getAllAccounts() {

    }
}
