import java.util.ArrayList;

/**
 * Classe représentant un lieu
 * 
 *
 */
public class Lieu {

	private String nom;
	private int nombreAcces;
	private boolean lieuBloque;
	private ArrayList<Horaire> listeHoraires; 
	
	/**
	 * constructeur de la classe
	 * @param nom String
	 * @param nombreAcces int
	 */
	public Lieu (String nom, int nombreAcces) {
		this.nom = nom;
		this.nombreAcces = nombreAcces;
		this.lieuBloque = false;
		listeHoraires = new ArrayList<Horaire>();
	}
	
	//getters :
	
	/**
	 * Fonction get nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * Fonction get nombre acces
	 */
	public int getNombreAcces() {
		return nombreAcces;
	}
	/**
	 * Fonction getListeHoraire
	 */
	public ArrayList<Horaire> getListeHoraires(){
		return listeHoraires;
	}
	/**
	 * Fonction get LieuBloque
	 */
	public boolean getLieuBloque() {
		return lieuBloque;
	}
	
	//setters :
	
	/**
	 * Fonction set nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * 
	 */
	public void setNombreAcces(int nombreAcces) {
		this.nombreAcces = nombreAcces;
	}
	/**
	 * 
	 */
	public void setListeHoraire(ArrayList<Horaire> listeHoraires) {
		this.listeHoraires = listeHoraires;
	}
	/**
	 * 
	 */
	public void setLieuBloque(boolean lieuBloque) {
		this.lieuBloque = lieuBloque;
	}
}
