package loja.imposto;

import java.math.BigDecimal;

import loja.Pedido;
import loja.PedidoInterface;
import loja.PedidoProxy;

public class TestaImposto {
	public static void main(String[] args) {
		Imposto imposto = new ICMS(null);
		imposto = new ISS(imposto);
		imposto = new IPI(imposto);
		
		CalculadoraDeImposto calculadoraDeImposto = 
				new CalculadoraDeImposto(imposto);
		
		PedidoInterface pedido = new PedidoProxy(new Pedido(new BigDecimal("100")));
		BigDecimal valorImposto = calculadoraDeImposto.calcular(pedido);
		
		System.out.println(valorImposto);
		
		
		
	}
}
