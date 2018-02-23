package Objects;
/**
 * 
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
		super();
		this.setId(uniqueId);
		uniqueId++;
		
	}
	
	@Override
	public String toString(){
		String parentStr = super.toString();
		String myString = parentStr + " , " +  id;
		return myString;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
