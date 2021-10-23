package bytebank;

public class TestGetAndSet {
	public static void main(String[] args) {
		Account account = new Account();
		account.setNumberAccount(1337);
		System.out.println(account.getNumberAccount());

		Client felipe = new Client();
		felipe.setName("Felipe André");

		account.setHolder(felipe);

		System.out.println(account.getHolder().getName());
		account.getHolder().setProfession("Programador de Software");
		account.getHolder().getCpf("441.820.900-32")
	}
}
