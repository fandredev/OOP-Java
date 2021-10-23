package bytebank;

public class Client {
	private String name;
	private String cpf;
	private String profession;

	String getCpf() {
		return this.cpf;
	}

	void setCpf(String cpf) {
		this.cpf = cpf;
	}

	String getName() {
		return this.name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getProfession() {
		return this.profession;
	}

	void setProfession(String profession) {
		this.profession = profession;
	}
}
