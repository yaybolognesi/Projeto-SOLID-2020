package ISP;

public interface permissaoUsuario {
	void podeCadastrarUsuario(Usuario usuario);
	void podeEditarUsuario(Usuario usuario);
	void podeConsultarUsuario(int usuarioId);
	void podeDeletarUsuario(int usuarioId);
}
