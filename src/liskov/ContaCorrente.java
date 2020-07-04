package liskov;

public class ContaCorrente extends Conta {
	
	private double limiteEspecial;
	
	public ContaCorrente() {
		this.setLimiteEspecial(100);
		setSaldo(0);
		}

	public double getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}
	
	public void saque(double valor) {
		if (getSaldo() - valor > 0) {
			setSaldo(getSaldo()- valor);
		}
	}
}
