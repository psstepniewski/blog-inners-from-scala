package tech.stepniewski.example2;

import java.math.BigInteger;

public class CustomerVerificationService {

    public  Result verifyPaymentHistory(Customer customer) {
        //omitted code
        return new Results.PositiveDecision(BigInteger.valueOf(8000L));
    }

    public static class Customer {
        private final String pesel;
        private final String firstName;
        private final String lastName;
        private final String idNumber;

        public Customer(String pesel, String firstName, String lastName, String idNumber) {
            this.pesel = pesel;
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = idNumber;
        }

        public String getPesel() {
            return pesel;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getIdNumber() {
            return idNumber;
        }
    }

    public interface Result { }
    public interface Results {
        class BlackListedCustomer implements Result {
            private final String reason;

            public BlackListedCustomer(String reason) {
                this.reason = reason;
            }

            public String getReason() {
                return reason;
            }
        }
        class InternalDebt implements Result {
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
        class ExternalDebt implements Result {
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
        class PositiveDecision implements Result {
            private final BigInteger maxAmount;

            public PositiveDecision(BigInteger maxAmount) {
                this.maxAmount = maxAmount;
            }

            public BigInteger getMaxAmount() {
                return maxAmount;
            }
        }
    }
}
