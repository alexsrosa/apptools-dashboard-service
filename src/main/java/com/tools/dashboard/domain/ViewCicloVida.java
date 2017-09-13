package com.tools.dashboard.domain;

import javax.persistence.*;

@Entity @IdClass(ViewCicloVidaId.class)
@Table(name="Z_TOT_CICLO_VIDA")
public class ViewCicloVida {

  @Id
  @Column(name="[Número do Chamado]")
  private String numeroDoChamado;

  @Id
  @Column(name="[Início]")
  private String inicio;

  @Column(name="[Fim]")
  private String fim;

  @Column(name="[Tempo Útil]")
  private String tempoUtil;

  @Column(name="[Tempo Real]")
  private String tempoReal;

  @Id
  @Column(name="[Grupo]")
  private String grupo;

  @Id
  @Column(name="[Status]")
  private String status;

  public String getNumeroDoChamado() {
    return numeroDoChamado;
  }

  public void setNumeroDoChamado(String numeroDoChamado) {
    this.numeroDoChamado = numeroDoChamado;
  }

  public String getInicio() {
    return inicio;
  }

  public void setInicio(String inicio) {
    this.inicio = inicio;
  }

  public String getFim() {
    return fim;
  }

  public void setFim(String fim) {
    this.fim = fim;
  }

  public String getTempoUtil() {
    return tempoUtil;
  }

  public void setTempoUtil(String tempoUtil) {
    this.tempoUtil = tempoUtil;
  }

  public String getTempoReal() {
    return tempoReal;
  }

  public void setTempoReal(String tempoReal) {
    this.tempoReal = tempoReal;
  }

  public String getGrupo() {
    return grupo;
  }

  public void setGrupo(String grupo) {
    this.grupo = grupo;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof ViewCicloVida)) return false;

    ViewCicloVida that = (ViewCicloVida) o;

    if (getNumeroDoChamado() != null ? !getNumeroDoChamado().equals(that.getNumeroDoChamado()) : that.getNumeroDoChamado() != null)
      return false;
    if (getInicio() != null ? !getInicio().equals(that.getInicio()) : that.getInicio() != null) return false;
    if (getFim() != null ? !getFim().equals(that.getFim()) : that.getFim() != null) return false;
    if (getTempoUtil() != null ? !getTempoUtil().equals(that.getTempoUtil()) : that.getTempoUtil() != null)
      return false;
    if (getTempoReal() != null ? !getTempoReal().equals(that.getTempoReal()) : that.getTempoReal() != null)
      return false;
    if (getGrupo() != null ? !getGrupo().equals(that.getGrupo()) : that.getGrupo() != null) return false;
    return getStatus() != null ? getStatus().equals(that.getStatus()) : that.getStatus() == null;
  }

  @Override
  public int hashCode() {
    int result = getNumeroDoChamado() != null ? getNumeroDoChamado().hashCode() : 0;
    result = 31 * result + (getInicio() != null ? getInicio().hashCode() : 0);
    result = 31 * result + (getFim() != null ? getFim().hashCode() : 0);
    result = 31 * result + (getTempoUtil() != null ? getTempoUtil().hashCode() : 0);
    result = 31 * result + (getTempoReal() != null ? getTempoReal().hashCode() : 0);
    result = 31 * result + (getGrupo() != null ? getGrupo().hashCode() : 0);
    result = 31 * result + (getStatus() != null ? getStatus().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "ViewCicloVida{" +
            "numeroDoChamado='" + numeroDoChamado + '\'' +
            ", inicio='" + inicio + '\'' +
            ", fim='" + fim + '\'' +
            ", tempoUtil='" + tempoUtil + '\'' +
            ", tempoReal='" + tempoReal + '\'' +
            ", grupo='" + grupo + '\'' +
            ", status='" + status + '\'' +
            '}';
  }
}
