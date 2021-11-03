package tech.stepniewski.example3;

import java.math.BigInteger;

public class CustomerVerificationService {

    public  Result verifyPaymentHistory(Customer customer) {
        //omitted code
        return new Results.PositiveDecision(BigInteger.valueOf(8000L));
    }

    public static record Customer(String pesel, String firstName, String lastName, String idNumber) { }
    public interface Result { }
    public interface Results {
        record BlackListedCustomer(String reason) implements Result { }
        record InternalDebt(String agreementNumber, BigInteger debtAmount) implements Result { }
        record ExternalDebt(String debtSource, BigInteger debtAmount) implements Result { }
        record PositiveDecision(BigInteger maxAmount) implements Result { }
    }
}
