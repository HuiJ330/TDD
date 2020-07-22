package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class AccountTests {
    @Test
    //@Ignore  // Remove each @Ignore and implement test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        Account account = new Account(100);
        float money = 50;
        float newMoney = 150;
        account.withdraw(money);

        assertThat(account.getMoney(), is(newMoney));
    }

    @Test
    @Ignore  // Remove each @Ignore and implement test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){

    }

    @Test
    @Ignore  // Remove each @Ignore and implement test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){

    }
}
