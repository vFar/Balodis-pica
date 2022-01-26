import javax.swing.JOptionPane;

public class Pica {
	static double Margherita(double cena) {
		
		return cena;
	}
	public static void main(String[] args) {
		double cena=0;
		String izvele;
		String adrese="", vards, talrunis, veids, piegade1, dzeriens1;
		boolean piegade=false, dzeriens=false;
		
		do {
			izvele = JOptionPane.showInputDialog("pasutit - veikt pasūtījumu "
					+ "\napskatit - apskatīt savu pasūtījumu "
					+ "\ncena - pašreizējā cena "
					+ "\nstop - atcelt pasūtījumu");
			
			switch(izvele) {
			case "pasutit":
				veids = JOptionPane.showInputDialog("Kādu picas veidu izvēlēsies? "
						+ "\nMargherita | Pepperoni | Pikantā | Kalifornija ");
				
				dzeriens1 = JOptionPane.showInputDialog("Piedāvāt dzērienu no mūsu kolekcijas? "
						+ "\nCoca-Cola +0.80centi || Sprite +0.60centi || Fanta +0.80centi || Negāzēts ūdens +0.30centi || Atstāj tukšu, ja nevēlies dzērienu");
				if(dzeriens1.equalsIgnoreCase("Coca-Cola") || dzeriens1.equalsIgnoreCase("Sprite") || dzeriens1.equalsIgnoreCase("Fanta") || dzeriens1.equalsIgnoreCase("Negāzēts ūdens")) {
					dzeriens=true;
				}else {
					dzeriens=false;
				}
				System.out.println(dzeriens);
				
				piegade1 = JOptionPane.showInputDialog("Piegāde uz mājām, jā vai nē?");
				if(piegade1.equalsIgnoreCase("jā")) {
					piegade = true;
					adrese = JOptionPane.showInputDialog("Uz kuru adresi piegādāt picu?");
					talrunis = JOptionPane.showInputDialog("Kāds Jums talrunis uz, kuru zvanīt?");
				}else if(piegade1.equalsIgnoreCase("nē")) {
					piegade = false;
				}else {
					JOptionPane.showMessageDialog(null, "Vajadzēja ievadīt tikai jā vai nē!");
				}
				
				
				if(veids.equalsIgnoreCase("Margherita")) {
					Margherita(cena);
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
