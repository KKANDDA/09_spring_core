package com.ohgiraffers.common;

public class PersonalAccount implements Account{
// 구현 책임의 의무화로 오버라이딩해야 한다.

    private  final int bankCode; // 은행코드
    private final String accNo; // 계좌번호
    private int balance; // 잔액

    public PersonalAccount(int bankCode, String accNo) {
        this.bankCode = bankCode;
        this.accNo = accNo;
    }


    public int getBankCode() {
        return bankCode;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    @Override
    public String getBalance() {
        return this.accNo + " 계좌의 현재 잔액은 " + this.balance + "원 입니당!";
    }

    @Override
    public String deposit(int money) {
        String str = "";
        if (money > 0) {
            this.balance += money;
            str = money + "원이 입금되었습니당!";
        }else {
            str = "금액이 잘목 입금되었습니당!";
        }
        return str;
    }

    @Override
    public String withdraw(int money) {
        String str = "";
        if (this.balance >= money) {
            this.balance -= money;
            str = money + "원이 출금되었습니당!";
        }else {
            str = "현재 잔액은 " + this.balance + "원 입니당!" + "출금하시려는 "+ money + "원 보다 적으니 출금이 불가능합니당!";
        }
        return str;
    }

    @Override
    public String toString() {
        return "PersonalAccount{" +
                "bankCode=" + bankCode +
                ", accNo='" + accNo + '\'' +
                ", balance=" + balance +
                '}';
    }
}
