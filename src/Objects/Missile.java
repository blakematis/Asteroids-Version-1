package Objects;

import com.codename1.ui.geom.Point2D;

import Enum.ColorEnum;


/**
 * 
 * @author Blake
 *
 */
public class Missile extends Movable{

	private int maxFuelLevel = 10;
	private int fuelLevel;
	
	public Missile(Point2D location,int direction, int speed) {
		super();
		setLocation(location);
		setDirection(direction);
		setSpeed(speed + 10);
		setFuelLevel(maxFuelLevel);
		setColor(ColorEnum.INDIGO.colorValue());
	}
	
	public void decrementFuelLevel(){
		if(fuelLevel > 0){
			fuelLevel--;
		}
	}

	public int getFuelLevel() {
		return fuelLevel;
	}

	public void setFuelLevel(int fuelLevel) {
		if(fuelLevel <= 10 && fuelLevel >= 0){
			this.fuelLevel = fuelLevel;
		}
	}
	
}
