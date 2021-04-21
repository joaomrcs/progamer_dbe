package br.com.fiap.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import br.com.fiap.model.Usuario;
import br.com.fiap.util.EntityManagerFacade;

public class UsuarioDAO {

	private EntityManager manager = new EntityManagerFacade().getEntityManager();

	public void save(Usuario usuario) {
		manager.getTransaction().begin();
		manager.persist(usuario);
		manager.getTransaction().commit();
		manager.clear();
	}

	public List<Usuario> getAll() {
		String jpql = "SELECT s FROM Usuario s";
		TypedQuery<Usuario> createQuery = manager.createQuery(jpql, Usuario.class);
		return createQuery.getResultList();
	}
}