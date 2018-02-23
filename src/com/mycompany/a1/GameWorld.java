package com.mycompany.a1;

import Objects.Ship;
import Objects.SpaceStation;
import java.util.Vector;
import Objects.GameObject;
import Objects.Missile;
import Objects.Asteroid;
import Objects.FlyingSaucer;


/**
 * The GameWorld is a model that holds the program's data such as
 * a collection of game GameObjects and other state variables.
 * 
 * @author Blake Matis
 *
 */
public class GameWorld {
	
	/*---------------------------------------DATA---------------------------------------*/
	private Vector<GameObject> gameObjectsVector;
	private Ship ship;
	private SpaceStation spaceStation;
	private Asteroid asteroid;
	private Missile missile;
	private FlyingSaucer flyingSaucer;
	
	

	

	


	/*-----------------------------------CONSTRUCTORS-----------------------------------*/
	/**
	 * Default Constructor
	 */
	public GameWorld(){
		init();
	}
	
	/*-------------------------------------METHODS--------------------------------------*/
	
	/**
	 * 
	 */
	public void init(){
		gameObjectsVector = new Vector<GameObject>();
		newShip();
	}

	/**
	 * Decreases the speed of the Ship.
	 */
	public void decreaseShipSpeed() {
		ship.decreasSpeed();
	}

	/**
	 * Adds a new Asteroid to the GameWorld
	 */
	public void newAsteroid() {
		asteroid = new Asteroid();
		gameObjectsVector.add(asteroid);
	}

	/**
	 * Adds a new FlyingSaucer to the GameWorld.
	 */
	public void newFlyingSaucer() {
		flyingSaucer = new FlyingSaucer();
		gameObjectsVector.add(flyingSaucer);
	}

	/**
	 * Adds a new SpaceStation to the GameWorld.
	 */
	public void newBlinkingSpaceStation() {
		spaceStation = new SpaceStation();
		gameObjectsVector.add(spaceStation);
	}

	/**
	 * Adds a new Ship to the GameWorld.
	 */
	public void newShip() {
		ship = new Ship();
		gameObjectsVector.add(ship);
		
	}

	
	public void eliminate() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Steers the ship to the left.
	 */
	public void turnShipLeft() {
		ship.steerLeft();
	}
	
	/**
	 * Steers the ship to the right.
	 */
	public void turnShipRight(){
		ship.steerRight();
	}

	/**
	 * The ship fires a Missile from its current location if the ship
	 * has missiles available to fire.
	 * 
	 * On Success a new missile is created with the ships current location,
	 * direction, and speed. The missile is then added to the GameWorld and the
	 * ships current missile count is decreased by one.
	 */
	public void fireMissile() {
		if(ship.getMissileCount() > 0){
			missile = new Missile(ship.getLocation(), ship.getDirection(), ship.getSpeed());
			gameObjectsVector.add(missile);
			ship.decreaseMissiles();
		}
	}

	public void jumpThroughSpace() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * The ships missile count is reloaded and set to the max
	 * missile capacity for the ship.
	 */
	public void loadNewMissiles() {
		ship.setMissileCount(ship.getMaxMissileCount());
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

	public void asteroidExterminated() {
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
		//TODO
		for(int index = 0; index < gameObjectsVector.size(); index++){
			System.out.println(gameObjectsVector.elementAt(index).toString());
		}
	}

	/**
	 * Terminates the program.
	 */
	public void quit() {
		//TODO
		System.exit(0);
	}
}
