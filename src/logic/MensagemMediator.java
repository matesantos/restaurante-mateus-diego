package logic;

import java.util.ArrayList;

public class MensagemMediator implements Mediator {
	 
    protected ArrayList<Colleague> contatos;
 
    public MensagemMediator() {
        contatos = new ArrayList<Colleague>();
    }
 
    public void adicionarColleague(Colleague colleague) {
        contatos.add(colleague);
    }
 
    @Override
    public void enviar(String mensagem, Colleague colleague) {
        for (Colleague contato : contatos) {
            if (contato != colleague) {
                definirProtocolo(contato);
                contato.receberMensagem(mensagem);
            }
        }
    }
 
    private void definirProtocolo(Colleague contato) {
        if (contato instanceof ClaroColleague) {
            System.out.println("Protocolo iOS");
        } else if (contato instanceof OiColleague) {
            System.out.println("Protocolo Android");
        } 
        }
    }
 
