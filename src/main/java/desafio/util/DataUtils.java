package desafio.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtils {

	public static String dataAtual() {
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String dataAtual = formatter.format(new Date());
		return dataAtual;
	}

}
