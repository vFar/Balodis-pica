import javax.swing.JOptionPane;

public class Pica {
	static pasutit() {
		return 0;
	}
	public static void main(String[] args) {
		int cena; 
		String izvele;
		String adrese, vards, talrunis;
		boolean piegade, dzeriens;
		
		do {
			izvele = JOptionPane.showInputDialog("pasutit - veikt pasūtījumu "
					+ "\napskatit - apskatīt savu pasūtījumu "
					+ "\ncena - pašreizējā cena "
					+ "\nstop - atcelt pasūtījumu");
			
			switch(izvele) {
			case "pasutit":
				String veids = JOptionPane.showInputDialog("Kādu picas veidu izvēlēsies? "
						+ "\nMargherita | Pepperoni | Pikantā | Kalifornija ");
				
				if(veids.equalsIgnoreCase("Margherita")) {
					JOptionPane.showMessageDialog(null, veids);
				}else if(veids.equalsIgnoreCase("Pepperoni")) {
					
				}else if(veids.equalsIgnoreCase("Pikantā")) {
					
				}else if(veids.equalsIgnoreCase("Kalifornija")) {
					
				}else {
					JOptionPane.showMessageDialog(null, "Picas veids neeksistē, mēģini vēlreiz!");
				}
				
				break;
			case "apskatit":
				break;
			case "cena":
				break;
			case "stop": JOptionPane.showMessageDialog(null, "Pasūtījums veiksmīgi atcelts, jauku dienu!"); break;
			default: JOptionPane.showMessageDialog(null, "Šādas darbības nepastāv, zvani uz talruni 676553312 un veic pasūtījumu vēlreiz!");
				
				
			}
		}while(!izvele.equalsIgnoreCase("stop"));
		
		
	}
}
