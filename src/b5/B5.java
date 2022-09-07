package b5;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class B5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String antaltxt = showInputDialog("Antall Poengsummer: ");
		int antal = parseInt(antaltxt);
		for (int i = 0; i < antal; i++) {
			String talltxt = showInputDialog("Skriv inn poengsum:");
		if (!talltxt.isEmpty()) {
			int tall = parseInt(talltxt);
			char karakter = 'P';
			
			if (tall < 0) {
				karakter = 'O'; 
				}
			else if (tall < 40) {
				karakter = 'F'; 
				}
			else if (tall < 50) {
				karakter = 'E'; 
				}
			else if (tall < 60) { 
				karakter = 'D'; 
				}
			else if (tall < 80) {
				karakter = 'C'; 
				}
			else if (tall < 90) {
				karakter = 'B'; 
				}
			else if (tall < 101) {
				karakter = 'A'; 
				}
			else {
				karakter = 'O'; 
				}
			
			if (karakter == 'O') {
				String error = ("Feilmelding: Verdien som ble tastet in er ugyldig");
				String error1 = ("Gyldige verdier er imellom 0-100");
				String error2 = ("Trykk ok for å prøve igjen");
				showMessageDialog(null, error + "\n" + error1 + "\n" + error2);
				antal = antal + 1;
								
			}
			else {
				String svar = ("Poengsummen gir karakteren: " + karakter);
			showMessageDialog(null, svar);
		}
			}
		}}
}

