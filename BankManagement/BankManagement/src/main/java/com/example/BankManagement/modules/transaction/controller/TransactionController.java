package com.example.BankManagement.modules.transaction.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.UUID;

public class TransactionController {

    @PostMapping("/withdraw")
    public ResponseEntity<String> withdraw() {}


    @PostMapping("/deposit/{accDestination}/{amount}")
    public ResponseEntity<String> deposit() {}

    @PostMapping("transfer/{accSource}/{accDestination}/{amount}")
    public ResponseEntity<String> TransferFromAccountToAccount() {}

    @GetMapping("/all/transactions")
    public List<TransactionDTO> getAllTransaction() {}

    @GetMapping("/source/transactions/{card}")
    public List<TransactionDTO> getSourceByCardId() {}

    @GetMapping("/destination/transactions")
    public List<TransactionDTO> getDestinationByCardId() {}

    @GetMapping("/get")
    public ResponseEntity<TransactionDTO> getByUUId() {}

    @GetMapping("/get/all/transactions")
    public ResponseEntity<List<TransactionDTO>> getAlltransactionByCardId() {}
}
