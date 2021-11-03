package tech.stepniewski.example1;

public class BlackListedCustomer implements VerificationResult {
    private final String reason;

    public BlackListedCustomer(String reason) {
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }
}
