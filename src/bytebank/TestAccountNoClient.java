package bytebank;

public class TestAccountNoClient {
	
	public static void main(String[] args) {
		Account accountMarcela = new Account();
		System.out.println(accountMarcela.balance);
		accountMarcela.holder = new Client();
		accountMarcela.holder.name = "Juju";
		System.out.println(accountMarcela.holder.name);
	}
}
