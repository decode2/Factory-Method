package com.company.creational.factorymethod;

public class CardPayment implements Payment{

    @Override
    public void DoPayment() {
        System.out.println("Pagando con tarjeta de credito");
    }
}
