package com.example.BankManagement.modules.transaction.service;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TransactionService {

    public String Card_by_card() {}

    public Transaction creatTransaction() {}


    public String deposit() {}

    public String withdraw() {}


    public List<TransactionDTO> getTransactions() {}


    public List<TransactionDTO> getSourceTransactionsByCardId() {}


    public List<TransactionDTO> getDestinationTransactionsByCardId() {}


    public TransactionDTO getByUUID(){}

    public List<TransactionDTO> getSourceAndDestinationByCardId (){}
}
