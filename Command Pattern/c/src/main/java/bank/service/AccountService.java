package bank.service;

import java.util.Collection;
import java.util.List;

import bank.command.DepositCommand;
import bank.command.HistoryList;
import bank.command.TransferCommand;
import bank.command.WithdrawCommand;
import bank.dao.AccountDAO;
import bank.dao.IAccountDAO;
import bank.domain.Account;
import bank.domain.Customer;


public class AccountService implements IAccountService {
	private IAccountDAO accountDAO;
	private HistoryList historyList;

	public AccountService(){
		accountDAO=new AccountDAO();
		historyList = new HistoryList();
	}

	public Account createAccount(long accountNumber, String customerName) {
		Account account = new Account(accountNumber);
		Customer customer = new Customer(customerName);
		account.setCustomer(customer);
		accountDAO.saveAccount(account);
		return account;
	}

	public void deposit(long accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		DepositCommand command = new DepositCommand(account, amount);
		historyList.addCommand(command);
		accountDAO.updateAccount(account);
	}

	@Override
	public void undo() {
		historyList.undo();
	}

	@Override
	public void redo() {
		historyList.redo();
	}

	public Account getAccount(long accountNumber) {
		Account account = accountDAO.loadAccount(accountNumber);
		return account;
	}

	public Collection<Account> getAllAccounts() {
		return accountDAO.getAccounts();
	}

	public void withdraw(long accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		WithdrawCommand command = new WithdrawCommand(account, amount);
		historyList.addCommand(command);
		accountDAO.updateAccount(account);
	}



	public void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description) {
		Account fromAccount = accountDAO.loadAccount(fromAccountNumber);
		Account toAccount = accountDAO.loadAccount(toAccountNumber);
		TransferCommand command = new TransferCommand(fromAccount, toAccount, amount);
		historyList.addCommand(command);
		accountDAO.updateAccount(fromAccount);
		accountDAO.updateAccount(toAccount);
	}
}
