package com.tools.dashboard.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Z_TOT_TICKETS")
public class ViewTickets {

  @Id
  @Column(name="Incidente")
  private String incidente;

  @Column(name="[Usuário]")
  private String usuario;

  @Column(name="[Entidada Afetada]")
  private String entidadeAfetada;

  @Column(name="[Grupo Responsável]")
  private String grupoResponsavel;

  @Column(name="[Responsável]")
  private String responsavel;

  @Column(name="[Grupo Solucionador]")
  private String grupoSolucionador;

  @Column(name="[Analista Solucionador]")
  private String analistaSolucionador;

  @Column(name="[Reportado Por]")
  private String reportadoPor;

  @Column(name="[Resumo]")
  private String resumo;

  @Column(name="[Descrição]")
  private String descricao;

  @Column(name="[Data Abertura]")
  private String dataAbertura;

  @Column(name="[Data Solução]")
  private String dataSolucao;

  @Column(name="[Data Fechamento]")
  private String dataFechamento;

  @Column(name="[Data SLA]")
  private String dataSla;

  @Column(name="[Data/Hora do Retorno da Requisição]")
  private String dataHoraDoRetornoDaRequisicao;

  @Column(name="[Status]")
  private String status;

  @Column(name="[Prioridade]")
  private String prioridade;

  @Column(name="[Urgência]")
  private String urgencia;

  @Column(name="[Impacto]")
  private String impacto;

  @Column(name="[Categoria]")
  private String categoria;

  @Column(name="[Status do Projeto]")
  private Long statusDoProjeto;

  @Column(name="[Número do Projeto]")
  private String numeroDoProjeto;

  @Column(name="[Atividade Avulsa]")
  private String atividadeAvulsa;

  @Column(name="[Abertura da Atividade Avulsa]")
  private Long aberturaDaAtividadeAvulsa;

  @Column(name="[Data Conclusão do Planejamento]")
  private Long dataConclusaoDoPlanejamento;

  @Column(name="[Incidente Origem]")
  private String incidenteOrigem;

  @Column(name="[Problema]")
  private String problema;

  @Column(name="[Incidente Pai]")
  private String incidentePai;

  @Column(name="[RDM Solucionadora]")
  private String rdmSolucionadora;

  @Column(name="[RDM Causadora]")
  private String rdmCausadora;

  @Column(name="[Número Atividade Causadora SGD]")
  private String nMeroAtividadeCausadoraSgd;

  @Column(name="[Ativo?]")
  private String ativo;

  @Column(name="[Solução]")
  private String solucao;

  @Column(name="[Solução de Contorno?]")
  private String solucaoDeContorno;

  @Column(name="[Descrição da Última Solução]")
  private String descricaoDaUltimaSolucao;

  @Column(name="[Qtd Incidentes Filhos]")
  private Long qtdIncidentesFilhos;

  @Column(name="[Tipo]")
  private String tipo;

  @Column(name="[Total de Horas úteis]")
  private String totalDeHorasUteis;

  @Column(name="[UA]")
  private String ua;

  @Column(name="[Cooperativa]")
  private String cooperativa;

  @Column(name="[URDC/SUREG]")
  private String urdcSureg;

  @Column(name="[Central]")
  private String central;

  @Column(name="[Garantia]")
  private Long garantia;

  @Column(name="[Número do item Causador]")
  private String numeroDoItemCausador;

  public String getIncidente() {
    return incidente;
  }

  public void setIncidente(String incidente) {
    this.incidente = incidente;
  }

  public String getUsuario() {
    return usuario;
  }

  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  public String getEntidadeAfetada() {
    return entidadeAfetada;
  }

  public void setEntidadeAfetada(String entidadeAfetada) {
    this.entidadeAfetada = entidadeAfetada;
  }

  public String getGrupoResponsavel() {
    return grupoResponsavel;
  }

  public void setGrupoResponsavel(String grupoResponsavel) {
    this.grupoResponsavel = grupoResponsavel;
  }

  public String getResponsavel() {
    return responsavel;
  }

  public void setResponsavel(String responsavel) {
    this.responsavel = responsavel;
  }

  public String getGrupoSolucionador() {
    return grupoSolucionador;
  }

  public void setGrupoSolucionador(String grupoSolucionador) {
    this.grupoSolucionador = grupoSolucionador;
  }

  public String getAnalistaSolucionador() {
    return analistaSolucionador;
  }

  public void setAnalistaSolucionador(String analistaSolucionador) {
    this.analistaSolucionador = analistaSolucionador;
  }

  public String getReportadoPor() {
    return reportadoPor;
  }

  public void setReportadoPor(String reportadoPor) {
    this.reportadoPor = reportadoPor;
  }

  public String getResumo() {
    return resumo;
  }

