package br.com.sosjur.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.sosjur.modelo.Solicitacao;

public class SolicitacaoDAO {
	public List<Solicitacao> buscaSolicitacoesAbertas(){
		EntityManager em = JPAUtil.getEntityManager();	
		String jpql = "SELECT s FROM Solicitacao s where s.situacao = :pSituacao";
		TypedQuery<Solicitacao> query = em.createQuery(jpql, Solicitacao.class);
		query.setParameter("pSituacao", "Aberta");
		List<Solicitacao> solicitacoes = query.getResultList();
		em.close();
		return solicitacoes;
	}
}
