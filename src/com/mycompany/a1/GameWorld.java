package com.mycompany.a1;

import Objects.SpaceStation;

/**
 * The GameWorld is a model that holds the program's data such as
 * a collection of game GameObjects and other state variables.
 * 
 * @author Blake Matis
 *
 */
public class GameWorld {
	
	/*---------------------------------------DATA---------------------------------------*/
	

	

	


	/*-----------------------------------CONSTRUCTORS-----------------------------------*/
	/**
	 * Default Constructor
	 */
	public GameWorld(){
		
	}
	
	/*-------------------------------------METHODS--------------------------------------*/
	
	/**
	 * 
	 */
	public void init(){
		
	}

	/**
	 * 
	 */
	public void decreaseShipSpeed() {
		// TODO Auto-generated method stub
		
	}

	public void newAsteroid() {
		// TODO Auto-generated method stub
		
	}

	public void newFlyingSaucer() {
		// TODO Auto-generated method stub
		
	}

	public void newBlinkingSpaceStation() {
		// TODO Auto-generated method stub
		
	}

	public void newShip() {
		// TODO Auto-generated method stub
		
	}

	public void eliminate() {
		// TODO Auto-generated method stub
		
	}

	public void turnShipLeft() {
		// TODO Auto-generated method stub
		
	}

	public void fireMissile() {
		// TODO Auto-generated method stub
		
	}

	public void jumpThroughSpace() {
		// TODO Auto-generated method stub
		
	}

	public void loadNewMissiles() {
		// TODO Auto-generated method stub
		
	}

	public void missileKilledAsteroid() {
		// TODO Auto-generated method stub
		
	}

	public void shipCrashedIntoAsteroid() {
		// TODO Auto-generated method stub
		
	}

	public void shipHitFlyingSaucer() {
		// TODO Auto-generated method stub
		
	}

	public void asteroidsExterminated() {
		// TODO Auto-generated method stub
		
	}

	public void asteroidWhackedFlyingSaucer() {
		// TODO Auto-generated method stub
		
	}

	public void tick() {
		// TODO Auto-generated method stub
		
	}

	public void print() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Prints a map showing the current world state.
	 * Calls toString methods for all GameObjects in the
	 * GameWorld.
	 */
	public void map() {
		// TODO Auto-generated method stub
		SpaceStation spaceStation = new SpaceStation();
		System.out.println(spaceStation.toString());
	}

	/**
	 * Terminates the program.
	 */
	public void quit() {
		System.exit(0);
	}
}
