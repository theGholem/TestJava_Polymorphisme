package fr.Application1.gui;

public class Pnj2 extends Pnj {

	//Constructeur
	
	public Pnj2() {
			this.name="Voleur";
	}
		
	public String Pnj_skyColor() {
			return "Blanche";
	}
		
	public String Pnj_role() {
			String rst=this.name+" : "+" Demande de l'argent au joueur sur son chemin";
			return rst;
	}
		
	public String Particularity() {
			String rst="Est toujours en mode furtif et parle tres rapidement";
			return rst;
	}
		
	public int old() {
			return 23;
	}
}
