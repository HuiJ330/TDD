package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    private float money;

    public Account(float money) {
        this.money = money;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public void withdraw(float moneyWithdraw) {
        this.money = money + moneyWithdraw;
    }
}
