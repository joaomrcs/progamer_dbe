package loja.situacao;

import loja.PedidoInterface;
import loja.StateException;

public abstract class Situacao {
	
	public abstract void abrirChamado(PedidoInterface pedido);
	
	public void pagar(PedidoInterface pedido) {
		throw new StateException("Não pode transitar para pago");
	}
	
	public void entregar(PedidoInterface pedido) {
		throw new StateException("Não pode transitar para entregue");
	}
	
	public void cancelar(PedidoInterface pedido) {
		throw new StateException("Não pode transitar para cancelado");
	}
	
	public void reabrir(PedidoInterface pedido) {
		throw new StateException("Não pode transitar para aberto");
	}


}
