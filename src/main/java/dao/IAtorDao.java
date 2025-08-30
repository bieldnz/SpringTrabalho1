package dao;

import model.Ator;

public interface IAtorDao {

	public Ator pesquisar(String nomeAtor);
	public void inserir(Ator ator);
	
}
