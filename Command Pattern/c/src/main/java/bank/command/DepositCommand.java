package bank.command;

import bank.domain.Account;

public class DepositCommand implements Command {

    private final Account account;
    private final Double amount;

    public DepositCommand(Account account, Double amount){
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.deposit(amount);
    }

    @Override
    public void unexecute() {
        account.withdraw(amount);
    }
}
