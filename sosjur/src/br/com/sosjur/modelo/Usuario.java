package br.com.sosjur.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Usuario {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUsuario;
	private String nomeUsuario;
	private String telefoneUsuario;
	private String logradouroUsuario;
	private String numeroUsuario;
	private String bairroUsuario;
	private String cidadeUsuario;
	private String siglaEstradaUsuario;
	private String cepUsuario;
	private String sexoUsuario;
	private String tipoUsuario;
	@Column(unique = true)
	private String cpfUsuario;
	private String senhaUsuario;
	@OneToOne
	private Grupo grupo;
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getTelefoneUsuario() {
		return telefoneUsuario;
	}
	public void setTelefoneUsuario(String telefoneUsuario) {
		this.telefoneUsuario = telefoneUsuario;
	}
	public String getLogradouroUsuario() {
		return logradouroUsuario;
	}
	public void setLogradouroUsuario(String logradouroUsuario) {
		this.logradouroUsuario = logradouroUsuario;
	}
	public String getNumeroUsuario() {
		return numeroUsuario;
	}
	public void setNumeroUsuario(String numeroUsuario) {
		this.numeroUsuario = numeroUsuario;
	}
	public String getBairroUsuario() {
		return bairroUsuario;
	}
	public void setBairroUsuario(String bairroUsuario) {
		this.bairroUsuario = bairroUsuario;
	}
	public String getCidadeUsuario() {
		return cidadeUsuario;
	}
	public void setCidadeUsuario(String cidadeUsuario) {
		this.cidadeUsuario = cidadeUsuario;
	}
	public String getSiglaEstradaUsuario() {
		return siglaEstradaUsuario;
	}
	public void setSiglaEstradaUsuario(String siglaEstradaUsuario) {
		this.siglaEstradaUsuario = siglaEstradaUsuario;
	}
	public String getCepUsuario() {
		return cepUsuario;
	}
	public void setCepUsuario(String cepUsuario) {
		this.cepUsuario = cepUsuario;
	}
	public String getSexoUsuario() {
		return sexoUsuario;
	}
	public void setSexoUsuario(String sexoUsuario) {
		this.sexoUsuario = sexoUsuario;
	}
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	public String getCpfUsuario() {
		return cpfUsuario;
	}
	public void setCpfUsuario(String cpfUsuario) {
		this.cpfUsuario = cpfUsuario;
	}
	public String getSenhaUsuario() {
		return senhaUsuario;
	}
	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	
	
}