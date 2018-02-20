package Objects;

import com.codename1.charts.util.ColorUtil;
import com.codename1.ui.geom.Point2D;
import Enum.CartesianCoordinateEnum;;

/**
 * GameObject
 * 		Abstract class that provides a basis for further gameObject
 * 		implementation. GameObjects include a location(x,y) and 
 * 		a color.
 * 		
 * @author Blake Matis
 * 
 */
public abstract class GameObject {
	
	/*---------------------------------------DATA---------------------------------------*/
	
	private double x;		// X-Cartesian coordinate
	private double y;		// Y-Cartesian coordinate
	private int color;		// RGB Integer color value
	private Point2D location; // Location of the GameObject X, Y Cartesian coordinates
	
	/*-----------------------------------CONSTRUCTORS-----------------------------------*/
	
	/**
	 * Default Constructor
	 */
	public GameObject(){
		
	}

	/**
	 * Constructor with location and color.
	 * @param x
	 * 		is the Double x-Cartesian coordinate.
	 * @param y
	 * 		is the Double y-Cartesian coordinate.
	 * @param color
	 * 		is the Integer rgb value of color.
	 */
	public GameObject(double x, double y, int color){
		this.x = x;
		this.y = y;
		this.color = color;
		this.location = new Point2D(x,y);
	}
	
	/*--------------------------------------METHODS-------------------------------------*/
	
	@SuppressWarnings("deprecation")
	@Override
	/**
	 * Prints the ObjectName and basic attribute information.
	 */
	public String toString(){
		String myString = null;
		try{
			myString = getClassName(getClass().getName()) + ": loc=" + location.getX() +
				", " + location.getY() + " color=[" + ColorUtil.red(color) + "," +
				ColorUtil.green(color) + "," + ColorUtil.blue(color) + "]";
		} catch(NullPointerException e){
			return e.getMessage();
		}
		return myString;
		
	}
	
	public String getClassName(String packageAndClassName){
		StringBuffer sb = new StringBuffer();
		sb.append(packageAndClassName);
		int index = 0;
		for(index = 0; index< sb.length(); index++){
			if(sb.charAt(index) == '.'){
				break;
			}
		}
		sb.delete(0, index+1);
		
		return sb.toString();
	}
	
	/*--------------------------------GETTERS AND SETTERS-------------------------------*/
	
	/**
	 * Gets the x-Cartesian coordinate of this GameObject
	 * @return x
	 * 		is the Double x-Cartesian coordinate
	 */
	public double getX() {
		return x;
	}
	
	/**
	 * Sets the x-Cartesian coordinate of this GameObject
	 * @param x
	 * 		is the Double x-Cartesian coordinate
	 */
	public void setX(double x) {
		try{
			if(x >= CartesianCoordinateEnum.MINIMUM_X_VALUE.coordinate() &&
					x <= CartesianCoordinateEnum.MAXIMUM_X_VALUE.coordinate()){
				this.x = x;
			}else{
				throw new Exception("X-Cartesian Coordinate is outside of maximum or minimum range");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/**
	 * Gets the y-Cartesian coordinate of this GameObject
	 * @return x
	 * 		is the Double y-Cartesian coordinate
	 */
	public double getY() {
		return y;
	}
	
	/**
	 * Sets the y-Cartesian coordinate of this GameObject
	 * @param y
	 * 		is the Double y-Cartesian coordinate
	 */
	public void setY(double y) {
		this.y = y;
	}
	
	/**
	 * Gets the color of the GameObject
	 * @return color
	 * 		is the Integer rgb value for color.
	 * 
	 */
	public int getColor() {
		return color;
	}

	/**
	 * Sets the color of the GameObject
	 * @param color
	 * 		is the Integer rgb value for color
	 */
	public void setColor(int color) {
		this.color = color;
	}

	/**
	 * 
	 * @return
	 */
	public Point2D getLocation() {
		return location;
	}

	public void setLocation(Point2D location) {
		this.location = location;
	}
	
	

}
