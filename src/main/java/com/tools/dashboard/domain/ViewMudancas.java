package com.tools.dashboard.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Z_TOT_MUDANCAS")
public class ViewMudancas {

  @Id
  @Column(name = "[RDM]")
  private String rdm;

  @Column(name = "[Equipe Solicitante]")
  private String equipeSolicitante;

  @Column(name = "[Solicitante]")
  private String solicitante;

  @Column(name = "[Resumo RDM]")
  private String resumoRdm;

  @Column(name = "[Descrição]")
  private String descricao;

  @Column(name = "[Risco]")
  private String risco;

  @Column(name = "[Prioridade]")
  private String prioridade;

  @Column(name = "[Tipo de Mudança]")
  private String tipoDeMudanca;

  @Column(name = "[Data de Abertura RDM]")
  private String dataDeAberturaRdm;

  @Column(name = "[Data de Execução RDM]")
  private String dataDeExecuORdm;

  @Column(name = "[Data de Fechamento RDM]")
  private String dataDeFechamentoRdm;

  @Column(name = "[Status]")
  private String status;

  @Column(name = "[Categoria]")
  private String categoria;

  @Column(name = "[Grupo Solicitante RDM]")
  private String grupoSolicitanteRdm;

  @Column(name = "[Tipo de Liberação]")
  private String tipoDeLiberacao;

  @Column(name = "[Data do Comitê]")
  private String dataDoComite;

  @Column(name = "[Início da Indisponibilidade]")
  private String inicioDaIndisponibilidade;

  @Column(name = "[Fim da Indisponibilidade]")
  private String fimDaIndisponibilidade;

  @Column(name = "[Janela de Manutenção]")
  private String janelaDeManutenO;

  @Column(name = "[Detalhes da Janela de Manutenção]")
  private String detalhesDaJanelaDeManutencao;

  @Column(name = "[Origem da Mudanca]")
  private String origemDaMudanca;

  @Column(name = "[Projeto Relacionado]")
  private String projetoRelacionado;

  @Column(name = "[Haverá Homologação?]")
  private String haverHomologacao;

  @Column(name = "[Validação Pós-Mudança em Produção]")
  private String validacaoPosMudancaEmProducao;

  @Column(name = "[Plano de Retrocesso (Visão Geral e Tempo de Execução)]")
  private String planoDeRetrocessoVisaoGeralETempoDeExecucao;

  @Column(name = "[Mudança Requer Alteração em Documentação Existente?]")
  private String mudancaRequerAlteracaoEmDocumentacaoExistente;

  @Column(name = "[Descrição dos Documentos que devem ser Atualizados]")
  private String descricaoDosDocumentosQueDevemSerAtualizados;

  @Column(name = "[Observações da Gestão de Mudanças]")
  private String observacoesDaGestaoDeMudancas;

  @Column(name = "[Tipo de Script ou Paralelo]")
  private String tipoDeScriptOuParalelo;

  @Column(name = "[Ação para evitar recorrência]")
  private String acaoParaEvitarRecorrencia;

  @Column(name = "[Descrição da Ação para Evitar Recorrência]")
  private String descricaoDaAcaoParaEvitarRecorrencia;

  @Column(name = "[Previsão de Solução]")
  private String previsaoDeSolucao;

  @Column(name = "[Tipo de Correção]")
  private String tipoDeCorrecao;

  @Column(name = "[Número PL]")
  private String numeroPl;

  @Column(name = "[Solicitante PL]")
  private String solicitantePl;

  @Column(name = "[Grupo Solicitante PL]")
  private String grupoSolicitantePl;

  @Column(name = "[Status PL]")
  private String statusPl;

  @Column(name = "[Tipo de Liberação PL]")
  private String tipoDeLiberacaoPl;

  @Column(name = "[Data de Execução PL]")
  private String dataDeExecucaoPl;

  @Column(name = "[Estimativa de Tempo Total de Execução]")
  private String estimativaDeTempoTotalDeExecucao;

  @Column(name = "[Limite para Conclusão]")
  private String limiteParaConclusao;

  @Column(name = "[Data de Abertura PL]")
  private String dataDeAberturaPl;

