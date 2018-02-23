package Enum;
/**
 * 
 * @author Blake
 *
 */
public enum DefaultDoubleValueEnum {
	
	DEFAULT_VALUE(-1.0);
	
	public final double value;
	
	/**
	 * 
	 * @param value
	 */
	DefaultDoubleValueEnum(double value){
		this.value = value;
	}
	
	/**
	 * 
	 * @return
	 */
	public double value(){
		return value;
	}
	
}
