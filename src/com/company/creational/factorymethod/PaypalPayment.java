package com.company.creational.factorymethod;

public class PaypalPayment implements Payment{

    @Override
    public void DoPayment() {
        System.out.println("Pagando con Paypal");
    }
}
