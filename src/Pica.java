import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Pica {
	public static double Margherita(double cena1, int lielums) {
		
		if(lielums == 20) {
			cena1 = cena1 + 3.14;
		}else if(lielums == 30) {
			cena1 = cena1 + 5.84;
		}else if(lielums == 50) {
			cena1 = cena1 + 10.34;
		}else {
			System.out.println("Kļūda");
		}
		
		JOptionPane.showMessageDialog(null, "\tMargaritas picas sastāvdaļas"
				+ "\nMozarella, tomātu mērce, eļļas un ķiploku mērce, oregano");
		
		
		JOptionPane.showMessageDialog(null, "\t1889. gada 11. jūnijā, pavāru Raffaele Esposito uzaicināja izcept picu Savojas Margaritai, kas bija karaļa Umberto sieva, "
				+ "picas sastāvdaļas tika izvēlētas pēc itāļu karoga krāsām - sarkans(tomāti), balts(mozzarella) un zaļš(baziliks)");
		
		return cena1;
	}
	
	static void apskatit(double cena, String vards, int lielums, String adrese, String veids, boolean piegade, boolean dzeriens, String talrunis, String piegade1, String dzeriens1) {
		try {
			if(piegade==true) {
				
			}else {
				adrese = "NAV";
				talrunis = "NAV";
				piegade1 = "nē";
			}
			
			if(dzeriens ==false) {
				dzeriens1 = "nē";
			}
			
			
			FileWriter writer = new FileWriter("pasutijums.txt", false);
			PrintWriter write = new PrintWriter(writer);
			write.print(vards+", "+talrunis+", cena - "+cena+", "+lielums+"cm, "+adrese+", "+veids+", piegāde - "+piegade1+", dzēriens - "+dzeriens1);
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
				+ "\nVistas gaļas siers, konservēti ananasi, tomātu mērce, eļļas un ķiploku mērce, oregano", "Sastāvdaļas", JOptionPane.INFORMATION_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "Pastāv visādu pikantās picas veidi, piemēram, Kaprichoza, Diablo - kura sastāv tikai no sēnēm, karstajiem pipariem \n"
				+ "salami un vairākiem siera veidiem. Abi ir garšīgi, bet diezgan pikanti.", "Neliela vēsture", JOptionPane.INFORMATION_MESSAGE);
		
		return cena;
	}
	
	public static void main(String[] args) {
		//Pie cenām tika lietota cilipizza.lv ēdienkarte!
		double cena=0;
		int lielums=0;
		String adrese="", vards="", veids="", piegade1="", dzeriens1="";
		String talrunis="";
		boolean piegade=false, dzeriens=false;
		String izvele;
		
		
		do {
			izvele = JOptionPane.showInputDialog("pasutit - veikt pasūtījumu "
					+ "\napskatit - apskatīt savu pasūtījumu "
					+ "\ncena - pašreizējā cena "
					+ "\nstop - atcelt pasūtījumu");
			
			switch(izvele) {
			case "pasutit":
				do {
				veids = JOptionPane.showInputDialog("Kādu picas veidu izvēlēsies? "
						+ "\nMargherita | Pepperoni | Pikantā | Kalifornija | atcelt");
				}while(veids.equalsIgnoreCase("atcelt"));
				
				if(veids.equalsIgnoreCase("atcelt")) {
					JOptionPane.showMessageDialog(null, "Pasūtījums atcelts, jauku dienu!");
					break;
				}
				
				
				vards = JOptionPane.showInputDialog("Kāds Jums vārds?");
				dzeriens1 = JOptionPane.showInputDialog("Piedāvāt dzērienu no mūsu kolekcijas? "
						+ "\nCoca-Cola +0.50centi || Sprite +0.50centi || Fanta +0.50centi || Negāzēts ūdens +0.50centi || Atstāj tukšu, ja nevēlies dzērienu");
				
				if(dzeriens1.equalsIgnoreCase("Coca-Cola") || dzeriens1.equalsIgnoreCase("Sprite") || dzeriens1.equalsIgnoreCase("Fanta") || dzeriens1.equalsIgnoreCase("Negāzēts ūdens")) {
					dzeriens=true;
					cena = cena + 0.50;
				}else if(dzeriens1.equalsIgnoreCase("")) {
					dzeriens=false;
				}
				
				do {
				piegade1 = JOptionPane.showInputDialog("Piegāde uz mājām, jā vai nē? +3EUR");
				if(piegade1.equalsIgnoreCase("jā")) {
					cena = cena + 3;
					piegade = true;
				}else if(piegade1.equalsIgnoreCase("nē")) {
					piegade = false;
				}
				}while(!piegade1.equalsIgnoreCase("jā") && !piegade1.equalsIgnoreCase("nē"));
				
				
				if(piegade==true) {
					adrese = JOptionPane.showInputDialog("Uz kuru adresi piegādāt picu?");
					talrunis = JOptionPane.showInputDialog("Kāds Jums talrunis uz, kuru zvanīt?");
				}
				
				
				do {
				lielums = Integer.parseInt(JOptionPane.showInputDialog("Kāds lielums picai? Piedāvājumā 20cm, 30cm, 50cm"));
				}while(lielums!=20 && lielums!=30 && lielums!=50);
				
				
				
				
				if(veids.equalsIgnoreCase("Margherita")) {
					cena = Margherita(cena, lielums);
				}else if(veids.equalsIgnoreCase("Pepperoni")) {
					
				}else if(veids.equalsIgnoreCase("Pikantā")) {
					cena = Pikanta(cena, lielums);
				}else if(veids.equalsIgnoreCase("Kalifornija")) {
					
				}else {
					JOptionPane.showMessageDialog(null, "Picas veids pašlaik nav mūsu ēdienkartē, mēģini vēlreiz!");
				}
				cena = (cena*100)/100;
				
				break;
			case "apskatit":
				apskatit(cena, vards, lielums, adrese, veids, piegade, dzeriens, talrunis, piegade1, dzeriens1);
				break;
			case "cena":
				JOptionPane.showMessageDialog(null, "Pašreizējā cena "+cena+"€");
				break;
			case "stop": JOptionPane.showMessageDialog(null, "Pasūtījums veiksmīgi atcelts, jauku dienu!"); break;
			default: JOptionPane.showMessageDialog(null, "Šādas darbības nepastāv, zvani uz talruni 676553312 un veic pasūtījumu vēlreiz!");
				
				
			}
			}while(!izvele.equalsIgnoreCase("stop"));
		
		}
	}
