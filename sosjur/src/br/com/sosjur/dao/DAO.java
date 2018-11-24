package br.com.sosjur.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class DAO <T> {
	private final Class<T> classe;
	
	public DAO(Class<T> classe) {
		this.classe = classe;
	}
	
	public T adiciona(T t) {
		EntityManager em = JPAUtil.getEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(t);
		
		em.getTransaction().commit();
		
		em.close();
		
		return t;
	}

	public void remove(int id) {
		EntityManager em = JPAUtil.getEntityManager();
		
		em.getTransaction().begin();
		
		T t = em.find(classe, id);
		em.remove(t);
		
		em.getTransaction().commit();
		
		em.close();
	}
	
	public void atualiza(T t) {
		EntityManager em = JPAUtil.getEntityManager();
		
		em.getTransaction().begin();
		
		em.merge(t);
		
		em.getTransaction().commit();
		
		em.close();
	}
	
	public List<T> listaTodos() {
		EntityManager em = JPAUtil.getEntityManager();
		
		String jpql = "SELECT t FROM " + classe.getName() + " t";
		
		TypedQuery<T> query = em.createQuery(jpql, classe);
		
		List<T> lista = query.getResultList();
		
		em.close();
		
		return lista;
	}
	
	public List<T> pesquisaPorNome(String nome){
		EntityManager em = JPAUtil.getEntityManager();	
		String jpql = "SELECT t FROM " + classe.getName()+ " t WHERE t.nome like :pNome order by t.nome";
		TypedQuery<T> query = em.createQuery(jpql, classe);
		query.setParameter("pNome", "%"+nome+"%");
		List<T> resultList = (List<T>) query.getResultList();
		em.close();
		return resultList;
	}
	
	public T listaPorId(int id) {
		EntityManager em = JPAUtil.getEntityManager();
		
		T t = em.find(classe, id);
		
		em.close();
		
		return t;
	}
}
