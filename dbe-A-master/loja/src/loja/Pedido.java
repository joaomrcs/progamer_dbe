package loja;

import java.math.BigDecimal;

import loja.situacao.Aberto;
import loja.situacao.Situacao;

public class Pedido implements PedidoInterface {

	private BigDecimal valor;
	private int quantidadeDeItens;
	private Situacao situacao;
	private SituacaoHandler handler;
	
	@Override
	public SituacaoHandler getHandler() {
		return handler;
	}

	@Override
	public void abrirChamado() {
		this.situacao.abrirChamado(this);
	}

	@Override
	public int getQuantidadeDeItens() {
		return quantidadeDeItens;
	}

	public Pedido(BigDecimal valor) {
		this.valor = valor;
		this.quantidadeDeItens = 1;
		this.situacao = new Aberto();
		this.handler = new SituacaoHandler();
	}

	public Pedido(BigDecimal valor, int quantidadeDeItens) {
		this.valor = valor;
		this.quantidadeDeItens = quantidadeDeItens;
		this.situacao = new Aberto();
		this.handler = new SituacaoHandler();
	}

	@Override
	public BigDecimal getValor() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return valor;
	}

	@Override
	public void setSituacao(Situacao situacao) {
		this.handler.notificar(this);
		this.situacao = situacao;
	}

	@Override
	public void pagar() {
		this.situacao.pagar(this);
	}

	@Override
	public void entregar() {
		this.situacao.entregar(this);
	}

	@Override
	public void cancelar() {
		this.situacao.cancelar(this);
	}

	@Override
	public void reabrir() {
		this.situacao.reabrir(this);
	}

	@Override
	public Situacao getSituacao() {
		return situacao;
	}
	
	

}
