package br.com.sosjur.modelo;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Grupo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_grupo;
	private String nome;
	
	@ManyToMany
	private List<Funcionalidade> funcionalidades = new LinkedList<Funcionalidade>();
	
	public void addFuncionalidade(Funcionalidade f) {
		funcionalidades.add(f);
	}

	public Integer getId_grupo() {
		return id_grupo;
	}

	public void setId_grupo(Integer id_grupo) {
		this.id_grupo = id_grupo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Funcionalidade> getFuncionalidades() {
		return funcionalidades;
	}

	public void setFuncionalidades(List<Funcionalidade> funcionalidades) {
		this.funcionalidades = funcionalidades;
	}
}