  @Column(name = "[Data de Fechamento PL]")
  private String dataDeFechamentoPl;

  @Column(name = "[Devoluções Qualidade]")
  private Long devolucoesQualidade;

  @Column(name = "[Quantidade de Rejeição]")
  private Long quantidadeDeRejeicao;

  @Column(name = "[Resumo PL]")
  private String resumoPl;

  @Column(name = "[Repositório Artefatos do Solicitante]")
  private String repositorioArtefatosDoSolicitante;

  @Column(name = "[Entidades Destino]")
  private String entidadesDestino;

  @Column(name = "[Pré Requisitos]")
  private String preRequisitos;

  @Column(name = "[Repositório Artefatos para Instalação (Preenchido pela equipe GL e usado pelos executores)]")
  private String repositorioArtefatosParaInstalacaoPreenchidoPelaEquipeGlEUsadoPelosExecutores;

  @Column(name = "[Observações da Gestão de Mudanças no PL]")
  private String observacoesDaGestaoDeMudancasNoPl;

  @Column(name = "[Pessoas Envolvidas na Execução (Nome-Equipe-Fone)]")
  private String pessoasEnvolvidasNaExecucaoNomeEquipeFone;

  @Column(name = "[Pessoas Envolvidas na Validação Pós-Mudança (Nome-Equipe-Fone)]")
  private String pessoasEnvolvidasNaValidacaoPosMudancaNomeEquipeFone;

  @Column(name = "[Pessoas Envolvidas no Escalonamento para Problemas e Retrocesso (Nome-Equipe-Fone)]")
  private String pessoasEnvolvidasNoEscalonamentoParaProblemasERetrocessoNomeEquipeFone;

  @Column(name = "[Ambientes]")
  private String ambientes;

  @Column(name = "[Detalhamento das Atividades do PLANO DE RETROCESSO]")
  private String detalhamentoDasAtividadesDoPlanoDeRetrocesso;

  @Column(name = "[RDM Pai]")
  private String rdmPai;

  @Column(name = "[Anexo da RDM]")
  private String anexoDaRdm;

  @Column(name = "[Anexo do PL]")
  private String anexoDoPl;

  @Column(name = "[Plano de Retrocesso]")
  private String planoDeRetrocesso;

  @Column(name = "[Validação Pós-mudança]")
  private String validacaoPosMudanca;

  @Column(name = "[IC do PL]")
  private String icDoPl;

  @Column(name = "[Requisição]")
  private String requisicao;

  public String getRdm() {
    return rdm;
  }

  public void setRdm(String rdm) {
    this.rdm = rdm;
  }

  public String getEquipeSolicitante() {
    return equipeSolicitante;
  }

  public void setEquipeSolicitante(String equipeSolicitante) {
    this.equipeSolicitante = equipeSolicitante;
  }

  public String getSolicitante() {
    return solicitante;
  }

  public void setSolicitante(String solicitante) {
    this.solicitante = solicitante;
  }

  public String getResumoRdm() {
    return resumoRdm;
  }

