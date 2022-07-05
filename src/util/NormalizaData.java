package util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NormalizaData {
	static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public static String formata (LocalDate data) {
		return data.format(formatter);
	}
}
