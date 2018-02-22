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
	
	public Movable(){
		super();
		this.speed = getRandom().nextInt(SpeedEnum.MAXIMUM_SPEED.speed);
		this.direction = getRandom().nextInt(DirectionEnum.MAXIMUM_DEGREES.degrees);
	}
	
	/**
	 * 
	 */
	public void move(){
		Point2D oldLocation = getLocation();
		double deltaX = Math.toRadians(Math.cos(direction)) * speed;
		double deltaY = Math.toRadians(Math.sin(direction)) * speed;
		Point2D newLocation = new Point2D(oldLocation.getX() + deltaX, oldLocation.getY() + deltaY);
		setLocation(newLocation);		
	}
	
	@Override
	public String toString(){
		String parentDesc = super.toString();
		String myString = parentDesc + ", speed=" + speed + ", direction=" + direction;
		return myString;
	}
	
	
	
	
	
}
