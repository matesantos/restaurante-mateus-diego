package exceptions;

public class IDException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public IDException(String user){
		super("Esse ID "+user+" j� esta cadastrado no sistema.");
	}
	
	
	

}
