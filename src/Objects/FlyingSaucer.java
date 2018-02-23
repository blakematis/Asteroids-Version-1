package Objects;

import Enum.ColorEnum;
import Enum.SizeEnum;

public class FlyingSaucer extends Movable{

	private int size;
	
	public FlyingSaucer() {
		this.size = getRandom().nextInt(SizeEnum.FLYING_SAUCER_LARGE.size() + 1)
				+ SizeEnum.FLYING_SAUCER_SMALL.size();
		setColor(ColorEnum.RED.colorValue());
	}
	
	/*-------------------------------METHODS--------------------------*/
	
	@Override
	public String toString(){
		String parentDesc = super.toString();
		String myString = parentDesc + ", size=" + size;
		return myString;
	}

	public int getSize() {
		return size;
	}

}
