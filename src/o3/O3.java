package o3;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class O3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ntxt = showInputDialog("Gi Ett Tall:");
		int n = parseInt(ntxt);
		if (n < 0) {
			String svartxt = ("Ugyldig!");
			showMessageDialog(null, svartxt);	
		}
		else {
			int svar = 1;
			for (int i = 1; i <= n; i++) {
				svar=i*svar;
			}
			String svartxt = ("Svar: " + svar);
			showMessageDialog(null, svartxt);	
		}
	}

}
