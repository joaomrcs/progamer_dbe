package loja.desconto;

import java.math.BigDecimal;

import loja.PedidoInterface;

public class CalculadoraDeDesconto {

	public BigDecimal calcular(PedidoInterface pedido) {
		Desconto cadeiaDeDesconto = 
				new DescontoPorValor(
				new DescontoPorQuantidadeDeItens(
				new SemDesconto()
		));
		
		return cadeiaDeDesconto.calcular(pedido);
	}
	
}
