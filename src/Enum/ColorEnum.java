package Enum;
/**
 * ColorEnum for specific color values and maximum values.
 * @author Blake
 *
 */
public enum ColorEnum {
	
	WHITE(0xffffff),
	BLACK(0x000000),
	BLUE(0x0000ff),
	RED(0xff0000),
	GRAY(0x7a7a7a),
	AQUA(0x00ffff),
	GOLD(0xffd700),
	INDIGO(0x4b0082);
	
	public final int color;
	
	ColorEnum(int color){
		this.color = color;
	}
	
	public int colorValue(){
		return color;
	}

}
