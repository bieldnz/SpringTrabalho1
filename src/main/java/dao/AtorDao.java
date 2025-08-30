package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Ator;

public class AtorDao implements IAtorDao {

	EntityManagerFactory mf = Persistence.createEntityManagerFactory("HibJPA");
	
	@Override
	public Ator pesquisar(String nomeAtor) {
		EntityManager em = mf.createEntityManager();
		List<Ator> atores = em.createQuery("SELECT a FROM Ator a", Ator.class).getResultList();
		em.close();
		Ator ator = atores.getFirst();
		return ator;
	}

	@Override
	public void inserir(Ator ator) {
		
		EntityManager em = mf.createEntityManager();
		em.getTransaction().begin();
		em.persist(ator);
		em.getTransaction().commit();
		em.close();
		
	}
	
}
