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
	 * 
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
	 * 
	 * @return
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * 
	 * @param speed
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	/**
	 * 
	 * @return
	 */
	public int getDirection() {
		return direction;
	}

	/**
	 * 
	 * @param direction
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
