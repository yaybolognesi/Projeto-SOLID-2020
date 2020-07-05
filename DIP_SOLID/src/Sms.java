
public class Sms implements InterfaceSms{
	public void enviarSms(InterfaceCliente cliente, String mensagem) {
		System.out.println("Sms enviado para: "+ cliente.getCelular() + "\nMensagem:" + mensagem);
	}
}


