package com.ohgiraffers.common;

public interface Account {

    // 구현 책임화를 인터페이스로 지정해 놨다.
    String getBalance(); // 잔액
    String deposit(int money); // 입금
    String withdraw(int money); // 출금
}
