package b4;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;
public class B4 {

	public static void main(String[] args) {
		
		// Simpelt program som beregner trinnskatt utifra bruttoinntekt
		String bruttotxt = showInputDialog("Bruttoinntekt:");
		int brutto = parseInt(bruttotxt);
		double sats = 0;
		
		if (brutto < 190349) {
			sats = 0;}
		else if (brutto < 267899) {
			sats = 0.017;}
		else if (brutto < 643799) {
			sats = 0.04;}
		else if (brutto < 969199) {
			sats = 0.134;}
		else if (brutto < 1999999) {
			sats = 0.164;}
		else {
			sats = 0.174;}
		
		double skatt = Math.round(sats * brutto);
		double realsats = sats * 100;
		String svar = ("Med bruttolønn på: " + bruttotxt + "kr.");
		String svar2 = ("Betaler du en trinn skatt på: " + realsats + "%.");
		String svar3 = ("Som tilsvarer utifra bruttoinntekt: " + skatt + "kr i trinnskatt.");
		showMessageDialog(null, svar + "\n" + svar2 + "\n" + svar3);	
	}


}
