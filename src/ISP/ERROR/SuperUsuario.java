package ISP.ERROR;

import ISP.Produto;
import ISP.Usuario;

public class SuperUsuario implements permissaoSuperUsuario {

	public void cadastrarProduto(Produto dataProduto) {
		// ...
	}

	public void editarProduto(Produto dataProduto) {
		// ...
	}

	public void deletarProduto(int produtoId) {
		// ...
	}

	public void consultarCarrinhoDeCompras(int usuarioId) { // Método exclusivo do cliente
		// Se usar uma interface com esse método, a classe será obrigada a implementa-la, mesmo que não
		// vá usar, e isso vai contra o princípio do ISP
	}

	public void cadastrarUsuario(Usuario usuario) {
		// ...
	}

	public void editarUsuario(Usuario usuario) {
		// ...
	}

	public void consultarUsuario(int usuarioId) {
		// ...
	}

	public void deletarUsuario(int usuarioId) {
		// ...
	}

	public void visualizarVendas(int usuarioId) {
		// ...
	}

	public void consultarProduto(int produtoId) {
		// ...
	}

}
