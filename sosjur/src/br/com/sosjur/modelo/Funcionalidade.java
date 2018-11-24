package br.com.sosjur.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Funcionalidade {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_funcionalidade;
	private String nome;
	private String pagina;

	public Integer getId_funcionalidade() {
		return id_funcionalidade;
	}

	public void setId_funcionalidade(Integer id_funcionalidade) {
		this.id_funcionalidade = id_funcionalidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPagina() {
		return pagina;
	}

	public void setPagina(String pagina) {
		this.pagina = pagina;
	}

}
