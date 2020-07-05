
public class Email implements InterfaceEmail{
	public void enviarEmail(InterfaceCliente cliente, String assunto, String mensagem) {
		System.out.println("Email enviado para: "+ cliente.getEmail() + "\nAssunto: " + assunto + "\nMensagem:" + mensagem);
	}
}


