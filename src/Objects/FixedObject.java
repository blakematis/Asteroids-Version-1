package Objects;

import com.codename1.ui.geom.Point2D;

import Enum.DefaultDoubleValueEnum;

/**
 * FixedObject extends from the GameObject and is also an abstract class.
 * This class is has uniqueId numbers for each instance created, and is 
 * @author Blake
 *
 */
public abstract class FixedObject extends GameObject {
	
	private static int uniqueId = 1;
	private int id;
	
	/**
	 * 
	 */
	public FixedObject(){
		id = uniqueId;
		uniqueId++;
	}
	
	@Override
	public String toString(){
		String parentStr = super.toString();
		String myString = parentStr + " , id=" +  id;
		return myString;
	}

	/**
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}
	
	@Override
	public void setX(double x){
		if(super.getX() == DefaultDoubleValueEnum.DEFAULT_VALUE.value()){
			super.setX(x);
		}
	}
	
	@Override
	public void setY(double y){
		if(super.getY() == DefaultDoubleValueEnum.DEFAULT_VALUE.value()){
			super.setY(y);
		}
	}
	
	@Override
	public void setLocation(Point2D location){
		if(this.getLocation() != null){
			super.setLocation(location);
		}
	}
	
}
