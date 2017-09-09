package com.tools.dashboard.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Z_TOT_PROBLEMAS")		
public class ViewProblemas {
	
	@Id
	@Column(name="[Código]")
	private String codigoProblema;
	
	@Column(name="[Código Problema Pai]")
	private String codigoProblemaPai;
	
	@Column(name="[Data de Abertura]")
	private String dataAbertura;
	
	@Column(name="[Entidade Afetada]")
	private String entidadeAfetada;

	@Column(name="[Resumo]")
	private String resumo;
	
	@Column(name="[Descrição]")
	private String descricao;
	
	@Column(name="[Sintoma do Problema]")
	private String simtomaDoProblema;
	
	@Column(name="[Impacto Performance]")
	private String impactoPerformance;
	
	@Column(name="[Impacto Operacional]")
	private String impactoOperaciona;
	
	@Column(name="[Impacto Imagem]")
	private String impactoImagem;
	
	@Column(name="[Impacto Financeiro]")
	private String impactoFinanceiro;
	
	@Column(name="[Prioridade]")
	private String prioridade;
	
	@Column(name="[Status]")
	private String Status;
	
	@Column(name="[Causa Raíz]")
	private String causaRaiz;
	
	@Column(name="[Grupo Abertura]")
	private String grupoAbertura;

	@Column(name="[Reportado Por]")
	private String reportadoPor;
	
	@Column(name="[Grupo Responsável]")
	private String grupoResponsavel;
	
	@Column(name="[Responsável]")
	private String responsavel;
	
	@Column(name="[Data Última Modificação]")
	private String dataUltimaModificacao;
	
	@Column(name="[Garantia]")
	private String garantia;
	
	@Column(name="[Item Causador]")
	private String itemCausador;
	
	@Column(name="[RDM Causadora]")
	private String rdmCausadora;
	
	@Column(name="[RDM Solucionadora]")
	private String rdmSolucionadora;
	
	@Column(name="[Previsão para Implantação em Produção]")
	private String previsaoParaImplantacaoEmProducao;
	
	@Column(name="[Data Efetiva da Implantação]")
	private String dataEfetivaDaImplantacao;
	
	@Column(name="[Conclusão de Verificação de Eficácia]")
	private String conclusaoDeVerificacaoDeEficacia;
	
	@Column(name="[Data de Fechamento]")
	private String dataDeFechamento;
	
	@Column(name="[Atividade Avulsa]")
	private String atividadeAvulsa;
	
	@Column(name="[Item no Fornecedor]")
	private String itemFornecedor;
	
	@Column(name="[Item de Configuração]")
	private String itemDeConfiguracao;
	
	@Column(name="[Qtd de Incidentes]")
	private int quantidadeDeIncidentes;
	
	@Column(name="ultimo_incidente_aberto")
	private String ultimoIncidenteAberto;
	
	@Column(name="dt_ultimo_incidente_aberto")
	private String dataUltimoIncidenteAberto;

	/**
	 * @return the codigoProblema
	 */
	public String getCodigoProblema() {
		return codigoProblema;
	}

	/**
	 * @param codigoProblema the codigoProblema to set
	 */
	public void setCodigoProblema(String codigoProblema) {
		this.codigoProblema = codigoProblema;
	}

	/**
	 * @return the codigoProblemaPai
	 */
	public String getCodigoProblemaPai() {
		return codigoProblemaPai;
	}

	/**
	 * @param codigoProblemaPai the codigoProblemaPai to set
	 */
	public void setCodigoProblemaPai(String codigoProblemaPai) {
		this.codigoProblemaPai = codigoProblemaPai;
	}

	/**
	 * @return the dataAbertura
	 */
	public String getDataAbertura() {
		return dataAbertura;
	}

	/**
	 * @param dataAbertura the dataAbertura to set
	 */
	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	/**
	 * @return the entidadeAfetada
	 */
	public String getEntidadeAfetada() {
		return entidadeAfetada;
	}

