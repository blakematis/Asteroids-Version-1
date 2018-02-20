package Objects;

public abstract class FixedObject extends GameObject {

	/**
	 * 
	 */
	public FixedObject(double x, double y, int color){
		super(x, y, color);
	}
	
	@Override
	public String toString(){
		String parentStr = super.toString();
		String myString = parentStr;
		return myString;
	}
	
}
