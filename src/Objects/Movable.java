package Objects;

import com.codename1.ui.geom.Point2D;

import Enum.DirectionEnum;
import Enum.SpeedEnum;
import Interfaces.IMovable;

/**
 * Movable Objects have speed and direction
 * @author Blake
 *
 */
public abstract class Movable extends GameObject implements IMovable{

	/*---------------------------------DATA------------------------------*/
	private int speed;
	private int direction;
	
	/*-------------------------------CONSTRUCTOR-------------------------*/
	public Movable(){	
		this.speed = getRandom().nextInt(SpeedEnum.MAXIMUM_SPEED.speed);
		this.direction = getRandom().nextInt(DirectionEnum.MAXIMUM_DEGREES.degrees);
	}
	
	/*--------------------------------METHODS----------------------------*/
	
	/**
	 * General move for all movable objects.
	 */
	public void move(){
		Point2D oldLocation = getLocation();
		double deltaX = Math.cos(Math.toRadians(direction)) * speed;
		double deltaY = Math.sin(Math.toRadians(direction)) * speed;
		Point2D newLocation = new Point2D(oldLocation.getX() + deltaX, oldLocation.getY() + deltaY);
		setLocation(newLocation);		
	}
	
	@Override
	public String toString(){
		String parentDesc = super.toString();
		String myString = parentDesc + ", speed=" + speed + ", direction=" + direction;
		return myString;
	}
	
	/*---------------------------GETTERS AND SETTERS----------------------*/
	/**
	 * Gets the speed of the object.
	 * @return speed
	 * 		The speed of the object.
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * Sets the speed of the object in the range 0-10.
	 * @param speed
	 * 		The speed of the object.
	 */
	public void setSpeed(int speed) {
		if(speed <= 10 && speed >= 0){
			this.speed = speed;
		}
	}

	/**
	 * Gets the heading of the object
	 * @return direciton
	 * 		The heading of the object.
	 */
	public int getDirection() {
		return direction;
	}

	/**
	 * Sets the heading or direction of the object 0-359.
	 * Values are degrees and 90 is considered North.
	 * @param direction
	 * 		The direction of the object.
	 */
	public void setDirection(int direction) {
		if(direction > 359){
			direction = direction-360;
		}else if(direction < 0){
			direction = 360 + direction;
		}
		this.direction = direction;
	}
}
