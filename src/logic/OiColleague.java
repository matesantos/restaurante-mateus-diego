package logic;

public class OiColleague extends Colleague {
	
	    public OiColleague(Mediator m) {
	        super(m);
	    }
	 
	    @Override
	    public void receberMensagem(String mensagem) {
	        System.out.println("Android recebeu: " + mensagem);
	    }
	}

