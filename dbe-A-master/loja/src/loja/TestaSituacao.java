package loja;

import java.math.BigDecimal;

public class TestaSituacao {
	public static void main(String[] args) {
		PedidoInterface pedido = 
				new PedidoProxy(new Pedido(new BigDecimal("100")));
		
		System.out.println(pedido.getValor());
		
		pedido.abrirChamado();
		
		pedido.pagar();
		System.out.println(pedido.getSituacao());
		pedido.abrirChamado();
		
		System.out.println(pedido.getValor());
	
		//pedido.reabrir();

	}
}
