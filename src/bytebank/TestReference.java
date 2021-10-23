package bytebank;

public class TestReference {

	public static void main(String[] args) {
		Account firstAccount = new Account();
		firstAccount.balance = 300;
		System.out.println("saldo primeira conta: " + firstAccount.balance);

		Account secondAccount = firstAccount;
		System.out.println("saldo segunda conta: " + secondAccount.balance);

		if(firstAccount == secondAccount) 
			System.out.println("é a mesma conta");
		
		System.out.println(firstAccount);
		System.out.println(secondAccount);
	}

}
