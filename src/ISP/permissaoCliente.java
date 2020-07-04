package ISP;

public interface permissaoCliente extends permissaoUsuario {
	//Interface que orienta as implementações dos perfil cliente.
	void podeConsultarCarrinhoDeCompras(int usuarioId);
}
