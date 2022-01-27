import javax.swing.JOptionPane;

public class Pica {
	static double Margherita(double cena) {
		
		return cena;
	}
	
	static double Pikanta(double cena, int lielums) {
		if(lielums==20) {
			cena += 5.49;
		}else if(lielums==30) {
			cena += 9.99;
		}else {
			//50cm
			cena += 16.99;
		}
		
		JOptionPane.showMessageDialog(null, "Pikantās picas sastāvdaļas \n"
				+ "\nVistas gaļas siers, konservēti ananasi, tomātu mērce, eļļas un ķiploku mērce, oregano");
		return cena;
	}
	public static void main(String[] args) {
		double cena=0;
		String izvele;
		int lielums=0;
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
				
				vards = JOptionPane.showInputDialog("Kāds Jums vārds?");
				
				dzeriens1 = JOptionPane.showInputDialog("Piedāvāt dzērienu no mūsu kolekcijas? "
						+ "\nCoca-Cola +0.50centi || Sprite +0.50centi || Fanta +0.50centi || Negāzēts ūdens +0.50centi || Atstāj tukšu, ja nevēlies dzērienu");
				
				if(dzeriens1.equalsIgnoreCase("Coca-Cola") || dzeriens1.equalsIgnoreCase("Sprite") || dzeriens1.equalsIgnoreCase("Fanta") || dzeriens1.equalsIgnoreCase("Negāzēts ūdens")) {
					dzeriens=true;
					cena += 0.50;
				}else {
					dzeriens=false;
				}
				
				do {
				piegade1 = JOptionPane.showInputDialog("Piegāde uz mājām, jā vai nē? +3EUR");
				if(piegade1.equalsIgnoreCase("jā")) {
					piegade = true;
					cena += 3;
					adrese = JOptionPane.showInputDialog("Uz kuru adresi piegādāt picu?");
					talrunis = JOptionPane.showInputDialog("Kāds Jums talrunis uz, kuru zvanīt?");
				}else if(piegade1.equalsIgnoreCase("nē")) {
					piegade = false;
				}
				}while(!piegade1.equalsIgnoreCase("jā") && !piegade1.equalsIgnoreCase("nē"));
				
				do {
				lielums = Integer.parseInt(JOptionPane.showInputDialog("Kāds lielums picai? Piedāvājam 20cm, 30cm, 50cm"));
				}while(lielums!=20 && lielums!=30 && lielums!=50);
				
				if(veids.equalsIgnoreCase("Margherita")) {
					Margherita(cena);
				}else if(veids.equalsIgnoreCase("Pepperoni")) {
					
				}else if(veids.equalsIgnoreCase("Pikantā")) {
					Pikanta(cena, lielums);
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
