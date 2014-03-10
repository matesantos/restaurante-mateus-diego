package DAO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

import entitys.Gerente;

public class DaoGerenteArquivo implements InterfaceDAOGerente{

	private File gerenteFile =  null;
	private DataInputStream input = null;
	private DataOutputStream output = null;
	
	@Override
	public boolean save(Gerente gerente) {
		try {
			gerenteFile = new File("./Arquivos/produto.dat");
			output = new DataOutputStream(new FileOutputStream(gerenteFile));
			
			output.writeLong(gerente.getGerenteId());
			output.writeUTF(gerente.getNomeCompleto());
			output.writeUTF(gerente.getLogin());
			output.writeUTF(gerente.getSenha());
			
			output.close();
			
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Arquivo inexistente.","ERROR",JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error ao salvar o gerente","ERROR",JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		
		return false;
		
	}

	@Override
	public boolean read(Gerente gerente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Gerente gerente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void update(Gerente gerente) {
		// TODO Auto-generated method stub
		
	}

}
