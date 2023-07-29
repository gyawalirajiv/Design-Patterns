package bank.domain;

public class SMSSender implements ObserverAccountEntry{
    @Override
    public void update(double amount) {
        System.out.println("Send SMS with " + amount);
    }
}
