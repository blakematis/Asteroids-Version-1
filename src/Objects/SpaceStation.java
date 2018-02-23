package Objects;
import Enum.BlinkRateEnum;
import Enum.ColorEnum;
/**
 * 
 * @author Blake
 *
 */
public class SpaceStation extends FixedObject{

	private int blinkRate;
	/**
	 * 
	 */
	public SpaceStation(){
		setBlinkRate(getRandom().nextInt(BlinkRateEnum.MAX_BLINK_RATE.blinkRate()+1));
		setColor(ColorEnum.GOLD.colorValue());
	}
	
	@Override
	public String toString(){
		String parentStr = super.toString();
		String myString = parentStr + " , blinkRate=" + blinkRate;
		return myString;
	}

	/**
	 * 
	 * @return
	 */
	public int getBlinkRate() {
		return blinkRate;
	}

	/**
	 * 
	 * @param blinkRate
	 */
	public void setBlinkRate(int blinkRate) {
		if(blinkRate >= BlinkRateEnum.MIN_BLINK_RATE.blinkRate() || 
				blinkRate <= BlinkRateEnum.MAX_BLINK_RATE.blinkRate()){
			this.blinkRate = blinkRate;
		}
	}
}