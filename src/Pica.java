import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Pica {
	static double Margherita(double cena) {
		
		return cena;
	}
	
	static void apskatit(double cena, String vards, int lielums, String adrese, String veids, boolean piegade, boolean dzeriens, String talrunis, String piegade1, String dzeriens1) {
		if(piegade=true) {
			
		}else {
			adrese = "NAV";
			talrunis = "NAV";
			piegade1 = "";
		}
		
		try {
			FileWriter writer = new FileWriter("pasutijums.txt", false);
			PrintWriter write = new PrintWriter(writer);
			write.print(vards+", "+cena+", "+lielums+"cm, "+adrese+", "+veids+", piegāde - "+piegade1+", dzēriens - "+dzeriens1);
			write.close();
		}catch(Exception e) {
			System.out.println("Kļūda");
		}
		
		
		String teksts, nolasits = "";
		try {
			FileReader reader = new FileReader("pasutijums.txt");
			BufferedReader read = new BufferedReader(reader);
			while((teksts = read.readLine()) !=null) {
				nolasits += teksts;
			}
			read.close();
			
			JOptionPane.showMessageDialog(null, nolasits);
		}catch(Exception e) {
			System.out.println("Kļūda!");
		}
	}
	public static void main(String[] args) {
		double cena=0;
		String izvele;
		int lielums=0;
		String adrese="", vards="", talrunis="", veids="", piegade1="", dzeriens1="";
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
					
				}else if(veids.equalsIgnoreCase("Kalifornija")) {
					
				}else {
					JOptionPane.showMessageDialog(null, "Picas veids neeksistē, mēģini vēlreiz!");
				}
				
				break;
			case "apskatit":
				apskatit(cena, vards, lielums, adrese, veids, piegade, dzeriens, talrunis, piegade1, dzeriens1);
				break;
			case "cena":
				JOptionPane.showMessageDialog(null, "Pašreizējā cena "+cena);
				break;
			case "stop": JOptionPane.showMessageDialog(null, "Pasūtījums veiksmīgi atcelts, jauku dienu!"); break;
			default: JOptionPane.showMessageDialog(null, "Šādas darbības nepastāv, zvani uz talruni 676553312 un veic pasūtījumu vēlreiz!");
				
				
			}
		}while(!izvele.equalsIgnoreCase("stop"));
		
		
	}
}
