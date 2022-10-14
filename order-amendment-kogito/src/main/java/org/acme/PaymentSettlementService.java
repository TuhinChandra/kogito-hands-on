package org.acme;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class PaymentSettlementService {

    public SalesOrderLine settlePayment(SalesOrderLine line) {
        Random random = new Random();
        int randomNumber = random.nextInt(3 - 1) + 1;
        System.out.println("Order = " + line + " randomNumber=" + randomNumber);
        if (randomNumber == 2) {
            line.setPaymentSettled(true);
        } else {
            line.setPaymentSettled(false);
        }
        System.out.println("Is Payment Settled = " + line.isPaymentSettled());
        return line;
    }
}