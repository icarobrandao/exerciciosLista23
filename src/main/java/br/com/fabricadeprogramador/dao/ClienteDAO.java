package br.com.fabricadeprogramador.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.fabricadeprogramador.entidade.Cliente;

public class ClienteDAO {

	private EntityManager em;

	public ClienteDAO() {
		
		em = EMFactory.getEntityManager();
		
	}


	public void salvar(Cliente cliente) {

		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();
		
	}

	public void excluir(Cliente cliente) {

		em.getTransaction().begin();
		em.remove(cliente);
		em.getTransaction().commit();
		
	}

	@SuppressWarnings("unchecked")
	public List<Cliente> buscarTodos() {

		
		Query query = em.createQuery("select c from Cliente c");
		return query.getResultList();

	}
	
	@SuppressWarnings("unchecked")
	public List<Object[]> buscarTodos2() {

		
		Query query = em.createQuery("select c.id, c.nome from Cliente c");
		return query.getResultList();

	}

	public Cliente buscarPorId(Integer id) {
		
		return em.find(Cliente.class, id);// select * from usuario where id=?
		
	
	}

}
