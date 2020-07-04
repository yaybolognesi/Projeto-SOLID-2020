package liskov;

public abstract class Conta {
	
	private String nome;
	private double saldo;
	
	public Conta() {
		this.setSaldo(0);
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void saque(double valor) {
		if (getSaldo() - valor > 0) {
			setSaldo(getSaldo()- valor);
		}
	}
	
}
