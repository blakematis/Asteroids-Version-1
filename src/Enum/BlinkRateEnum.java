package Enum;
/**
 * 
 * @author Blake
 *
 */
public enum BlinkRateEnum {

	MAX_BLINK_RATE(5),
	MIN_BLINK_RATE(0);
	
	public final int blinkRate;
	
	/**
	 * 
	 * @param blinkRate
	 */
	BlinkRateEnum(int blinkRate){
		this.blinkRate = blinkRate;
	}
	
	/**
	 * 
	 * @return
	 */
	public int blinkRate(){
		return blinkRate;
	}
}
