package com.tools.dashboard.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="z_tot_mudancas_ext")
public class ViewMudancasExt {

  @Id
  @Column(name = "num_rdm")
  private String num_rdm;

  @Column(name = "dt_abertura")
  private String dt_abertura;

  @Column(name = "dt_execucao")
  private String dt_execucao;

  @Column(name = "status")
  private String status;

  @Column(name = "anexos")
  private String anexos;

  public String getNum_rdm() {
    return num_rdm;
  }

  public void setNum_rdm(String num_rdm) {
    this.num_rdm = num_rdm;
  }

  public String getDt_abertura() {
    return dt_abertura;
  }

  public void setDt_abertura(String dt_abertura) {
    this.dt_abertura = dt_abertura;
  }

  public String getDt_execucao() {
    return dt_execucao;
  }

  public void setDt_execucao(String dt_execucao) {
    this.dt_execucao = dt_execucao;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getAnexos() {
    return anexos;
  }

  public void setAnexos(String anexos) {
    this.anexos = anexos;
  }

  @Override
  public String toString() {
    return "ViewMudancasExtRepository{" +
            "num_rdm='" + num_rdm + '\'' +
            ", dt_abertura='" + dt_abertura + '\'' +
            ", dt_execucao='" + dt_execucao + '\'' +
            ", status='" + status + '\'' +
            ", anexos='" + anexos + '\'' +
            '}';
  }
}
