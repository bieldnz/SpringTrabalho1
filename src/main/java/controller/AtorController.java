package controller;

import dao.AtorDao;
import model.Ator;

public class AtorController {
	
	AtorDao atorDao = new AtorDao();
	
	public void inserirAtor(Ator ator) {
		atorDao.inserir(ator);
	}
	
}
