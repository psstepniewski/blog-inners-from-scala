package tech.stepniewski.example1;

import java.math.BigInteger;

public class InternalDebt implements VerificationResult {
    private final String agreementNumber;
    private final BigInteger debtAmount;

    public InternalDebt(String agreementNumber, BigInteger debtAmount) {
        this.agreementNumber = agreementNumber;
        this.debtAmount = debtAmount;
    }

    public String getAgreementNumber() {
        return agreementNumber;
    }

    public BigInteger getDebtAmount() {
        return debtAmount;
    }
}