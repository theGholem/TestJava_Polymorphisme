package fr.Application1.gui;

/*
 * on crée une interface, contrat ou encore API, pour pouvoir excécuter
 * une de ces methodes sur nos classes.
 * 
 * Ainsi on peut choisir d'attribuer a n importe quelle classe les methode 
 * de notre interface. Une fois qu une classe implement une interface, celle ci
 * doit utiliser toutes les methodes de l'interface
 * 
 */

public interface BoostFlyable {

	void fly();
	void booster();
	
	
	//Booster= 2* level 
}