	/**
	 * @param entidadeAfetada the entidadeAfetada to set
	 */
	public void setEntidadeAfetada(String entidadeAfetada) {
		this.entidadeAfetada = entidadeAfetada;
	}

	/**
	 * @return the resumo
	 */
	public String getResumo() {
		return resumo;
	}

	/**
	 * @param resumo the resumo to set
	 */
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the simtomaDoProblema
	 */
	public String getSimtomaDoProblema() {
		return simtomaDoProblema;
	}

	/**
	 * @param simtomaDoProblema the simtomaDoProblema to set
	 */
	public void setSimtomaDoProblema(String simtomaDoProblema) {
		this.simtomaDoProblema = simtomaDoProblema;
	}

	/**
	 * @return the impactoPerformance
	 */
	public String getImpactoPerformance() {
		return impactoPerformance;
	}

	/**
	 * @param impactoPerformance the impactoPerformance to set
	 */
	public void setImpactoPerformance(String impactoPerformance) {
		this.impactoPerformance = impactoPerformance;
	}

	/**
	 * @return the impactoOperaciona
	 */
	public String getImpactoOperaciona() {
		return impactoOperaciona;
	}

	/**
	 * @param impactoOperaciona the impactoOperaciona to set
	 */
	public void setImpactoOperaciona(String impactoOperaciona) {
		this.impactoOperaciona = impactoOperaciona;
	}

	/**
	 * @return the impactoImagem
	 */
	public String getImpactoImagem() {
		return impactoImagem;
	}

	/**
	 * @param impactoImagem the impactoImagem to set
	 */
	public void setImpactoImagem(String impactoImagem) {
		this.impactoImagem = impactoImagem;
	}

	/**
	 * @return the impactoFinanceiro
	 */
	public String getImpactoFinanceiro() {
		return impactoFinanceiro;
	}

	/**
	 * @param impactoFinanceiro the impactoFinanceiro to set
	 */
	public void setImpactoFinanceiro(String impactoFinanceiro) {
		this.impactoFinanceiro = impactoFinanceiro;
	}

	/**
	 * @return the prioridade
	 */
	public String getPrioridade() {
		return prioridade;
	}

