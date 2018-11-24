package br.com.sosjur.modelo;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Solicitacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idSolicitacao;
	private String logradouro;
	private String numero;
	private String bairro;
	private String situacao;
	@Temporal(TemporalType.DATE)
	private Calendar data_solicitacao  = Calendar.getInstance();
	@OneToOne
	private Usuario usuario;
	
	public Integer getIdSolicitacao() {
		return idSolicitacao;
	}
	public void setIdSolicitacao(Integer idSolicitacao) {
		this.idSolicitacao = idSolicitacao;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Calendar getData_solicitacao() {
		return data_solicitacao;
	}
	public void setData_solicitacao(Calendar data_solicitacao) {
		this.data_solicitacao = data_solicitacao;
	}
}
