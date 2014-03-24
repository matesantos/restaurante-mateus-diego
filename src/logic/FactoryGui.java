package logic;

public class FactoryGui {
	
	public static void getInterfaceGui(){
		new InterfaceGui();
	}
	
	public static boolean getInterfaceCommandLine(){
		new InterfaceComandLine();
		return true;
	}

}
