package com.example.prfproject.models.transaction;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {

    TransactionRepository transactionRepository;

    @Autowired
    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public void addTransaction(Transaction transaction) {
        this.transactionRepository.save(transaction);
    }

    @Override
    public List<Transaction> getAllTransaction() {
        List<Transaction> transactions = this.transactionRepository.findAll();
        return transactions;
    }

    @Override
    public Transaction getTransactionByProductId(int id) {
        Transaction transaction = this.transactionRepository.findById(id).get();
        return transaction;
    }

}
