package com.mycompany.a2;

import Objects.Ship;
import Objects.SpaceStation;

import java.util.Observable;
import java.util.Vector;

import Interfaces.IGameWorld;
import Interfaces.IMovable;
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
public class GameWorld extends Observable  implements IGameWorld{
	
	/*---------------------------------------DATA---------------------------------------*/
	//Objects
	private Vector<GameObject> gameObjectsVector;
	private Ship ship;
	private SpaceStation spaceStation;
	private Asteroid asteroid;
	private Missile missile;
	private FlyingSaucer flyingSaucer;
	
	//Flags
	private boolean exitGame = false;
	
	//Game State Data
	private int lives;
	private int score;
	private int shipMissileCount;
	private int time;
	
	

	

	




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
		newAsteroid();
		newBlinkingSpaceStation();
		newFlyingSaucer();
		
		setTime(0);
		setScore(0);
		setLives(3);
		setShipMissileCount(ship.getMissileCount());
		
	}
	
	/**
	 * Decreases the lives remaining in the game. If the lives
	 * remaining is zero and this method is called the game is over.
	 */
	public void decreaseLives(){
		if(lives == 0){
			System.out.print("GameOver");
			map();
		}
		else if(lives > 0){
			lives--;
		}
	}
	
	/**
	 * Gets the amount of time elapsed in the Game World.
	 * @return time
	 * 		Integer amount of time elapsed.
	 */
	public int getTime() {
		return time;
	}

	/**
	 * Sets the amount of time elapsed in the Game World.
	 * @param time
	 * 		Integer amount of time elapsed.
	 */
	public void setTime(int time) {
		this.time = time;
	}

	/**
	 * Sets the game world value of a ships missile count.
	 * @param missileCount
	 * 		the missile count of a ship.
	 */
	public void setShipMissileCount(int missileCount) {
		this.shipMissileCount = missileCount;
	}
	
	/**
	 * Gets the current missile count of the ship.
	 * @return shipMissileCount
	 * 		The current missile count of the ship.
	 */
	public int getShipMissileCount(){
		return shipMissileCount;
	}

	
	/**
	 * Increases the speed of the Ship.
	 */
	public void increaseShipSpeed() {
		if(gameObjectsVector.contains(ship)){
			ship.increaseSpeed();
		}
	}
	
	/**
	 * Decreases the speed of the Ship.
	 */
	public void decreaseShipSpeed() {
		if(gameObjectsVector.contains(ship)){
			ship.decreaseSpeed();
		}
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
	

	/**
	 * Increases the score by one.
	 */
	public void incrementScore(){
		score++;
	}

	/**
	 * This method is called when a missile has struck and eliminated
	 * a flying saucer. In effect the Game World will remove a missile
	 * and flying saucer if there are at least one missile and flying
	 * saucer available. The player's score will be increased by one.
	 */
	public void eliminate() {
		if(gameObjectsVector.contains(flyingSaucer) && gameObjectsVector.contains(missile)){
			gameObjectsVector.remove(flyingSaucer);
			gameObjectsVector.remove(missile);
			incrementScore();
		}else{
			//do nothing
		}
		
	}

	/**
	 * Steers the ship to the left.
	 */
	public void turnShipLeft() {
		if(gameObjectsVector.contains(ship)){
			ship.steerLeft();
		}
	}
	
	/**
	 * Steers the ship to the right.
	 */
	public void turnShipRight(){
		if(gameObjectsVector.contains(ship)){
			ship.steerRight();
		}
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
		if(gameObjectsVector.contains(ship)){
			if(ship.getMissileCount() > 0){
				missile = new Missile(ship.getLocation(), ship.getDirection(), ship.getSpeed());
				gameObjectsVector.add(missile);
				ship.decreaseMissiles();
				setShipMissileCount(ship.getMissileCount());
			}
		}
	}

	/**
	 * Causes the ship to instantly jump to the initial default
	 * position in the middle of the screen regardless of its current
	 * position.
	 */
	public void jumpThroughSpace() {
		if(gameObjectsVector.contains(ship)){
			ship.moveToDefaultLocation();
		}
	}

	/**
	 * The ships missile count is reloaded and set to the max
	 * missile capacity for the ship.
	 */
	public void loadNewMissiles() {
		if(gameObjectsVector.contains(ship)){
			ship.setMissileCount(ship.getMaxMissileCount());
			setShipMissileCount(ship.getMissileCount());
		}
	}

	/**
	 * Missile has struck and killed an asteroid. Must be at least one
	 * missile and one asteroid in the Game World. Tells the Game World
	 * to remove a missile and an asteroid and to increment the player's
	 * score by 1.
	 */
	public void missileKilledAsteroid() {
		if(gameObjectsVector.contains(missile) &&
				gameObjectsVector.contains(asteroid)){
			gameObjectsVector.remove(asteroid);
			gameObjectsVector.remove(missile);
			incrementScore();
		}else{
			//do nothing
		}
		
	}

	/**
	 * The ship has crashed into an asteroid. There must be at least one
	 * ship and one asteroid. Decrements the count of lives left and if
	 * no lives are left then the game is over.
	 */
	public void shipCrashedIntoAsteroid() {
		if(gameObjectsVector.contains(ship) &&
				gameObjectsVector.contains(asteroid)){
			gameObjectsVector.remove(asteroid);
			gameObjectsVector.remove(ship);
			decreaseLives();
		}else{
			//do nothing
		}
		
	}

	/**
	 * The ship has crashed into a flying saucer. There must be at least one
	 * ship and one flying saucer. Decrements the count of lives left and if
	 * no lives are left then the game is over.
	 */
	public void shipHitFlyingSaucer() {
		if(gameObjectsVector.contains(ship) &&
				gameObjectsVector.contains(flyingSaucer)){
			gameObjectsVector.remove(flyingSaucer);
			gameObjectsVector.remove(ship);
			decreaseLives();
		}else{
			//do nothing
		}
	}

	/**
	 * Two asteroid have collided with one another. There must be at 
	 * least two asteroids in the game world.
	 */
	public void asteroidExterminated() {
		for(int index = 0; index < gameObjectsVector.size(); index++){
			if(gameObjectsVector.elementAt(index) instanceof Asteroid){
				Asteroid firstAsteroid = (Asteroid) gameObjectsVector.elementAt(index);
				for(int secondIndex = index+1; secondIndex < gameObjectsVector.size(); secondIndex++){
					if(gameObjectsVector.elementAt(secondIndex) instanceof Asteroid){
						//found 2 unique asteroids
						Asteroid secondAsteroid = (Asteroid) gameObjectsVector.elementAt(secondIndex);
						gameObjectsVector.remove(firstAsteroid);
						gameObjectsVector.remove(secondAsteroid);
						return;
					}
				}
			}
		}	
	}

	/**
	 * An asteroid whacked or collided with a flying saucer. If at least one flying saucer
	 * and one asteroid exist in the game world then remove both objects from the game
	 * world.
	 */
	public void asteroidWhackedFlyingSaucer() {
		// TODO Auto-generated method stub
		if(gameObjectsVector.contains(asteroid) &&
				gameObjectsVector.contains(flyingSaucer)){
			gameObjectsVector.remove(flyingSaucer);
			gameObjectsVector.remove(asteroid);
			
		}else{
			//do nothing
		}
		
	}

	/**
	 * The game clock has ticked and the time has incremented by one.
	 * All movable objects are told to update their positions according to 
	 * their current direction and speed. Every missile's fuel level is reduced
	 * by one and any missiles which are now out of fuel are removed from the 
	 * game. Each space station toggles its blinking light if the tick count modulo
	 *  the station's blink rate is zero.
	 */
	public void tick() {
		time++;
		for(int index = 0; index < gameObjectsVector.size(); index++){
			if(gameObjectsVector.elementAt(index) instanceof IMovable){
				IMovable mObj = (IMovable) gameObjectsVector.elementAt(index);
				mObj.move();
				if(mObj instanceof Missile){
					Missile missile = (Missile) gameObjectsVector.elementAt(index);
					if(missile.getFuelLevel() == 0){
						gameObjectsVector.remove(missile);
					}else{
						missile.decrementFuelLevel();
					}
				}
			}
		}
		if(gameObjectsVector.contains(spaceStation)){
			if(spaceStation.getBlinkRate() % time == 0){
				spaceStation.blink();
			}
		}
		
	}
	

	/**
	 * Prints a display giving the current game state values, including:
	 * current score, number of missiles currently in the ship, and current
	 * elapsed time.
	 */
	public void print() {
		System.out.println("\n\t\t\tGAMESTATE VALUES");
		System.out.println("----------------------------------------------------------------");
		System.out.println("\t\t\tCurrent Score = " + score);
		if(gameObjectsVector.contains(ship)){
			System.out.println("\t\t\tCurrent Ship missile count = " + shipMissileCount);
		}
		System.out.println("\t\t\tCurrent Time = " + time);
		System.out.println("----------------------------------------------------------------\n");
	}

	/**
	 * Prints a map showing the current world state.
	 * Calls toString methods for all GameObjects in the
	 * GameWorld.
	 */
	public void map() {
		System.out.println("\n\t\t\t\t\tGAMEWORLD MAP");
		System.out.println("----------------------------------------------------------"
				+ "------------------------------------------------------");
		for(int index = 0; index < gameObjectsVector.size(); index++){
			System.out.println(gameObjectsVector.elementAt(index).toString());
		}
		System.out.println("----------------------------------------------------------"
				+ "------------------------------------------------------\n");
	}

	/**
	 * Terminates the program.
	 */
	public void quit() {
		if(exitGame){
			System.out.println("Exiting the game!");
			System.exit(0);
		}else{
			setExitGame(true);
			System.out.println("Are you sure you want to exit?");
		}
		
	}

	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}

	public boolean isExitGame() {
		return exitGame;
	}

	public void setExitGame(boolean exitGame) {
		this.exitGame = exitGame;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
