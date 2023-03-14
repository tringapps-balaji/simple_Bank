package org.example;
public class BankOne{
    private int number;
    private int bal=0;
    private String name;

    public  BankOne(int no, String name,int balance) {
        this.number = no;
        this.name = name;
        this.bal = balance;
    }

    public String toString()
    {
         return"\nName : "+name+"\t Account Number : "+number+"\t Balance : "+bal;
    }
}


