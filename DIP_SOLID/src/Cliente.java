
public class Cliente implements InterfaceCliente{
	public String nome;
	public String email;
	public String celular;
	
	@Override
	public void saveCliente(Object String, Object String2, Object String3) {
		// TODO Auto-generated method stub		
	}
	
	
	public Cliente(String nome, String email, String celular) {
		this.nome = nome;
		this.email = email;
		this.celular = celular;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	
	
	
}
