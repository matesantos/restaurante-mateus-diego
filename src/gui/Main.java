package gui;

import javax.swing.JOptionPane;

import logic.FactoryGui;

public class Main {

	// private Facede facede;

	public Main() {
		// facede = SingletonFacede.getInstance();
		// fazerLogin();
		escolherOpcao();
	}

	public void escolherOpcao() {
		boolean close = false;
		int i;
		int opcao = new Integer(
				JOptionPane.showInputDialog("Escolhe a opção: 1-Usar Interface Gráfica 2-Usar linha de comando"));

		while (!close) {

			switch (opcao) {
			case 1:
				FactoryGui.getInterfaceGui();
				break;

			case 2:
				close = FactoryGui.getInterfaceCommandLine();
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção inválida", "ERROR",JOptionPane.ERROR_MESSAGE);
				i = JOptionPane.showConfirmDialog(null,	"Deseja terminar o programa?", "Saída",
						JOptionPane.YES_NO_OPTION);
				if (i == JOptionPane.YES_OPTION)
					close = true;
				else
					escolherOpcao();
				break;
			}
		}
	}

	public static void main(String[] args) {
		new Main();
	}
}
