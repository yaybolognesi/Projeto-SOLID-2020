package ISP;

public class PerfilVendedor extends Usuario implements permissaoVendedor{
	
	Produto CrudProduto;
	
	public void podeCadastrarUsuario(Usuario usuario) {
		cadastrarUsuario(usuario);
	}

	public void podeEditarUsuario(Usuario usuario) {
		editarUsuario(usuario);
	}

	public void podeConsultarUsuario(int usuarioId) {
		consultarUsuario(usuarioId);
	}

	public void podeDeletarUsuario(int usuarioId) {
		deletarUsuario(usuarioId);
	}

	public void podeConsultarProduto(int produtoId) {
		CrudProduto.consultarProduto(produtoId);
	}
	
	public void podeVisualizarVendas(int usuarioId) {
		//...
	}
	
}
