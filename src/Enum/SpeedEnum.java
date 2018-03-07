package Enum;
/**
 * SpeedEnum
 * 		Enumeration of Max integer speed and Minimum integer speed.
 * @author Blake
 *
 */
public enum SpeedEnum {
	
	MAXIMUM_SPEED(10),
	MINIMUM_SPEED(0);
	
	public final Integer speed;
	
	/**
	 * Constructs the enumerations listed above with their given
	 * value.
	 * @param speed
	 * 		is an integer value.
	 */
	SpeedEnum(Integer speed){
		this.speed = speed;
	}
	
	/**
	 * Gets the speed for the enumeration.
	 * @return speed
	 */
	public Integer getSpeed(){
		return speed;
	}
	
}
