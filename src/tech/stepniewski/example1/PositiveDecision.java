package tech.stepniewski.example1;

import java.math.BigInteger;

public class PositiveDecision implements VerificationResult {
    private final BigInteger maxAmount;

    public PositiveDecision(BigInteger maxAmount) {
        this.maxAmount = maxAmount;
    }

    public BigInteger getMaxAmount() {
        return maxAmount;
    }
}
