package com.company.creational.factorymethod;

public class PaymentFactory {

    public static Payment buildPayment(TypePayment typePayment){

        switch (typePayment){
            case GOOGLEPAY: {
                return new GooglePayment();
            }
            case CARD: {
                return new CardPayment();
            }
            case PAYPAL:{
                return new PaypalPayment();
            }
            default: {
                return new CardPayment();
            }
        }
    }
}
