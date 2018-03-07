package Enum;
/**
 * DirectionEnum
 * 		has the maximum and minimum direction in degrees.
 * @author Blake
 *
 */
public enum DirectionEnum {
	
	MAXIMUM_DEGREES(359),
	MINUMUM_DEGREES(0);
	
	public final Integer degrees;
	
	/**
	 * Sets the degree values for the enumerations above.
	 * @param degrees
	 * 		is the degree value of an objects direction.
	 */
	DirectionEnum(Integer degrees){
		this.degrees = degrees;
	}
	
	/**
	 * Gets the degrees.
	 * @return
	 * 		the degrees of the enumeration.
	 */
	public Integer getDegrees(){
		return degrees;
	}

}
