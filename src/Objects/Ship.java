package Objects;
import java.util.Vector;

import Enum.ColorEnum;
import Interfaces.ISteerable;

/**
 * Ship is a movable object that extends Movable and Implements
 * ISteerable. The ship begins with a starting location in the middle
 * of the map. The speed is zero initially, and direction is North
 * initially. The max amount of missiles the ship can carry is what 
 * the initial amount of missiles on the ship are initialized to.
 * @author Blake
 *
 */
public class Ship extends Movable implements ISteerable{

	private int maxMissileCount = 12;
	private int missileCount;
	private int steerLeftDegrees = 10;
	private int steerRightDegrees = -10;
	/**
	 * 
	 */
	public Ship(){
		super();
		setX(512);
		setY(384);
		setSpeed(0);
		setDirection(90);
		setMissileCount(maxMissileCount);
		setColor(ColorEnum.AQUA.colorValue());
	}
	
	@Override
	public String toString(){
		String parentDesc = super.toString();
		String myString = parentDesc + ", missileCount=" + missileCount + " , "
				+ "maxMissileCount=" + maxMissileCount;
		return myString;
	}
	
	/**
	 * Decreases the speed of the ship by 1.
	 */
	public void decreasSpeed(){
		setSpeed(getSpeed()-1);
	}
	
	/**
	 * Decreases the missileCount of a ship by one 
	 * if the missileCount is greater than zero.
	 */
	public void decreaseMissiles(){
		if(missileCount > 0){
			missileCount--;
		}
	}

	/**
	 * 
	 * @return missileCount
	 * 		The amount of missiles on the ship.
	 */
	public int getMissileCount() {
		return missileCount;
	}

	/**
	 * Sets the missileCount of the ship.
	 * @param missileCount
	 * 		The amount of missiles on the ship.
	 */
	public void setMissileCount(int missileCount) {
		this.missileCount = missileCount;
	}
	
	/**
	 * 
	 * @return maxMissileCount
	 * 		Max capacity of missiles that a ship can carry.
	 */
	public int getMaxMissileCount(){
		return maxMissileCount;
	}

	/**
	 * Turns the ship to the left by steerLeftDegrees.
	 */
	public void steerLeft() {
		this.setDirection(getDirection() + steerLeftDegrees);
		
	}

	/**
	 * Turns the ship to the right by steerRightDegrees.
	 */
	public void steerRight() {
		this.setDirection(getDirection() + steerRightDegrees);
	}
}
