package com.example.BankManagement.modules.account.model;

import com.example.BankManagement.modules.transaction.model.Transaction;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Account {

    @Id
    @Column(name = "ACCOUNT_ID")
    @SequenceGenerator(name = "ACCT_ID", initialValue = 2000)
    @GeneratedValue(generator = "ACCT_ID")
    private int accountId;

    private long accountNumber;
    private double accountBalance;

    private enum AccountType{
        SAVING_ACCOUNT (1, "saving account with interest"),
        CURRENT_ACCOUNT(2, "current account");

        private final int accountTypeCode;
        private final String accountTypeDesc;

        AccountType(int accountTypeCode, String accountTypeDesc) {
            this.accountTypeCode = accountTypeCode;
            this.accountTypeDesc = accountTypeDesc;
        }

        public int getAccountTypeCode() {
            return accountTypeCode;
        }

        public String getAccountTypeDesc() {
            return accountTypeDesc;
        }
    }

    @JsonIgnore
    @OneToMany
    List<Transaction> transactions;
    
    private String accountStatus;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createDateTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDateTime;


}
