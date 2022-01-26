import javax.swing.JOptionPane;

public class Pica {
	public static void main(String[] args) {
		int cena; 
		String izvele;
		
		do {
			izvele = JOptionPane.showInputDialog("pasutit - veikt pasūtījumu "
					+ "\napskatit - apskatīt savu pasūtījumu "
					+ "\ncena - pašreizējā cena "
					+ "\nstop - atcelt pasūtījumu");
		}while(!izvele.equalsIgnoreCase("stop"));
		
		
	}
}
