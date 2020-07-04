package ISP.ERROR;

import ISP.Produto;
import ISP.Usuario;

public interface permissaoSuperUsuario {
	void cadastrarProduto(Produto dataProduto);
	void editarProduto(Produto dataProduto);
	void deletarProduto(int produtoId);
	void consultarCarrinhoDeCompras(int usuarioId);
	void cadastrarUsuario(Usuario usuario);
	void editarUsuario(Usuario usuario);
	void consultarUsuario(int usuarioId);
	void deletarUsuario(int usuarioId);
	void visualizarVendas(int usuarioId);
	void consultarProduto(int produtoId);
}
