package Objects;
/**
 * 
 * @author Blake
 *
 */
public class Ship extends Movable{

	private int missileCount;
	
	/**
	 * 
	 */
	public Ship(){
		super();
		setX(512);
		setY(384);
		setSpeed(0);
		setDirection(90);
		setMissileCount(12);
	}
	
	/**
	 * Decreases the missileCount of a ship by one 
	 * if the missileCount is greater than zero.
	 */
	public void decreaseMissiles(){
		if(missileCount > 0){
			missileCount--;
		}
	}

	/**
	 * 
	 * @return
	 */
	public int getMissileCount() {
		return missileCount;
	}

	/**
	 * 
	 * @param missileCount
	 */
	public void setMissileCount(int missileCount) {
		this.missileCount = missileCount;
	}
}
