package exceptions;

public class CPFException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CPFException() {
		super("Esse CPF j� esta cadastrado no sistema.");
	}

}
