package loja.situacao;

import loja.PedidoInterface;

public class Entregue extends Situacao {

	@Override
	public void abrirChamado(PedidoInterface pedido) {
		new ChamadoFacade().abrir();
		
		System.out.println("Chamado para pos venda");
	}

}
