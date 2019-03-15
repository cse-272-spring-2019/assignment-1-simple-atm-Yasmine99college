package project;

public  class Accounts {
 private AccountData accountdata;

public void AccountData(AccountData accountdata) {
	this.accountdata=accountdata;
}

  
public  AccountData getAccountData() {return accountdata;}

public void Deposit(double amount) {UpdateBalance (getBalance()+amount);
	}
	
	public boolean Withdraw(double amount) {if (Canwithdraw(amount)) {UpdateBalance (getBalance()-amount);
		return true;
		
	}
	else {return false;}
	}
	protected double getBalance() {return accountdata.getBalance();}
	public boolean Canwithdraw(double amount) {return accountdata.getBalance()>=amount;}
	public void UpdateBalance(double newBalance) {accountdata=new AccountData(newBalance);}
}

