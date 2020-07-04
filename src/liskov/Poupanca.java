package liskov;

public class Poupanca extends Conta{
	
	private double rendimento;
	
	public Poupanca() {
		setSaldo(0);
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	
	public void saque(double valor) {
		super.saque(valor);
		}
	}
