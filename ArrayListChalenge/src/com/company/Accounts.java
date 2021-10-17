package com.company;

public class Accounts {
    private String AccountName;
    private int AccountNumber;

    public Accounts(String accountName, int accountNumber) {
        AccountName = accountName;
        AccountNumber = accountNumber;
    }

    public String getAccountName() {
        return AccountName;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

}
