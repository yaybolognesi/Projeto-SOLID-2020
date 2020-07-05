
public class Main {
	
	public static void main(String[] args) {
		InterfaceCliente cliente = Factory.getCliente("João Marcos Maciel", "joaoMaciel@dipjava.com", "1296659874");
		
		InterfaceEmail email = Factory.getEmail();
		email.enviarEmail(cliente, "Sua solicitação de serviço", "Segue em axexo o seu número de solicitação de serviço.");
		
		InterfaceSms sms = Factory.getSms();
		sms.enviarSms(cliente, "Segue sua solicitação de serviço...");
	
	}
}

