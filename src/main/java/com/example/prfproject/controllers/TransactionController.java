package com.example.prfproject.controllers;

import java.util.List;

import com.example.prfproject.models.transaction.Transaction;
import com.example.prfproject.models.transaction.TransactionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TransactionController {
    TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping(path = "/transaction", consumes = "application/json")
    public String newTransaction(@RequestBody Transaction transaction) {
        try {
            this.transactionService.addTransaction(transaction);
            return "Success";
        } catch (Exception e) {
            return "Error, check server errors";
        }
    }

    @GetMapping(path = "/transactions")
    public List<Transaction> getAllTransactions() {
        try {
            List<Transaction> transactions = this.transactionService.getAllTransaction();
            return transactions;
        } catch (Exception e) {
            return null;
        }
    }

    @GetMapping(path = "/transaction")
    public Transaction getTransactionByProductId(@RequestParam int id) {
        try {
            Transaction transaction = this.transactionService.getTransactionByProductId(id);
            return transaction;
        } catch (Exception e) {
            return null;
        }
    }
}
