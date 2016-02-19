package br.com.fabricadeprogramador.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fabricadeprogramador.entidade.Cliente;

public class ClienteDAO {

	private EntityManager em;

	public ClienteDAO() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cliente_db");
		em = emf.createEntityManager();
	}

	public void abreEntity() {

		em.getTransaction().begin();

	}

	public void fechaEntity() {

		em.close();

	}

	public void salvar(Cliente cliente) {

		
		em.persist(cliente);
		em.getTransaction().commit();
		

	}

	public void excluir(Cliente cliente) {

		abreEntity();
		em.remove(cliente);
		em.getTransaction().commit();
		fechaEntity();

	}

	public List<Cliente> buscarTodos() {

		abreEntity();
		List<Cliente> lista = em.createQuery("select * from cliente", Cliente.class).getResultList();
		em.getTransaction().commit();
		fechaEntity();
		return lista;

	}

	public List<Cliente> buscarPorId(Integer id) {

		abreEntity();
		List<Cliente> lista = em.createQuery("select * from cliente where id =?", Cliente.class).setParameter(1, id)
				.getResultList();
		em.getTransaction().commit();
		fechaEntity();
		return lista;

	}

}
