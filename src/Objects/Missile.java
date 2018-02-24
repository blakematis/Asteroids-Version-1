package Objects;

import com.codename1.ui.geom.Point2D;

import Enum.ColorEnum;


/**
 * Missile is a Movable object with direction speed and also adds
 * a fuel level and max fuel level.
 * @author Blake
 *
 */
public class Missile extends Movable{

	private int maxFuelLevel = 10;
	private int fuelLevel;
	
	/**
	 * Creates a new missile with the given parameters.
	 * @param location
	 * 		Cartesian X, Y coordinate location
	 * @param direction
	 * 		Degrees or heading of the missile.
	 * @param speed
	 * 		Velocity of the missile.
	 */
	public Missile(Point2D location,int direction, int speed) {
		super();
		setLocation(location);
		setDirection(direction);
		setSpeed(speed + 10);
		setFuelLevel(maxFuelLevel);
		setColor(ColorEnum.INDIGO.colorValue());
	}
	
	/**
	 * Decreases the missiles Fuel Level by one.
	 */
	public void decrementFuelLevel(){
		if(fuelLevel > 0){
			fuelLevel--;
		}
	}
	
	
	/**
	 * Gets the current missile fuel level.
	 * @return fuelLevel
	 * 		The missiles fuel level.
	 */
	public int getFuelLevel() {
		return fuelLevel;
	}

	/**
	 * Sets the missiles fuel level between 0-10.
	 * @param fuelLevel
	 * 		The missiles fuel level.
	 */
	public void setFuelLevel(int fuelLevel) {
		if(fuelLevel <= 10 && fuelLevel >= 0){
			this.fuelLevel = fuelLevel;
		}
	}
	
}
