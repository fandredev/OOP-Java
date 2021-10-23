package bytebank;

public class TestMethods {

	public static void main(String[] args) {
		Account accountUser = new Account();
		accountUser.deposit_value(50);
		
		accountUser.deposit_value(10.30);
		System.out.println(accountUser.getBalance());
		
		accountUser.toWithdraw(30);
		System.out.println("O saldo agora é " + accountUser.getBalance());
		
		Account accountUserMarcela = new Account();
		accountUserMarcela.deposit_value(1000);
		accountUserMarcela.transfer(300, accountUser);

		System.out.println(accountUserMarcela.getBalance());
		System.out.println(accountUser.getBalance());
	}

}
