package bank.command;

import bank.domain.Account;

public class TransferCommand implements Command {

    private final Account from;
    private final Account to;
    private final Double amount;

    public TransferCommand(Account from, Account to, Double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    @Override
    public void execute() {
        from.withdraw(amount);
        to.deposit(amount);
    }

    @Override
    public void unexecute() {
        to.withdraw(amount);
        from.deposit(amount);
    }
}
