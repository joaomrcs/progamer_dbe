package loja.imposto;

import java.math.BigDecimal;

import loja.PedidoInterface;

public class IPI extends Imposto {

	public IPI(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public BigDecimal calcular(PedidoInterface pedido) {
		BigDecimal valorDoImposto = pedido.getValor().multiply(new BigDecimal("0.06"));
		BigDecimal valorDoOutroImposto = BigDecimal.ZERO; 
				
		if (outroImposto != null) {
			valorDoOutroImposto = outroImposto.calcular(pedido);
		}
		
		return valorDoImposto.add(valorDoOutroImposto);
	}

}
