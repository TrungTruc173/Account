package com.company;

import com.company.Account;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account();

        new Thread(()->{
            acc.sub(50000);
        }).start();

        new Thread(()->{
            acc.add(150000);
        }).start();
    }
}
