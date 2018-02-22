package Objects;

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
		//TODO
	}
	
	
	
}
