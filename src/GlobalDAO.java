/**
 * Classe m�re des DAO
 * Permet l'acc�s � la BDD
 *
 */
public class GlobalDAO {

	/**
	 * Paramètres de connexion à la base de données oracle URL, LOGIN et PASS
	 * sont des constantes
	 */
	final static String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	final static String LOGIN = "BDD1";  //exemple BDD1
	final static String PASS = "BDD1";   //exemple BDD1
	
	
	/**
	 * Constructeur de la classe
	 * 
	 */
	public GlobalDAO() {
		// chargement du pilote de bases de données
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.err
					.println("Impossible de charger le pilote de BDD, ne pas oublier d'importer le fichier .jar dans le projet");
		}

	}
	
	

}