	/**
	 * @param prioridade the prioridade to set
	 */
	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return Status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		Status = status;
	}

	/**
	 * @return the causaRaiz
	 */
	public String getCausaRaiz() {
		return causaRaiz;
	}

	/**
	 * @param causaRaiz the causaRaiz to set
	 */
	public void setCausaRaiz(String causaRaiz) {
		this.causaRaiz = causaRaiz;
	}

	/**
	 * @return the grupoAbertura
	 */
	public String getGrupoAbertura() {
		return grupoAbertura;
	}

	/**
	 * @param grupoAbertura the grupoAbertura to set
	 */
	public void setGrupoAbertura(String grupoAbertura) {
		this.grupoAbertura = grupoAbertura;
	}

	/**
	 * @return the reportadoPor
	 */
	public String getReportadoPor() {
		return reportadoPor;
	}

	/**
	 * @param reportadoPor the reportadoPor to set
	 */
	public void setReportadoPor(String reportadoPor) {
		this.reportadoPor = reportadoPor;
	}

	/**
	 * @return the grupoResponsavel
	 */
	public String getGrupoResponsavel() {
		return grupoResponsavel;
	}

	/**
	 * @param grupoResponsavel the grupoResponsavel to set
	 */
	public void setGrupoResponsavel(String grupoResponsavel) {
		this.grupoResponsavel = grupoResponsavel;
	}

	/**
	 * @return the responsavel
	 */
	public String getResponsavel() {
		return responsavel;
	}

	/**
	 * @param responsavel the responsavel to set
	 */
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	/**
	 * @return the dataUltimaModificacao
	 */
	public String getDataUltimaModificacao() {
		return dataUltimaModificacao;
	}

	/**
	 * @param dataUltimaModificacao the dataUltimaModificacao to set
	 */
	public void setDataUltimaModificacao(String dataUltimaModificacao) {
		this.dataUltimaModificacao = dataUltimaModificacao;
	}

	/**
	 * @return the garantia
	 */
	public String getGarantia() {
		return garantia;
	}

	/**
	 * @param garantia the garantia to set
	 */
	public void setGarantia(String garantia) {
		this.garantia = garantia;
	}

	/**
	 * @return the itemCausador
	 */
	public String getItemCausador() {
		return itemCausador;
	}

	/**
	 * @param itemCausador the itemCausador to set
	 */
	public void setItemCausador(String itemCausador) {
		this.itemCausador = itemCausador;
	}

	/**
	 * @return the rdmCausadora
	 */
	public String getRdmCausadora() {
		return rdmCausadora;
	}

	/**
	 * @param rdmCausadora the rdmCausadora to set
	 */
	public void setRdmCausadora(String rdmCausadora) {
		this.rdmCausadora = rdmCausadora;
	}

	/**
	 * @return the rdmSolucionadora
	 */
	public String getRdmSolucionadora() {
		return rdmSolucionadora;
	}

	/**
	 * @param rdmSolucionadora the rdmSolucionadora to set
	 */
	public void setRdmSolucionadora(String rdmSolucionadora) {
		this.rdmSolucionadora = rdmSolucionadora;
	}

	/**
	 * @return the previsaoParaImplantacaoEmProducao
	 */
	public String getPrevisaoParaImplantacaoEmProducao() {
		return previsaoParaImplantacaoEmProducao;
	}

	/**
	 * @param previsaoParaImplantacaoEmProducao the previsaoParaImplantacaoEmProducao to set
	 */
	public void setPrevisaoParaImplantacaoEmProducao(String previsaoParaImplantacaoEmProducao) {
		this.previsaoParaImplantacaoEmProducao = previsaoParaImplantacaoEmProducao;
	}

	/**
	 * @return the dataEfetivaDaImplantacao
	 */
	public String getDataEfetivaDaImplantacao() {
		return dataEfetivaDaImplantacao;
	}

	/**
	 * @param dataEfetivaDaImplantacao the dataEfetivaDaImplantacao to set
	 */
	public void setDataEfetivaDaImplantacao(String dataEfetivaDaImplantacao) {
		this.dataEfetivaDaImplantacao = dataEfetivaDaImplantacao;
	}

	/**
	 * @return the conclusaoDeVerificacaoDeEficacia
	 */
	public String getConclusaoDeVerificacaoDeEficacia() {
		return conclusaoDeVerificacaoDeEficacia;
	}

	/**
	 * @param conclusaoDeVerificacaoDeEficacia the conclusaoDeVerificacaoDeEficacia to set
	 */
	public void setConclusaoDeVerificacaoDeEficacia(String conclusaoDeVerificacaoDeEficacia) {
		this.conclusaoDeVerificacaoDeEficacia = conclusaoDeVerificacaoDeEficacia;
	}

	/**
	 * @return the dataDeFechamento
	 */
	public String getDataDeFechamento() {
		return dataDeFechamento;
	}

	/**
	 * @param dataDeFechamento the dataDeFechamento to set
	 */
	public void setDataDeFechamento(String dataDeFechamento) {
		this.dataDeFechamento = dataDeFechamento;
	}

	/**
	 * @return the atividadeAvulsa
	 */
	public String getAtividadeAvulsa() {
		return atividadeAvulsa;
	}

	/**
	 * @param atividadeAvulsa the atividadeAvulsa to set
	 */
	public void setAtividadeAvulsa(String atividadeAvulsa) {
		this.atividadeAvulsa = atividadeAvulsa;
	}

	/**
	 * @return the itemFornecedor
	 */
	public String getItemFornecedor() {
		return itemFornecedor;
	}

	/**
	 * @param itemFornecedor the itemFornecedor to set
	 */
	public void setItemFornecedor(String itemFornecedor) {
		this.itemFornecedor = itemFornecedor;
	}

	/**
	 * @return the itemDeConfiguracao
	 */
	public String getItemDeConfiguracao() {
		return itemDeConfiguracao;
	}

	/**
	 * @param itemDeConfiguracao the itemDeConfiguracao to set
	 */
	public void setItemDeConfiguracao(String itemDeConfiguracao) {
		this.itemDeConfiguracao = itemDeConfiguracao;
	}

	/**
	 * @return the quantidadeDeIncidentes
	 */
	public int getQuantidadeDeIncidentes() {
		return quantidadeDeIncidentes;
	}

	/**
	 * @param quantidadeDeIncidentes the quantidadeDeIncidentes to set
	 */
	public void setQuantidadeDeIncidentes(int quantidadeDeIncidentes) {
		this.quantidadeDeIncidentes = quantidadeDeIncidentes;
	}

	/**
	 * @return the ultimoIncidenteAberto
	 */
	public String getUltimoIncidenteAberto() {
		return ultimoIncidenteAberto;
	}

	/**
	 * @param ultimoIncidenteAberto the ultimoIncidenteAberto to set
	 */
	public void setUltimoIncidenteAberto(String ultimoIncidenteAberto) {
		this.ultimoIncidenteAberto = ultimoIncidenteAberto;
	}

	/**
	 * @return the dataUltimoIncidenteAberto
	 */
	public String getDataUltimoIncidenteAberto() {
		return dataUltimoIncidenteAberto;
	}

	/**
	 * @param dataUltimoIncidenteAberto the dataUltimoIncidenteAberto to set
	 */
	public void setDataUltimoIncidenteAberto(String dataUltimoIncidenteAberto) {
		this.dataUltimoIncidenteAberto = dataUltimoIncidenteAberto;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ViewProblemas [codigoProblema=" + codigoProblema + ", codigoProblemaPai=" + codigoProblemaPai
				+ ", dataAbertura=" + dataAbertura + ", entidadeAfetada=" + entidadeAfetada + ", resumo=" + resumo
				+ ", descricao=" + descricao + ", simtomaDoProblema=" + simtomaDoProblema + ", impactoPerformance="
				+ impactoPerformance + ", impactoOperaciona=" + impactoOperaciona + ", impactoImagem=" + impactoImagem
				+ ", impactoFinanceiro=" + impactoFinanceiro + ", prioridade=" + prioridade + ", Status=" + Status
				+ ", causaRaiz=" + causaRaiz + ", grupoAbertura=" + grupoAbertura + ", reportadoPor=" + reportadoPor
				+ ", grupoResponsavel=" + grupoResponsavel + ", responsavel=" + responsavel + ", dataUltimaModificacao="
				+ dataUltimaModificacao + ", garantia=" + garantia + ", itemCausador=" + itemCausador
				+ ", rdmCausadora=" + rdmCausadora + ", rdmSolucionadora=" + rdmSolucionadora
				+ ", previsaoParaImplantacaoEmProducao=" + previsaoParaImplantacaoEmProducao
				+ ", dataEfetivaDaImplantacao=" + dataEfetivaDaImplantacao + ", conclusaoDeVerificacaoDeEficacia="
				+ conclusaoDeVerificacaoDeEficacia + ", dataDeFechamento=" + dataDeFechamento + ", atividadeAvulsa="
				+ atividadeAvulsa + ", itemFornecedor=" + itemFornecedor + ", itemDeConfiguracao=" + itemDeConfiguracao
				+ ", quantidadeDeIncidentes=" + quantidadeDeIncidentes + ", ultimoIncidenteAberto="
				+ ultimoIncidenteAberto + ", dataUltimoIncidenteAberto=" + dataUltimoIncidenteAberto + "]";
	}
	
	
}
