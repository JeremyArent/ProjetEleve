package eleve;

import java.util.ArrayList;

public class Eleve {

	private String nom;
	private ArrayList<Integer> listeNotes; 
	private double sommeNotes;
	
	public Eleve(String unNom){
		this.nom = unNom;
		this.listeNotes = new ArrayList<Integer>();
	}
	
	public ArrayList<Integer> getListeNotes() {
		return this.listeNotes;
	}
	
	public void ajouterNote(int note) {
		if(note<0){
			this.listeNotes.add(0);
			this.sommeNotes=this.sommeNotes + 0;
		}
		else if(note>20){
			this.listeNotes.add(20);
			this.sommeNotes=this.sommeNotes + 20;
		}
		else{
		this.listeNotes.add(note);
		this.sommeNotes=this.sommeNotes + note;
		}
	}
	
	public double getMoyenne(){
		return this.sommeNotes/this.listeNotes.size();
	}

	public String toString(){
		return "Nom : "+ this.nom + " Moyenne : " + this.getMoyenne();
	}
	
}


