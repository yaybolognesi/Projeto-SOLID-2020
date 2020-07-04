package ISP;

public class Usuario extends CrudUsuario {
	
	//Classe responsável só por construir o objeto Usuario
	
	private int usuarioId;
	private String email;
	private String senha;
	private String name;
	private String cpf;
	private String tipoUsuario;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public int getId() {
		return usuarioId;
	}
	
	public void setId(int usuarioId) {
		this.usuarioId = usuarioId;
	}
	
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
//	public boolean setLogin(Usuario usuario) {
//		if(usuario.getSenha() == senhaLoja) {
//			System.out.print("Usuário logado");
//			return true;
//		}else {
//			System.out.print("Senha errada");
//			return false;
//		}
//	}
//	
//	public void logout(Usuario usuario) {
//		System.out.print("Usuário deslogado");
//	}
	
}
