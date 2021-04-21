package loja;

import java.math.BigDecimal;

import loja.situacao.Situacao;

public interface PedidoInterface {

	SituacaoHandler getHandler();

	void abrirChamado();

	int getQuantidadeDeItens();

	BigDecimal getValor();

	void setSituacao(Situacao situacao);

	void pagar();

	void entregar();

	void cancelar();

	void reabrir();

	Situacao getSituacao();

}