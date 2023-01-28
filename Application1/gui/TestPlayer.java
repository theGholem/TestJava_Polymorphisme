package fr.Application1.gui;

/*
 * on veut afficher le nom, le niveau, le pouvoir et l'age des combattants
 * magiciens et bandits
 * on veut egalement savoir s'il vole, et si saon niveau est boosté,
 * ou s'il possede une baguette magique
 * 
 * 
 * on veut afficher le role , la couleur de peau,des Pnj,
 * on veut egalement savoir s'il possede une baguette magique ou s'il vole
 * 
 */

public class TestPlayer {

	public static void main(String[] args) {
		
		/*
		 * on ne peut pas instancier une classe abstraite, c-a-d on ne peut pas
		 * creer des objets avec, mais on peut louer des espace à traver 
		 * la création de tableau avec  ces classes abstraite
		 * 
		 */
		
		Fighters[] sumFighters=new Fighters[2]; // on a 2 combattants
		Wizard[]   sumWizards =new Wizard[2];	// on a 2 magiciens
		Bandits[]  sumBandits =new Bandits[3];  // on a 3 bandits
		Pnj[]      sumPnj     =new Pnj[4];		// on a 4 Pnj
		
		
		//instantiation de nos classes
		
		sumFighters[0]=new Fighter1();
		sumFighters[1]=new Fighter2();
		
		sumWizards[0] =new Wizard1();
		sumWizards[1] =new Wizard2();
		
		sumBandits[0] =new Bandit1();
		sumBandits[1] =new Bandit2();
		sumBandits[2] =new Bandit3();
		
		sumPnj[0]     =new Pnj1();
		sumPnj[1]     =new Pnj2();
		sumPnj[2]     =new Pnj3();
		sumPnj[3]     =new Pnj4();
		
		//Combattant 1
		
		System.out.println("\n__Combattant 1__\n\n"+sumFighters[0].Fighters_power()+" \nNiveau atteint: "+sumFighters[0].Fighters_level()+"\nAge : "+sumFighters[0].old()+" ans");
		
		//Combattant 2
		
		System.out.println("\n__Combattant 2__\n\n"+sumFighters[1].Fighters_power()+" \nNiveau atteint: "+sumFighters[1].Fighters_level()+"\nAge : "+sumFighters[1].old()+" ans");
		
		//Magicien 1
		
		System.out.println("\n__Magicien 1__\n\n"+sumWizards[0].Wizard_power()+" \nNiveau atteint: "+sumWizards[0].Wizard_level()+"\nAge : "+sumWizards[0].old()+" ans");
		
		//Magicien 2
		
		System.out.println("\n__Magicien 2__\n\n"+sumWizards[1].Wizard_power()+" \nNiveau atteint: "+sumWizards[1].Wizard_level()+"\nAge : "+sumWizards[1].old()+" ans");
		
		//Bandit 1
		
		System.out.println("\n__Bandit 1__\n\n"+sumBandits[0].Bandits_power()+" \nNiveau atteint: "+sumBandits[0].Bandits_level()+"\nAge : "+sumBandits[0].old()+" ans");
		
		//Bandit 2
		
		System.out.println("\n__Bandit 2__\n\n"+sumBandits[1].Bandits_power()+" \nNiveau atteint: "+sumBandits[1].Bandits_level()+"\nAge : "+sumBandits[1].old()+" ans");
		
		//Bandit 3
		
		System.out.println("\n__Bandit 3__\n\n"+sumBandits[2].Bandits_power()+" \nNiveau atteint: "+sumBandits[2].Bandits_level()+"\nAge : "+sumBandits[2].old()+" ans");
		
		//Pnj 1
		
		System.out.println("\n__Pnj 1__\n\n"+sumPnj[0].Pnj_role()+" \nCouleur de peau : "+sumPnj[0].Pnj_skyColor()+"\nParticularité : "+sumPnj[0].Particularity()+"\nAge : "+sumPnj[0].old()+" ans");
		
		//Pnj 2
		
		System.out.println("\n__Pnj 2__\n\n"+sumPnj[1].Pnj_role()+" \nCouleur de peau : "+sumPnj[1].Pnj_skyColor()+"\nParticularité : "+sumPnj[1].Particularity()+"\nAge : "+sumPnj[1].old()+" ans");
		
		//Pnj 3
		
		System.out.println("\n__Pnj 3__\n\n"+sumPnj[2].Pnj_role()+" \nCouleur de peau : "+sumPnj[2].Pnj_skyColor()+"\nParticularité : "+sumPnj[2].Particularity()+"\nAge : "+sumPnj[2].old()+" ans");
		
		//Pnj 4
		
		System.out.println("\n__Pnj 4__\n\n"+sumPnj[3].Pnj_role()+" \nCouleur de peau : "+sumPnj[3].Pnj_skyColor()+"\nParticularité : "+sumPnj[3].Particularity()+"\nAge : "+sumPnj[3].old()+" ans");
		
		
		//instantiation avec nos interface
		
		BoostFlyable[] elements1= {new Fighter1(),new Fighter2(),new Wizard1(),new Bandit1(),new Bandit2(),new Bandit3()}; // BoostFlyable[] elements= new BoostFlyable[6];
		System.out.println("\n___Petite particularité de certains joueur___\n");
		
		for(BoostFlyable e : elements1)
			e.fly();
		System.out.println();
		for(BoostFlyable e : elements1)
			e.booster();
			
		System.out.println();
		
		MagicWandable[] elements2= {new Wizard2(),new Pnj1(),new Pnj3()}; //MagicWandable[] elements=new MagicWandable[3];
		
		for(MagicWandable e : elements2)
			e.MagicWand();

                 //This is an another remark 
	}

}
