package facede;

public class SingletonFacede {
	
	private static Facede instancia = new Facede();
	
	public static synchronized Facede getInstance(){
		return instancia;
	}

}
