package br.com.sosjur.controller;

import java.util.LinkedList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.sosjur.dao.DAO;
import br.com.sosjur.dao.SolicitacaoDAO;
import br.com.sosjur.modelo.Solicitacao;

@ManagedBean
@ViewScoped
public class SolicitacaoController {
	private Solicitacao solicitacao = new Solicitacao();
	private List<Solicitacao> solicitacoesAbertas = new LinkedList<Solicitacao>();
	
	public Solicitacao getSolicitacao() {
		return solicitacao;
	}
	public void setSolicitacao(Solicitacao solicitacao) {
		this.solicitacao = solicitacao;
	}
	public List<Solicitacao> getSolicitacoesAbertas() {
//		solicitacoesAbertas = new DAO<Solicitacao>(Solicitacao.class).listaTodos();
		solicitacoesAbertas = new SolicitacaoDAO().buscaSolicitacoesAbertas();
		return solicitacoesAbertas;
	}
	public void gravar() {
		// não tem id - insere
		if (this.solicitacao.getIdSolicitacao() == null || this.solicitacao.getIdSolicitacao() == 0) {
			try {
				solicitacao.setSituacao("Aberta");
				new DAO<Solicitacao>(Solicitacao.class).adiciona(solicitacao);
			} catch (Exception e) {
				
			}
		} else { // tem id - atualiza
			try {
				this.solicitacao.setSituacao("Concluida");
				new DAO<Solicitacao>(Solicitacao.class).atualiza(solicitacao);
			} catch (Exception e) {
				
			}		
		}
		solicitacao = new Solicitacao();
	}
	
	public void concluir(Solicitacao solicitacao){
		this.solicitacao = solicitacao;
		gravar();
	}
}