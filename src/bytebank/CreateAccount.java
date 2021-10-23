package bytebank;

public class CreateAccount {
	public static void main(String[] args) {
		Account firstAccount = new Account();
		firstAccount.deposit_value(300);
		Account secondAccount = new Account();

		System.out.println("Saldo da primeira conta: " + firstAccount.getBalance());
		System.out.println("Saldo da segunda conta: " + secondAccount.getBalance());

		System.out.println(firstAccount.getAgencyAccount());
		System.out.println(firstAccount.getNumberAccount());

		if (firstAccount == secondAccount)
			System.out.println("São a mesma conta?");
		else
			System.err.println("Contas diferentes!");

		System.out.println(firstAccount);
		System.out.println(secondAccount);

	}
}
