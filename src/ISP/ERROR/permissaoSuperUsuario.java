package ISP.ERROR;

import ISP.Produto;
import ISP.Usuario;

public interface permissaoSuperUsuario {
	void cadastrarProduto(Produto dataProduto);
	void editarProduto(Produto dataProduto);
	void deletarProduto(int produtoId);
	void consultarCarrinhoDeCompras(int usuarioId); // Função exclusiva de clitente
	void cadastrarUsuario(Usuario usuario);
	void editarUsuario(Usuario usuario);
	void consultarUsuario(int usuarioId);
	void deletarUsuario(int usuarioId);
	void visualizarVendas(int usuarioId); // Função exclusiva do vendedor
	void consultarProduto(int produtoId);
}

//Interface genérica