  public void setResumoRdm(String resumoRdm) {
    this.resumoRdm = resumoRdm;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public String getRisco() {
    return risco;
  }

  public void setRisco(String risco) {
    this.risco = risco;
  }

  public String getPrioridade() {
    return prioridade;
  }

  public void setPrioridade(String prioridade) {
    this.prioridade = prioridade;
  }

  public String getTipoDeMudanca() {
    return tipoDeMudanca;
  }

  public void setTipoDeMudanca(String tipoDeMudanca) {
    this.tipoDeMudanca = tipoDeMudanca;
  }

  public String getDataDeAberturaRdm() {
    return dataDeAberturaRdm;
  }

  public void setDataDeAberturaRdm(String dataDeAberturaRdm) {
    this.dataDeAberturaRdm = dataDeAberturaRdm;
  }

  public String getDataDeExecuORdm() {
    return dataDeExecuORdm;
  }

  public void setDataDeExecuORdm(String dataDeExecuORdm) {
    this.dataDeExecuORdm = dataDeExecuORdm;
  }

  public String getDataDeFechamentoRdm() {
    return dataDeFechamentoRdm;
  }

  public void setDataDeFechamentoRdm(String dataDeFechamentoRdm) {
    this.dataDeFechamentoRdm = dataDeFechamentoRdm;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public String getGrupoSolicitanteRdm() {
    return grupoSolicitanteRdm;
  }

  public void setGrupoSolicitanteRdm(String grupoSolicitanteRdm) {
    this.grupoSolicitanteRdm = grupoSolicitanteRdm;
  }

  public String getTipoDeLiberacao() {
    return tipoDeLiberacao;
  }

  public void setTipoDeLiberacao(String tipoDeLiberacao) {
    this.tipoDeLiberacao = tipoDeLiberacao;
  }

  public String getDataDoComite() {
    return dataDoComite;
  }

  public void setDataDoComite(String dataDoComite) {
    this.dataDoComite = dataDoComite;
  }

  public String getInicioDaIndisponibilidade() {
    return inicioDaIndisponibilidade;
  }

  public void setInicioDaIndisponibilidade(String inicioDaIndisponibilidade) {
    this.inicioDaIndisponibilidade = inicioDaIndisponibilidade;
  }

  public String getFimDaIndisponibilidade() {
    return fimDaIndisponibilidade;
  }

  public void setFimDaIndisponibilidade(String fimDaIndisponibilidade) {
    this.fimDaIndisponibilidade = fimDaIndisponibilidade;
  }

  public String getJanelaDeManutenO() {
    return janelaDeManutenO;
  }

  public void setJanelaDeManutenO(String janelaDeManutenO) {
    this.janelaDeManutenO = janelaDeManutenO;
  }

  public String getDetalhesDaJanelaDeManutencao() {
    return detalhesDaJanelaDeManutencao;
  }

  public void setDetalhesDaJanelaDeManutencao(String detalhesDaJanelaDeManutencao) {
    this.detalhesDaJanelaDeManutencao = detalhesDaJanelaDeManutencao;
  }

  public String getOrigemDaMudanca() {
    return origemDaMudanca;
  }

  public void setOrigemDaMudanca(String origemDaMudanca) {
    this.origemDaMudanca = origemDaMudanca;
  }

  public String getProjetoRelacionado() {
    return projetoRelacionado;
  }

  public void setProjetoRelacionado(String projetoRelacionado) {
    this.projetoRelacionado = projetoRelacionado;
  }

  public String getHaverHomologacao() {
    return haverHomologacao;
  }

  public void setHaverHomologacao(String haverHomologacao) {
    this.haverHomologacao = haverHomologacao;
  }

  public String getValidacaoPosMudancaEmProducao() {
    return validacaoPosMudancaEmProducao;
  }

  public void setValidacaoPosMudancaEmProducao(String validacaoPosMudancaEmProducao) {
    this.validacaoPosMudancaEmProducao = validacaoPosMudancaEmProducao;
  }

  public String getPlanoDeRetrocessoVisaoGeralETempoDeExecucao() {
    return planoDeRetrocessoVisaoGeralETempoDeExecucao;
  }

  public void setPlanoDeRetrocessoVisaoGeralETempoDeExecucao(String planoDeRetrocessoVisaoGeralETempoDeExecucao) {
    this.planoDeRetrocessoVisaoGeralETempoDeExecucao = planoDeRetrocessoVisaoGeralETempoDeExecucao;
  }

  public String getMudancaRequerAlteracaoEmDocumentacaoExistente() {
    return mudancaRequerAlteracaoEmDocumentacaoExistente;
  }

  public void setMudancaRequerAlteracaoEmDocumentacaoExistente(String mudancaRequerAlteracaoEmDocumentacaoExistente) {
    this.mudancaRequerAlteracaoEmDocumentacaoExistente = mudancaRequerAlteracaoEmDocumentacaoExistente;
  }

  public String getDescricaoDosDocumentosQueDevemSerAtualizados() {
    return descricaoDosDocumentosQueDevemSerAtualizados;
  }

  public void setDescricaoDosDocumentosQueDevemSerAtualizados(String descricaoDosDocumentosQueDevemSerAtualizados) {
    this.descricaoDosDocumentosQueDevemSerAtualizados = descricaoDosDocumentosQueDevemSerAtualizados;
  }

  public String getObservacoesDaGestaoDeMudancas() {
    return observacoesDaGestaoDeMudancas;
  }

  public void setObservacoesDaGestaoDeMudancas(String observacoesDaGestaoDeMudancas) {
    this.observacoesDaGestaoDeMudancas = observacoesDaGestaoDeMudancas;
  }

  public String getTipoDeScriptOuParalelo() {
    return tipoDeScriptOuParalelo;
  }

  public void setTipoDeScriptOuParalelo(String tipoDeScriptOuParalelo) {
    this.tipoDeScriptOuParalelo = tipoDeScriptOuParalelo;
  }

  public String getAcaoParaEvitarRecorrencia() {
    return acaoParaEvitarRecorrencia;
  }

  public void setAcaoParaEvitarRecorrencia(String acaoParaEvitarRecorrencia) {
    this.acaoParaEvitarRecorrencia = acaoParaEvitarRecorrencia;
  }

  public String getDescricaoDaAcaoParaEvitarRecorrencia() {
    return descricaoDaAcaoParaEvitarRecorrencia;
  }

  public void setDescricaoDaAcaoParaEvitarRecorrencia(String descricaoDaAcaoParaEvitarRecorrencia) {
    this.descricaoDaAcaoParaEvitarRecorrencia = descricaoDaAcaoParaEvitarRecorrencia;
  }

  public String getPrevisaoDeSolucao() {
    return previsaoDeSolucao;
  }

  public void setPrevisaoDeSolucao(String previsaoDeSolucao) {
    this.previsaoDeSolucao = previsaoDeSolucao;
  }

  public String getTipoDeCorrecao() {
    return tipoDeCorrecao;
  }

  public void setTipoDeCorrecao(String tipoDeCorrecao) {
    this.tipoDeCorrecao = tipoDeCorrecao;
  }

  public String getNumeroPl() {
    return numeroPl;
  }

  public void setNumeroPl(String numeroPl) {
    this.numeroPl = numeroPl;
  }

  public String getSolicitantePl() {
    return solicitantePl;
  }

  public void setSolicitantePl(String solicitantePl) {
    this.solicitantePl = solicitantePl;
  }

  public String getGrupoSolicitantePl() {
    return grupoSolicitantePl;
  }

  public void setGrupoSolicitantePl(String grupoSolicitantePl) {
    this.grupoSolicitantePl = grupoSolicitantePl;
  }

  public String getStatusPl() {
    return statusPl;
  }

  public void setStatusPl(String statusPl) {
    this.statusPl = statusPl;
  }

  public String getTipoDeLiberacaoPl() {
    return tipoDeLiberacaoPl;
  }

  public void setTipoDeLiberacaoPl(String tipoDeLiberacaoPl) {
    this.tipoDeLiberacaoPl = tipoDeLiberacaoPl;
  }

  public String getDataDeExecucaoPl() {
    return dataDeExecucaoPl;
  }

  public void setDataDeExecucaoPl(String dataDeExecucaoPl) {
    this.dataDeExecucaoPl = dataDeExecucaoPl;
  }

  public String getEstimativaDeTempoTotalDeExecucao() {
    return estimativaDeTempoTotalDeExecucao;
  }

  public void setEstimativaDeTempoTotalDeExecucao(String estimativaDeTempoTotalDeExecucao) {
    this.estimativaDeTempoTotalDeExecucao = estimativaDeTempoTotalDeExecucao;
  }

  public String getLimiteParaConclusao() {
    return limiteParaConclusao;
  }

  public void setLimiteParaConclusao(String limiteParaConclusao) {
    this.limiteParaConclusao = limiteParaConclusao;
  }

  public String getDataDeAberturaPl() {
    return dataDeAberturaPl;
  }

  public void setDataDeAberturaPl(String dataDeAberturaPl) {
    this.dataDeAberturaPl = dataDeAberturaPl;
  }

  public String getDataDeFechamentoPl() {
    return dataDeFechamentoPl;
  }

  public void setDataDeFechamentoPl(String dataDeFechamentoPl) {
    this.dataDeFechamentoPl = dataDeFechamentoPl;
  }

  public Long getDevolucoesQualidade() {
    return devolucoesQualidade;
  }

  public void setDevolucoesQualidade(Long devolucoesQualidade) {
    this.devolucoesQualidade = devolucoesQualidade;
  }

  public Long getQuantidadeDeRejeicao() {
    return quantidadeDeRejeicao;
  }

  public void setQuantidadeDeRejeicao(Long quantidadeDeRejeicao) {
    this.quantidadeDeRejeicao = quantidadeDeRejeicao;
  }

  public String getResumoPl() {
    return resumoPl;
  }

  public void setResumoPl(String resumoPl) {
    this.resumoPl = resumoPl;
  }

  public String getRepositorioArtefatosDoSolicitante() {
    return repositorioArtefatosDoSolicitante;
  }

  public void setRepositorioArtefatosDoSolicitante(String repositorioArtefatosDoSolicitante) {
    this.repositorioArtefatosDoSolicitante = repositorioArtefatosDoSolicitante;
  }

  public String getEntidadesDestino() {
    return entidadesDestino;
  }

  public void setEntidadesDestino(String entidadesDestino) {
    this.entidadesDestino = entidadesDestino;
  }

  public String getPreRequisitos() {
    return preRequisitos;
  }

  public void setPreRequisitos(String preRequisitos) {
    this.preRequisitos = preRequisitos;
  }

  public String getRepositorioArtefatosParaInstalacaoPreenchidoPelaEquipeGlEUsadoPelosExecutores() {
    return repositorioArtefatosParaInstalacaoPreenchidoPelaEquipeGlEUsadoPelosExecutores;
  }

  public void setRepositorioArtefatosParaInstalacaoPreenchidoPelaEquipeGlEUsadoPelosExecutores(String repositorioArtefatosParaInstalacaoPreenchidoPelaEquipeGlEUsadoPelosExecutores) {
    this.repositorioArtefatosParaInstalacaoPreenchidoPelaEquipeGlEUsadoPelosExecutores = repositorioArtefatosParaInstalacaoPreenchidoPelaEquipeGlEUsadoPelosExecutores;
  }

  public String getObservacoesDaGestaoDeMudancasNoPl() {
    return observacoesDaGestaoDeMudancasNoPl;
  }

  public void setObservacoesDaGestaoDeMudancasNoPl(String observacoesDaGestaoDeMudancasNoPl) {
    this.observacoesDaGestaoDeMudancasNoPl = observacoesDaGestaoDeMudancasNoPl;
  }

  public String getPessoasEnvolvidasNaExecucaoNomeEquipeFone() {
    return pessoasEnvolvidasNaExecucaoNomeEquipeFone;
  }

  public void setPessoasEnvolvidasNaExecucaoNomeEquipeFone(String pessoasEnvolvidasNaExecucaoNomeEquipeFone) {
    this.pessoasEnvolvidasNaExecucaoNomeEquipeFone = pessoasEnvolvidasNaExecucaoNomeEquipeFone;
  }

  public String getPessoasEnvolvidasNaValidacaoPosMudancaNomeEquipeFone() {
    return pessoasEnvolvidasNaValidacaoPosMudancaNomeEquipeFone;
  }

  public void setPessoasEnvolvidasNaValidacaoPosMudancaNomeEquipeFone(String pessoasEnvolvidasNaValidacaoPosMudancaNomeEquipeFone) {
    this.pessoasEnvolvidasNaValidacaoPosMudancaNomeEquipeFone = pessoasEnvolvidasNaValidacaoPosMudancaNomeEquipeFone;
  }

  public String getPessoasEnvolvidasNoEscalonamentoParaProblemasERetrocessoNomeEquipeFone() {
    return pessoasEnvolvidasNoEscalonamentoParaProblemasERetrocessoNomeEquipeFone;
  }

  public void setPessoasEnvolvidasNoEscalonamentoParaProblemasERetrocessoNomeEquipeFone(String pessoasEnvolvidasNoEscalonamentoParaProblemasERetrocessoNomeEquipeFone) {
    this.pessoasEnvolvidasNoEscalonamentoParaProblemasERetrocessoNomeEquipeFone = pessoasEnvolvidasNoEscalonamentoParaProblemasERetrocessoNomeEquipeFone;
  }

  public String getAmbientes() {
    return ambientes;
  }

  public void setAmbientes(String ambientes) {
    this.ambientes = ambientes;
  }

  public String getDetalhamentoDasAtividadesDoPlanoDeRetrocesso() {
    return detalhamentoDasAtividadesDoPlanoDeRetrocesso;
  }

  public void setDetalhamentoDasAtividadesDoPlanoDeRetrocesso(String detalhamentoDasAtividadesDoPlanoDeRetrocesso) {
    this.detalhamentoDasAtividadesDoPlanoDeRetrocesso = detalhamentoDasAtividadesDoPlanoDeRetrocesso;
  }

  public String getRdmPai() {
    return rdmPai;
  }

  public void setRdmPai(String rdmPai) {
    this.rdmPai = rdmPai;
  }

  public String getAnexoDaRdm() {
    return anexoDaRdm;
  }

  public void setAnexoDaRdm(String anexoDaRdm) {
    this.anexoDaRdm = anexoDaRdm;
  }

  public String getAnexoDoPl() {
    return anexoDoPl;
  }

  public void setAnexoDoPl(String anexoDoPl) {
    this.anexoDoPl = anexoDoPl;
  }

  public String getPlanoDeRetrocesso() {
    return planoDeRetrocesso;
  }

  public void setPlanoDeRetrocesso(String planoDeRetrocesso) {
    this.planoDeRetrocesso = planoDeRetrocesso;
  }

  public String getValidacaoPosMudanca() {
    return validacaoPosMudanca;
  }

  public void setValidacaoPosMudanca(String validacaoPosMudanca) {
    this.validacaoPosMudanca = validacaoPosMudanca;
  }

  public String getIcDoPl() {
    return icDoPl;
  }

  public void setIcDoPl(String icDoPl) {
    this.icDoPl = icDoPl;
  }

  public String getRequisicao() {
    return requisicao;
  }

  public void setRequisicao(String requisicao) {
    this.requisicao = requisicao;
  }

  @Override
  public String toString() {
    return "ViewMudancas{" +
            "rdm='" + rdm + '\'' +
            ", equipeSolicitante='" + equipeSolicitante + '\'' +
            ", solicitante='" + solicitante + '\'' +
            ", resumoRdm='" + resumoRdm + '\'' +
            ", descricao='" + descricao + '\'' +
            ", risco='" + risco + '\'' +
            ", prioridade='" + prioridade + '\'' +
            ", tipoDeMudanca='" + tipoDeMudanca + '\'' +
            ", dataDeAberturaRdm='" + dataDeAberturaRdm + '\'' +
            ", dataDeExecuORdm='" + dataDeExecuORdm + '\'' +
            ", dataDeFechamentoRdm='" + dataDeFechamentoRdm + '\'' +
            ", status='" + status + '\'' +
            ", categoria='" + categoria + '\'' +
            ", grupoSolicitanteRdm='" + grupoSolicitanteRdm + '\'' +
            ", tipoDeLiberacao='" + tipoDeLiberacao + '\'' +
            ", dataDoComite='" + dataDoComite + '\'' +
            ", inicioDaIndisponibilidade='" + inicioDaIndisponibilidade + '\'' +
            ", fimDaIndisponibilidade='" + fimDaIndisponibilidade + '\'' +
            ", janelaDeManutenO='" + janelaDeManutenO + '\'' +
            ", detalhesDaJanelaDeManutencao='" + detalhesDaJanelaDeManutencao + '\'' +
            ", origemDaMudanca='" + origemDaMudanca + '\'' +
            ", projetoRelacionado='" + projetoRelacionado + '\'' +
            ", haverHomologacao='" + haverHomologacao + '\'' +
            ", validacaoPosMudancaEmProducao='" + validacaoPosMudancaEmProducao + '\'' +
            ", planoDeRetrocessoVisaoGeralETempoDeExecucao='" + planoDeRetrocessoVisaoGeralETempoDeExecucao + '\'' +
            ", mudancaRequerAlteracaoEmDocumentacaoExistente='" + mudancaRequerAlteracaoEmDocumentacaoExistente + '\'' +
            ", descricaoDosDocumentosQueDevemSerAtualizados='" + descricaoDosDocumentosQueDevemSerAtualizados + '\'' +
            ", observacoesDaGestaoDeMudancas='" + observacoesDaGestaoDeMudancas + '\'' +
            ", tipoDeScriptOuParalelo='" + tipoDeScriptOuParalelo + '\'' +
            ", acaoParaEvitarRecorrencia='" + acaoParaEvitarRecorrencia + '\'' +
            ", descricaoDaAcaoParaEvitarRecorrencia='" + descricaoDaAcaoParaEvitarRecorrencia + '\'' +
            ", previsaoDeSolucao='" + previsaoDeSolucao + '\'' +
            ", tipoDeCorrecao='" + tipoDeCorrecao + '\'' +
            ", numeroPl='" + numeroPl + '\'' +
            ", solicitantePl='" + solicitantePl + '\'' +
            ", grupoSolicitantePl='" + grupoSolicitantePl + '\'' +
            ", statusPl='" + statusPl + '\'' +
            ", tipoDeLiberacaoPl='" + tipoDeLiberacaoPl + '\'' +
            ", dataDeExecucaoPl='" + dataDeExecucaoPl + '\'' +
            ", estimativaDeTempoTotalDeExecucao='" + estimativaDeTempoTotalDeExecucao + '\'' +
            ", limiteParaConclusao='" + limiteParaConclusao + '\'' +
            ", dataDeAberturaPl='" + dataDeAberturaPl + '\'' +
            ", dataDeFechamentoPl='" + dataDeFechamentoPl + '\'' +
            ", devolucoesQualidade=" + devolucoesQualidade +
            ", quantidadeDeRejeicao=" + quantidadeDeRejeicao +
            ", resumoPl='" + resumoPl + '\'' +
            ", repositorioArtefatosDoSolicitante='" + repositorioArtefatosDoSolicitante + '\'' +
            ", entidadesDestino='" + entidadesDestino + '\'' +
            ", preRequisitos='" + preRequisitos + '\'' +
            ", repositorioArtefatosParaInstalacaoPreenchidoPelaEquipeGlEUsadoPelosExecutores='" + repositorioArtefatosParaInstalacaoPreenchidoPelaEquipeGlEUsadoPelosExecutores + '\'' +
            ", observacoesDaGestaoDeMudancasNoPl='" + observacoesDaGestaoDeMudancasNoPl + '\'' +
            ", pessoasEnvolvidasNaExecucaoNomeEquipeFone='" + pessoasEnvolvidasNaExecucaoNomeEquipeFone + '\'' +
            ", pessoasEnvolvidasNaValidacaoPosMudancaNomeEquipeFone='" + pessoasEnvolvidasNaValidacaoPosMudancaNomeEquipeFone + '\'' +
            ", pessoasEnvolvidasNoEscalonamentoParaProblemasERetrocessoNomeEquipeFone='" + pessoasEnvolvidasNoEscalonamentoParaProblemasERetrocessoNomeEquipeFone + '\'' +
            ", ambientes='" + ambientes + '\'' +
            ", detalhamentoDasAtividadesDoPlanoDeRetrocesso='" + detalhamentoDasAtividadesDoPlanoDeRetrocesso + '\'' +
            ", rdmPai='" + rdmPai + '\'' +
            ", anexoDaRdm='" + anexoDaRdm + '\'' +
            ", anexoDoPl='" + anexoDoPl + '\'' +
            ", planoDeRetrocesso='" + planoDeRetrocesso + '\'' +
            ", validacaoPosMudanca='" + validacaoPosMudanca + '\'' +
            ", icDoPl='" + icDoPl + '\'' +
            ", requisicao='" + requisicao + '\'' +
            '}';
  }
}
