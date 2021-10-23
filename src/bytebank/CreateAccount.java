package bytebank;

public class CreateAccount {
	public static void main(String[] args) {
		Account firstAccount = new Account();
		firstAccount.balance = 200;
		firstAccount.balance += 100;
		System.out.println(firstAccount.balance);
		
		Account secondAccount = new Account();
		secondAccount.balance = 300;
		System.out.println("Saldo da primeira conta: " + firstAccount.balance);
		System.out.println("Saldo da segunda conta: " + secondAccount.balance);

		System.out.println(firstAccount.agency);
		System.out.println(firstAccount.number);

		if(firstAccount == secondAccount)
			System.out.println("São a mesma conta?");
		else 
			System.err.println("Contas diferentes!");

	
		System.out.println(firstAccount);
		System.out.println(secondAccount);

	}
}
