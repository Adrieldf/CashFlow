package utils;

import java.text.DecimalFormat;

public class MathConverter {

	
	public static Double StringToDouble(String value) {
		
		value = value.replace(',', '.');
		
		return Double.parseDouble(value);
	}
	
	public static String DoubleToString(Double value) {
		return new DecimalFormat("#.##").format(value);
	}
}
