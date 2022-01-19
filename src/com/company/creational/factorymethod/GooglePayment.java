package com.company.creational.factorymethod;

public class GooglePayment implements Payment{
    @Override
    public void DoPayment() {
        System.out.println("Pagando con Google Pay");
    }
}
