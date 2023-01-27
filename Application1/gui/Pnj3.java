package fr.Application1.gui;

public class Pnj3 extends Pnj implements MagicWandable {

	//Constructeur
	
	public Pnj3() {
			this.name="Vendeuse";
	}
		
	public String Pnj_skyColor() {
			return "METISSE";
	}
		
	public String Pnj_role() {
			String rst=this.name+" : "+" Invite tous les joueurs passant devant son Stand à acheter des pacotilles";
			return rst;
	}
		
	public String Particularity() {
			String rst="Se met à insulté tous les joueurs qui ne s'arrete pas devant son Stand";
			return rst;
	}
		
	public int old() {
			return 36;
	}
	
	/*
	 * pnj qui possede une baguette magique issu de l'interface 
	 * MagicWandable
	 */
	
	public void MagicWand() {
		System.out.println(this.name+" possede une baguette magique parmis ces antiquité qu'elle vend");
	}
}
