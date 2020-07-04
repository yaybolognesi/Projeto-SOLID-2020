package ISP;

public class PerfilUsuario extends Usuario implements permissaoUsuario {

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
	
}
