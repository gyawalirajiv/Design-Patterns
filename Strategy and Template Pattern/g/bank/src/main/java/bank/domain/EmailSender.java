package bank.domain;

public class EmailSender implements ObserverAccountCreation{
    @Override
    public void update(long accountNumber) {
        System.out.println("Email sent: " + accountNumber);
    }
}
