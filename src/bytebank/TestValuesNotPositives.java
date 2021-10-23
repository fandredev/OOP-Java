package bytebank;

public class TestValuesNotPositives {
	public static void main(String[] args) {
		Account account = new Account();
		account.deposit_value(100);
		account.toWithdraw(200);
		
		System.out.println(account.getBalance());
		
	}
}
