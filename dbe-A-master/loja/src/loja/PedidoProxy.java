package loja;

import java.math.BigDecimal;

import loja.situacao.Situacao;

public class PedidoProxy implements PedidoInterface{
	
	private PedidoInterface pedido;
	private BigDecimal valor;
	
	public PedidoProxy(PedidoInterface pedido) {
		super();
		this.pedido = pedido;
	}

	public SituacaoHandler getHandler() {
		return pedido.getHandler();
	}

	public void abrirChamado() {
		pedido.abrirChamado();
	}

	public int getQuantidadeDeItens() {
		return pedido.getQuantidadeDeItens();
	}

	public BigDecimal getValor() {
		if (valor == null) {
			valor = pedido.getValor();
		}
		return valor;
	}

	public void setSituacao(Situacao situacao) {
		pedido.setSituacao(situacao);
	}

	public void pagar() {
		pedido.pagar();
	}

	public void entregar() {
		pedido.entregar();
	}

	public void cancelar() {
		pedido.cancelar();
	}

	public void reabrir() {
		pedido.reabrir();
	}

	public Situacao getSituacao() {
		return pedido.getSituacao();
	}

}
