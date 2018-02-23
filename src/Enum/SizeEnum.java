package Enum;
/**
 * 
 * @author Blake
 *
 */
public enum SizeEnum {

	ASTEROID_MAX_SIZE(30),
	ASTEROID_MIN_SIZE(6),
	FLYING_SAUCER_SMALL(10),
	FLYING_SAUCER_LARGE(20);
	
	
	public final int size;
	
	/**
	 * 
	 * @param size
	 */
	SizeEnum(int size){
		this.size = size;
	}
	
	/**
	 * 
	 * @return
	 */
	public int size(){
		return size;
	}
	
}
