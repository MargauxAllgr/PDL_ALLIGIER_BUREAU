import java.sql.*;
/**
 * Classe faisant le lien entre la BDD et les lieu
 * 
 *
 */

public class LieuDAO extends GlobalDAO  {

	/**
	 * Constructeur de la classe
	 */
	
	public LieuDAO() {
		super();
	}
	
	/**
	 * Fonction qui permet d'ajouter un lieu � la BDD
	 * @param lieu
	 * @return retour
	 */
	
	public int ajouterLieuBDD(Lieu lieu) {
		Connection con = null;
		PreparedStatement ps = null;
		int retour = 0;
		
		//connexion � la BDD
		try {
			//tentative de co
			con = DriverManager.getConnection(URL, LOGIN, PASS);
			//pr�paration instruction SQL
			//penser � ajouter le vrai nom des colonnes apr�s
			ps = con.prepareStatement("INSERT INTO lieu (LIEU_NOM, LIEU_NOMBREACCES, LIEU_LIEUBLOQUE) VALUES(?, ?, ?)");
			//r�cup�ration des valeurs des attributs (les ? au dessus)
			ps.setString(1, lieu.getNom());
			ps.setInt(2, lieu.getNombreAcces());
			ps.setBoolean(3, lieu.getLieuBloque());
			
			//ex�cution de la requete
			retour = ps.executeUpdate();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			//fermeture du prepareStatement et de la co
			try {
				if (ps!= null) ps.close();
			}
			catch (Exception ignore) {}
			try {
				if (con != null) con.close();
			}
			catch (Exception ignore) {}
		}
		
		return retour;
	}
	
	/**
	 * 
	 */
	
}
