package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter {

	public static Date StringToDate(String value) {
		try {
			String[] split = value.split("/");
			int day = Integer.parseInt(split[0]);
			int month = Integer.parseInt(split[1]);
			int year = Integer.parseInt(split[2]);

			return new SimpleDateFormat("dd/MM/yyyy")
					.parse((day < 10 ? "0" + day : day) + "/" + (month < 10 ? "0" + month : month) + "/" + year);
		} catch (ParseException e) {
			return null;
		}
	}
}
