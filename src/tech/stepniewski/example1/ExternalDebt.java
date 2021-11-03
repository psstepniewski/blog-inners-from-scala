package tech.stepniewski.example1;

import java.math.BigInteger;

public class ExternalDebt implements VerificationResult {
    private final String debtSource;
    private final BigInteger debtAmount;

    public ExternalDebt(String debtSource, BigInteger debtAmount) {
        this.debtSource = debtSource;
        this.debtAmount = debtAmount;
    }

    public String getDebtSource() {
        return debtSource;
    }

    public BigInteger getDebtAmount() {
        return debtAmount;
    }
}
