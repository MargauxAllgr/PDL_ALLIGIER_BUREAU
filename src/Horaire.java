/**
 * Classe représentant les horaires
 * 
 *
 */
public class Horaire {
	
	private String jour;
	private String debut;
	private String fin;
	
	public Horaire(String jour, String debut, String fin) {
		this.jour = jour;
		this.debut = debut;
		this.fin = fin;
	}
	
	//getters
	
	public String getJour() {
		return jour;
	}
	
	public String getDebut() {
		return debut;
	}
	
	public String getFin() {
		return fin;
	}
	
	
	//setters
	
}
