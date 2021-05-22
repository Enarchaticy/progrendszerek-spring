package com.example.prfproject.models.transaction;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String date;
    private int productid;
    private int value;

    public Transaction() {
    }

    public Transaction(int id, String date, int productid, int value) {
        this.id = id;
        this.date = date;
        this.productid = productid;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getProductId() {
        return productid;
    }

    public void setProductId(int productid) {
        this.productid = productid;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Product [date=" + date + ", id=" + id + ", productId=" + productid + ", value=" + value + "]";
    }

}