package Objects;

import Enum.ColorEnum;
import Enum.SizeEnum;

/**
 * 
 * @author Blake
 *
 */
public class Asteroid extends Movable{
	
	/*--------------------------------DATA----------------------------*/
	private int size;
	
	/*-----------------------------CONSTRUCTOR------------------------*/
	public Asteroid(){
		size = getRandom().nextInt(SizeEnum.ASTEROID_MAX_SIZE.size() + 1)
				+ SizeEnum.ASTEROID_MIN_SIZE.size();
		setColor(ColorEnum.BLACK.colorValue());
	}
	
	/*-------------------------------METHODS--------------------------*/
	
	@Override
	public String toString(){
		String parentDesc = super.toString();
		String myString = parentDesc + ", size=" + size;
		return myString;
	}

	/*-------------------------GETTERS AND SETTERS--------------------*/
	
	/**
	 * 
	 * @return
	 */
	public int getSize() {
		return size;
	}

}