  public void setResumo(String resumo) {
    this.resumo = resumo;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public String getDataAbertura() {
    return dataAbertura;
  }

  public void setDataAbertura(String dataAbertura) {
    this.dataAbertura = dataAbertura;
  }

  public String getDataSolucao() {
    return dataSolucao;
  }

  public void setDataSolucao(String dataSolucao) {
    this.dataSolucao = dataSolucao;
  }

  public String getDataFechamento() {
    return dataFechamento;
  }

  public void setDataFechamento(String dataFechamento) {
    this.dataFechamento = dataFechamento;
  }

  public String getDataSla() {
    return dataSla;
  }

  public void setDataSla(String dataSla) {
    this.dataSla = dataSla;
  }

  public String getDataHoraDoRetornoDaRequisicao() {
    return dataHoraDoRetornoDaRequisicao;
  }

  public void setDataHoraDoRetornoDaRequisicao(String dataHoraDoRetornoDaRequisicao) {
    this.dataHoraDoRetornoDaRequisicao = dataHoraDoRetornoDaRequisicao;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getPrioridade() {
    return prioridade;
  }

  public void setPrioridade(String prioridade) {
    this.prioridade = prioridade;
  }

  public String getUrgencia() {
    return urgencia;
  }

  public void setUrgencia(String urgencia) {
    this.urgencia = urgencia;
  }

  public String getImpacto() {
    return impacto;
  }

  public void setImpacto(String impacto) {
    this.impacto = impacto;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public Long getStatusDoProjeto() {
    return statusDoProjeto;
  }

  public void setStatusDoProjeto(Long statusDoProjeto) {
    this.statusDoProjeto = statusDoProjeto;
  }

  public String getNumeroDoProjeto() {
    return numeroDoProjeto;
  }

  public void setNumeroDoProjeto(String numeroDoProjeto) {
    this.numeroDoProjeto = numeroDoProjeto;
  }

  public String getAtividadeAvulsa() {
    return atividadeAvulsa;
  }

  public void setAtividadeAvulsa(String atividadeAvulsa) {
    this.atividadeAvulsa = atividadeAvulsa;
  }

  public Long getAberturaDaAtividadeAvulsa() {
    return aberturaDaAtividadeAvulsa;
  }

  public void setAberturaDaAtividadeAvulsa(Long aberturaDaAtividadeAvulsa) {
    this.aberturaDaAtividadeAvulsa = aberturaDaAtividadeAvulsa;
  }

  public Long getDataConclusaoDoPlanejamento() {
    return dataConclusaoDoPlanejamento;
  }

  public void setDataConclusaoDoPlanejamento(Long dataConclusaoDoPlanejamento) {
    this.dataConclusaoDoPlanejamento = dataConclusaoDoPlanejamento;
  }

  public String getIncidenteOrigem() {
    return incidenteOrigem;
  }

  public void setIncidenteOrigem(String incidenteOrigem) {
    this.incidenteOrigem = incidenteOrigem;
  }

  public String getProblema() {
    return problema;
  }

  public void setProblema(String problema) {
    this.problema = problema;
  }

  public String getIncidentePai() {
    return incidentePai;
  }

  public void setIncidentePai(String incidentePai) {
    this.incidentePai = incidentePai;
  }

  public String getRdmSolucionadora() {
    return rdmSolucionadora;
  }

  public void setRdmSolucionadora(String rdmSolucionadora) {
    this.rdmSolucionadora = rdmSolucionadora;
  }

  public String getRdmCausadora() {
    return rdmCausadora;
  }

  public void setRdmCausadora(String rdmCausadora) {
    this.rdmCausadora = rdmCausadora;
  }

  public String getnMeroAtividadeCausadoraSgd() {
    return nMeroAtividadeCausadoraSgd;
  }

  public void setnMeroAtividadeCausadoraSgd(String nMeroAtividadeCausadoraSgd) {
    this.nMeroAtividadeCausadoraSgd = nMeroAtividadeCausadoraSgd;
  }

  public String getAtivo() {
    return ativo;
  }

  public void setAtivo(String ativo) {
    this.ativo = ativo;
  }

  public String getSolucao() {
    return solucao;
  }

  public void setSolucao(String solucao) {
    this.solucao = solucao;
  }

  public String getSolucaoDeContorno() {
    return solucaoDeContorno;
  }

  public void setSolucaoDeContorno(String solucaoDeContorno) {
    this.solucaoDeContorno = solucaoDeContorno;
  }

  public String getDescricaoDaUltimaSolucao() {
    return descricaoDaUltimaSolucao;
  }

  public void setDescricaoDaUltimaSolucao(String descricaoDaUltimaSolucao) {
    this.descricaoDaUltimaSolucao = descricaoDaUltimaSolucao;
  }

  public Long getQtdIncidentesFilhos() {
    return qtdIncidentesFilhos;
  }

  public void setQtdIncidentesFilhos(Long qtdIncidentesFilhos) {
    this.qtdIncidentesFilhos = qtdIncidentesFilhos;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getTotalDeHorasUteis() {
    return totalDeHorasUteis;
  }

  public void setTotalDeHorasUteis(String totalDeHorasUteis) {
    this.totalDeHorasUteis = totalDeHorasUteis;
  }

  public String getUa() {
    return ua;
  }

  public void setUa(String ua) {
    this.ua = ua;
  }

  public String getCooperativa() {
    return cooperativa;
  }

  public void setCooperativa(String cooperativa) {
    this.cooperativa = cooperativa;
  }

  public String getUrdcSureg() {
    return urdcSureg;
  }

  public void setUrdcSureg(String urdcSureg) {
    this.urdcSureg = urdcSureg;
  }

  public String getCentral() {
    return central;
  }

  public void setCentral(String central) {
    this.central = central;
  }

  public Long getGarantia() {
    return garantia;
  }

  public void setGarantia(Long garantia) {
    this.garantia = garantia;
  }

  public String getNumeroDoItemCausador() {
    return numeroDoItemCausador;
  }

  public void setNumeroDoItemCausador(String numeroDoItemCausador) {
    this.numeroDoItemCausador = numeroDoItemCausador;
  }
}
