package ISP;

public interface permissaoGerente extends permissaoUsuario {
	void podeCadastrarProduto(Produto produto);
	void podeEditarProduto(Produto produto);
	void podeDeletarProduto(int produtoId);
	void podeConsultarProduto(int produtoId);
}
