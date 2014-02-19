package exceptions;

public class IDException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public IDException(String user){
		super("Esse ID "+user+" já esta cadastrado no sistema.");
	}
	
	
	

}
