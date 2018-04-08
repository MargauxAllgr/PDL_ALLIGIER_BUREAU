/**
 *  Fonction main du programme
 * 
 * @author Margaux ALLIGIER & Florian BUREAU
 * @version 1.0
 */


public class SystemeDeGestionAccesESIGELEC {

	public static void main(String[] args) {
		// méthode main, de test

		LieuDAO test;
		Lieu testbis;
		
		
		test = new LieuDAO();
		testbis = new Lieu("Testbis", 7);
		
		test.ajouterLieuBDD(testbis);
		
		
	}

}
