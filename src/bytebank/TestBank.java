package bytebank;

public class TestBank {
	public static void main(String[] args) {
		Client clientFelipe = new Client();
		clientFelipe.name = "Felipe André";
		clientFelipe.cpf = "222.222.222-22";
		clientFelipe.profession = "Programador";
		
		Account accountFelipe = new Account();
		accountFelipe.deposit_value(100);
		accountFelipe.holder = clientFelipe;
		
		System.out.println(accountFelipe.holder.name);
		
	}
}	
