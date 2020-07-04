package ISP;

public class Produto extends CrudProduto {
	
	//Classe responsável só por construir o objeto Produto
	
	private int produtoId;
	private String nome;
	private double valor;
	
	public int getProdutoId() {
		return produtoId;
	}
	
	public void setProdutoId(int produtoId) {
		this.produtoId = produtoId;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
