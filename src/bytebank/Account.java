package bytebank;

public class Account {
	private double balance;
	private int agency;
	private int number;
	public Client holder;

	void deposit_value(double value_deposit) {
		this.balance += value_deposit;
	}

	boolean toWithdraw(double value_withraw) {
		if (this.balance >= value_withraw) {
			this.balance -= value_withraw;
			return true;
		}
		return false;
	}

	boolean transfer(double value, Account destinatary) {
		if (this.balance >= value) {
			this.balance -= value;
			destinatary.deposit_value(value);
			return true;
		}
		return false;
	}

	double getBalance() {
		return this.balance;
	}

	// Number
	int getNumberAccount() {
		return this.number;
	}

	void setNumberAccount(int number) {
		this.number = number;
	}

	// Agency
	int getAgencyAccount() {
		return this.agency;
	}

	void setAgencyAccount(int agency) {
		this.agency = agency;
	}

	// Holder
	public void setHolder(Client holder) {
		this.holder = holder;
	}

	Client getHolder() {
		return this.holder;
	}
}
