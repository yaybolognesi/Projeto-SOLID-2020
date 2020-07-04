package ISP;

public interface permissaoVendedor extends permissaoUsuario {
	void podeVisualizarVendas(int usuarioId);
	void podeConsultarProduto(int produtoId);
}
