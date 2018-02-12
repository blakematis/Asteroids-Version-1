package Enum;
/**
 * CartesianCoordinateEnum
 * 		Enumeration that sets values for the maximum and minimum Cartesian
 * 		Coordinates in the Asteroid game.
 * @author Blake Matis
 *
 */
public enum CartesianCoordinateEnum {
	
	MINIMUM_X_VALUE(0.0),
	MAXIMUM_X_VALUE(1024.0),
	MINIMUM_Y_VALUE(0.0),
	MAXIMUM_Y_VALUE(768.0);
	
	private final Double coordinate;
	
	/**
	 * Constructs the enumerations listed above with their given values.
	 * @param coordinate
	 * 		Cartesian coordinate value.
	 */
	CartesianCoordinateEnum(Double coordinate){
		this.coordinate = coordinate;
	}
	
	/**
	 * 
	 * @return coordinate
	 * 		the double value of the enumeration.
	 */
	public double coordinate(){ return coordinate; }

}
