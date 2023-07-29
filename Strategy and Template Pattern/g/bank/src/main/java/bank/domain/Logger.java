package bank.domain;

public class Logger implements ObserverAccountEntry{
    @Override
    public void update(double amount) {
        System.out.println("Log amount changes: " + amount);
    }
}
