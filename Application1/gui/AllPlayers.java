package fr.Application1.gui;

/*
 * Classe abstraite principale.
 * elle est caractérisé par l'age d'un joueur. Mais celui ci precise 
 * egalement son nom
 * c-a-d de facon abstraite on a le nom d'un joueur quelconque
 */

abstract public class AllPlayers {
	
	protected String name;
	
	public void nom() {
		System.out.println("NOM : "+this.name);
	}
	abstract public int old();

}
