package fr.Application1.gui;

/*
 * classe concrete qui etend une classe abstraite
 * alors celle ci doit avoir exactement les meme methode de la classe abstraite
 * mais aussi les meme methode de la classe abstrait dont herite notre 
 * classe abstraite
 * 
 */

public class Fighter1 extends Fighters implements BoostFlyable {

	//Constructeur
	
	public Fighter1(){
		this.name="KAMADO TANJIRO";
	}
	
	public int Fighters_level() {
		return 30;
	}
	
	public String Fighters_power() {
		
		String rst=this.name+" : "+" Detenteur du soufle du soleil et de l'eau.";
		return rst;
	}
	
	public int old() {
		return 13;
	}
	
	/*
	 * Combattant qui peut voler et qui a un booster(issu de notre interface)
	 */
	
	public void fly() {
		System.out.println(this.name+" est capable de voler");
	}
	public void booster() {
		System.out.println(this.name+ " a vu son niveau augmenté et il vaut maintenant : "+2*Fighters_level());
		
		//2*30
	}
}
