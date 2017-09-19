package com.tools.dashboard.domain;

import com.tools.dashboard.domain.key.ViewTicketsComentariosId;

import javax.persistence.*;

@Entity @IdClass(ViewTicketsComentariosId.class)
@Table(name="Z_TOT_TICKETS_COMENTARIOS")
public class ViewTicketsComentarios {

  @Id
  @Column(name="[Número]")
  private String numero;

  @Column(name="[Analista]")
  private String analista;

  @Id
  @Column(name="[Tipo]")
  private String tipo;

  @Id
  @Column(name="[Data/Hora]")
  private String dataHora;

  @Column(name="[Descrição do Comentário]")
  private String descricaoDoComentario;

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public String getAnalista() {
    return analista;
  }

  public void setAnalista(String analista) {
    this.analista = analista;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getDataHora() {
    return dataHora;
  }

  public void setDataHora(String dataHora) {
    this.dataHora = dataHora;
  }

  public String getDescricaoDoComentario() {
    return descricaoDoComentario;
  }

  public void setDescricaoDoComentario(String descricaoDoComentario) {
    this.descricaoDoComentario = descricaoDoComentario;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof ViewTicketsComentarios)) return false;

    ViewTicketsComentarios that = (ViewTicketsComentarios) o;

    if (getNumero() != null ? !getNumero().equals(that.getNumero()) : that.getNumero() != null) return false;
    if (getAnalista() != null ? !getAnalista().equals(that.getAnalista()) : that.getAnalista() != null) return false;
    if (getTipo() != null ? !getTipo().equals(that.getTipo()) : that.getTipo() != null) return false;
    if (getDataHora() != null ? !getDataHora().equals(that.getDataHora()) : that.getDataHora() != null) return false;
    return getDescricaoDoComentario() != null ? getDescricaoDoComentario().equals(that.getDescricaoDoComentario()) : that.getDescricaoDoComentario() == null;
  }

  @Override
  public int hashCode() {
    int result = getNumero() != null ? getNumero().hashCode() : 0;
    result = 31 * result + (getAnalista() != null ? getAnalista().hashCode() : 0);
    result = 31 * result + (getTipo() != null ? getTipo().hashCode() : 0);
    result = 31 * result + (getDataHora() != null ? getDataHora().hashCode() : 0);
    result = 31 * result + (getDescricaoDoComentario() != null ? getDescricaoDoComentario().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "ViewTicketsComentarios{" +
            "numero='" + numero + '\'' +
            ", analista='" + analista + '\'' +
            ", tipo='" + tipo + '\'' +
            ", dataHora='" + dataHora + '\'' +
            ", descricaoDoComentario='" + descricaoDoComentario + '\'' +
            '}';
  }
}
