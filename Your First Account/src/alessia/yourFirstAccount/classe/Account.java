package alessia.yourFirstAccount.classe;

public class Account {

	private String description;
	private double currBalance;
	
	
	public Account(String description, double currBalance) {
		this.description = description;
		this.currBalance = currBalance;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getCurrBalance() {
		return currBalance;
	}


	public void setCurrBalance(double currBalance) {
		this.currBalance = currBalance;
	}
	
	@Override
	public String toString() {
		return description + ": €" + currBalance;
	}
	
	
	public double withdraw(double MoneyWithdraw) {
		currBalance = currBalance - MoneyWithdraw;
		return currBalance;
	}
	

	public double deposit(double MoneyDeposit) {
		currBalance = currBalance + MoneyDeposit;
		return currBalance;
	}
	
	public double balance() {
		return currBalance;
	}
	
	
}
