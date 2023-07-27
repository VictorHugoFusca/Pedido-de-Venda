package entidades;

import java.util.Date;

public class Pedido {
	private int idPedido;
	private int quantidade;
	private Date data;
	private Cliente cliente;
	private Produto produto;

	public Pedido() {
	}

	public Pedido(int idPedido, int quantidade, Date data, Cliente cliente, Produto produto) {
		this.criarPedido(idPedido, quantidade, data, cliente, produto);
	}

	public int getIdPedido() {
		return idPedido;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public Date getData() {
		return data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public void criarPedido(int idPedido, int quantidade, Date data, Cliente cliente, Produto produto) {
		this.idPedido = idPedido;
		this.quantidade = quantidade;
		this.data = data;
		this.cliente = cliente;
		this.produto = produto;
	}

	public void exibirPedido(Pedido pedido) {
		System.out.println("- - - -Iformações do Pedido- - - -");
		System.out.println("ID: " + pedido.getIdPedido());
		System.out.println("Quantidade: " + pedido.getQuantidade());
		System.out.println("Data: " + pedido.getData());
		System.out.println("Cliente: " + pedido.getCliente().getNome());
		System.out.println("Produto: " + pedido.getProduto().getNome());
		System.out.println("----------------------------------");
	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", quantidade=" + quantidade + ", data=" + data + ", cliente=" + cliente
				+ ", produto=" + produto + "]";
	}
}
