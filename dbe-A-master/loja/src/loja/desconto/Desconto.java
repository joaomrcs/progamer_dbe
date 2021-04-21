package loja.desconto;

import java.math.BigDecimal;

import loja.PedidoInterface;

public abstract class Desconto {
	
	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}

	public BigDecimal calcular(PedidoInterface pedido) {
		
		if (deveAplicar(pedido)) return aplicar(pedido);
		
		return proximo.calcular(pedido);
	}

	protected abstract BigDecimal aplicar(PedidoInterface pedido);

	protected abstract boolean deveAplicar(PedidoInterface pedido);
}
