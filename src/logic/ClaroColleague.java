package logic;

public class ClaroColleague extends Colleague {
			 
	    public ClaroColleague(Mediator m) {
	        super(m);
	    }
	 
	    @Override
	    public void receberMensagem(String mensagem) {
	        System.out.println("Cliente Claro recebeu: " + mensagem);
	    }
	}


