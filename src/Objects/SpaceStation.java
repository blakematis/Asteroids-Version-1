package Objects;

public class SpaceStation extends FixedObject{

	public SpaceStation(double x, double y, int color){
		super(x, y, color);
	}
	
	@Override
	public String toString(){
		String parentStr = super.toString();
		String myString = parentStr;
		return myString;
	}
}