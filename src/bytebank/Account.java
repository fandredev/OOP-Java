package bytebank;

public class Account {
	double balance;
	int agency;
	int number;
	Client holder;
	

	void deposit_value(double value_deposit){
		this.balance += value_deposit;
	}
	
	boolean toWithdraw(double value_withraw) {
		if(this.balance >= value_withraw) {
			this.balance -= value_withraw;
			return true;
		}
		return false;
	}
	boolean transfer(double value, Account destinatary){
		if(this.balance >= value) {
			this.balance -= value;
			destinatary.deposit_value(value);
			return true;
		} 
		return false;
	}
}
