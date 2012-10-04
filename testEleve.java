package eleve;

public class testEleve {
	
	public static void main(String[] args){
		Eleve e1 = new Eleve("toto");
		e1.ajouterNote(12);
		e1.ajouterNote(14);
		
		System.out.println(e1.toString());
		
		
	}
	
}
