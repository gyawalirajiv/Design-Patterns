package bank.command;

import bank.domain.Account;

public class WithdrawCommand implements Command {
    private final Account account;
    private final Double amount;

    public WithdrawCommand(Account account, Double amount){
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.withdraw(amount);
    }

    @Override
    public void unexecute() {
        account.deposit(amount);
    }
}
