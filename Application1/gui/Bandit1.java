package fr.Application1.gui;

public class Bandit1 extends Bandits implements BoostFlyable {

	//Constructeur
	
	public Bandit1() {
		this.name="DOMA";
	}
	
	public int Bandits_level() {
		return 17;
	}
	
	public String Bandits_power() {
		String rst=this.name+" : "+" Pouvoir de la glace";
		return rst;
	}
	
	public int old() {
		return 210;
	}
	
	/*
	 * Bandit qui peut voler et qui a un booster(issu de notre interface
	 * BoostFlyable)
	 */
	
	public void fly() {
		System.out.println(this.name+" est capable de s'en voler");
	}
	public void booster() {
		System.out.println(this.name+ " a vu son niveau augmenté et il vaut maintenant : "+2*Bandits_level());
		
		// 2*17
	}
	
	
}
