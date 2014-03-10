package DAO;

import entitys.Gerente;
import exceptions.CPFException;

public interface InterfaceDAOGerente {
	
//	public boolean save (Class<?> classe);
//	public boolean update (Class<?> classe);
//	public boolean read (Class<?> classe);
//	public boolean delete (Class<?> classe);

	public boolean save (Gerente gerente) throws CPFException;
	public void update (Gerente gerente);
	public boolean read (Gerente gerente);
	public boolean delete (Gerente gerente);


}
