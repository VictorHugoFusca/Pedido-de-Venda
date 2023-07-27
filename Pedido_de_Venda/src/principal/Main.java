package principal;

import java.util.Date;

import entidades.Cliente;
import entidades.Pedido;
import entidades.Produto;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente(123, "Victor", "victor@email.com");
		
		Produto produto = new Produto(666, "Computador", 2000.00);
		
		Date data = new Date();
		
		Pedido pedido = new Pedido(1, 1, data, cliente, produto);
		
		pedido.exibirPedido(pedido);
		

	}

}
