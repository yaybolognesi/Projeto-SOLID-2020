package liskov;

import java.util.ArrayList;
import java.util.List;

public class ProcessarPagamentos {
	
	public static void main(String[] args) {
		
		List<Conta> contas = new ArrayList<>();
		
		ContaCorrente contas1 = new ContaCorrente();
		contas1.setNome("ContaCorrente1");
		contas1.setSaldo(150);
		contas.add(contas1);
		
		ContaCorrente contas2 = new ContaCorrente();
		contas2.setNome("ContaCorrente2");
		contas2.setSaldo(60);
		contas.add(contas2);
		
		Poupanca poupanca = new Poupanca();
		poupanca.setNome("Poupança1");
		poupanca.setSaldo(20);
		contas.add(poupanca);
		
		
		contas1.saque(20);
		contas2.saque(20);
		poupanca.saque(10);
		
		//double valorRetirada = 80;
		
		//for (Conta conta : contas) {
			
			//if(conta.getSaldo() > 0) {
				//conta.saque(valorRetirada);
			//}else if (Conta.getLimiteEspecial() > valorRetirada) {
				//conta.saque(valorRetirada);
				//}
			System.out.println("O saldo atual da conta " + contas1.getNome() + " é " + contas1.getSaldo());
			System.out.println("O saldo atual da conta " + contas2.getNome() + " é " + contas2.getSaldo());
			System.out.println("O saldo atual da conta " + poupanca.getNome() + " é " + poupanca.getSaldo());
			
		}
	}
//}
