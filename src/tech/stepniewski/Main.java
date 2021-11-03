package tech.stepniewski;

public class Main {

    public static void main(String[] args) {
        new tech.stepniewski.example1.CustomerVerificationService().verifyPaymentHistory(new tech.stepniewski.example1.Customer("88022411111","Paweł", "Testowy", "AAA00000"));
        new tech.stepniewski.example2.CustomerVerificationService().verifyPaymentHistory(new tech.stepniewski.example2.CustomerVerificationService.Customer("88022411111","Paweł", "Testowy", "AAA00000"));
        new tech.stepniewski.example3.CustomerVerificationService().verifyPaymentHistory(new tech.stepniewski.example3.CustomerVerificationService.Customer("88022411111","Paweł", "Testowy", "AAA00000"));
    }
}
