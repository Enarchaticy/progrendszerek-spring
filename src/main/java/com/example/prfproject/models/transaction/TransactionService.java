package com.example.prfproject.models.transaction;

import java.util.List;

public interface TransactionService {
    void addTransaction(Transaction transaction);

    List<Transaction> getAllTransaction();

    Transaction getTransactionByProductId(int id);

}
