package bytebank;

public class TestMethods {

	public static void main(String[] args) {
		Account accountUser = new Account();
		accountUser.balance = 50;
		
		accountUser.deposit_value(10.30);
		System.out.println(accountUser.balance);
		
		accountUser.toWithdraw(30);
		System.out.println("O saldo agora é " + accountUser.balance);
		
		Account accountUserMarcela = new Account();
		accountUserMarcela.deposit_value(1000);
		accountUserMarcela.transfer(300, accountUser);

		System.out.println(accountUserMarcela.balance);
		System.out.println(accountUser.balance);
	}

}
