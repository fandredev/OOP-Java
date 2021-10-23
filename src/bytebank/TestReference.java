package bytebank;

public class TestReference {

	public static void main(String[] args) {
		Account firstAccount = new Account();
		firstAccount.deposit_value(300);
		System.out.println("saldo primeira conta: " + firstAccount.getBalance());

		Account secondAccount = firstAccount;
		System.out.println("saldo segunda conta: " + secondAccount.getBalance());

		if(firstAccount == secondAccount) 
			System.out.println("é a mesma conta");
		
		System.out.println(firstAccount);
		System.out.println(secondAccount);
	}

}
