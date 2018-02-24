package Objects;
import Enum.BlinkRateEnum;
import Enum.ColorEnum;
/**
 * SpaceStation is a fixedObject that has its own attributes that allow to blink
 * by turning it lights off and on.
 * @author Blake
 *
 */
public class SpaceStation extends FixedObject{

	private int blinkRate;
	private boolean lightsOn;
	/**
	 * Creates a new spaceStation with a random blinkrate 0-5 and color of Gold.
	 */
	public SpaceStation(){
		setBlinkRate(getRandom().nextInt(BlinkRateEnum.MAX_BLINK_RATE.blinkRate()+1));
		setColor(ColorEnum.GOLD.colorValue());
	}
	
	@Override
	public String toString(){
		String parentStr = super.toString();
		String myString = parentStr + " , blinkRate=" + blinkRate + " , lightsOn=" + lightsOn;
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

	/**
	 * Blinks spaceStations lights on or off.
	 */
	public void blink(){
		if(isLightsOn()){
			setColor(ColorEnum.WHITE.colorValue());
			setLightsOn(false);
		}else{
			setColor(ColorEnum.GOLD.colorValue());
			setLightsOn(true);
		}
	}
	
	/**
	 * Gets the flag lightsOn.
	 * @return lightsOn
	 * 		Determines whether lights are on or off.
	 */
	public boolean isLightsOn() {
		return lightsOn;
	}

	/**
	 * Sets the lights flag to on or off.
	 * @param lightsOn
	 * 		
	 */
	public void setLightsOn(boolean lightsOn) {
		this.lightsOn = lightsOn;
	}
}