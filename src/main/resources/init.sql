DROP TABLE OF EXISTS products;
CREATE TABLE products(id SERIAL PRIMARY KEY, name VARCHAR(255), description VARCHAR(255), price INTEGER, inStock BOOLEAN);

DROP TABLE OF EXISTS transactions;
CREATE TABLE transactions(id SERIAL PRIMARY KEY, date VARCHAR(255), productId INTEGER, value INTEGER);

CREATE SEQUENCE IF EXISTS hibernate_sequence;
DROP SEQUENCE hibernate_sequence START 1;

CREATE SEQUENCE IF EXISTS hibernate_sequence_trans;
DROP SEQUENCE hibernate_sequence_trans START 1;

private int id;

    private String date;
    private int productId;
    private int value;
---------------------------

    private int id;

    
    private String name;
    private String description;
    private int price;
    private boolean inStock;