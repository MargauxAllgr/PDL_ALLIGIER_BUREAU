/**
 * Classe mËre des DAO
 * Permet l'accËs ‡ la BDD
 *
 */
public class GlobalDAO {

	/**
	 * Param√®tres de connexion √† la base de donn√©es oracle URL, LOGIN et PASS
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
		// chargement du pilote de bases de donn√©es
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.err
					.println("Impossible de charger le pilote de BDD, ne pas oublier d'importer le fichier .jar dans le projet");
		}

	}
	
	

}
