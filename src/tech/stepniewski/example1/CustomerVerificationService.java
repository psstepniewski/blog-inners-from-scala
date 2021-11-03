package tech.stepniewski.example1;

import java.math.BigInteger;

public class CustomerVerificationService {

    public VerificationResult verifyPaymentHistory(Customer customer) {
        //omitted code
        return new PositiveDecision(BigInteger.valueOf(6000L));
    }
}