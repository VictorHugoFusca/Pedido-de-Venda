package entidades;

public class Produto {
	private int idProduto;
	private String nome;
	private double preco;

	public Produto(int idProduto, String nome, double preco) {
		this.idProduto = idProduto;
		this.nome = nome;
		this.preco = preco;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", nome=" + nome + ", preco=" + preco + "]";
	}
}
