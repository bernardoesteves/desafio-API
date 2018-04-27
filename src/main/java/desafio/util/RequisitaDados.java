package desafio.util;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RequisitaDados {

	private static final String URL = "https://www.alphavantage.co/query?apikey=demo&function=TIME_SERIES_DAILY_ADJUSTED&symbol=MSFT";

	private static final Logger LOG = LoggerFactory.getLogger(RequisitaDados.class);

	public static String retornaDados() throws IOException {
		Reader reader = null;
		try {
			reader = new InputStreamReader(new URL(URL).openStream());
			return IOUtils.toString(reader);
		} catch (IOException e) {
			LOG.error(DataUtils.dataAtual() + " Ocorreu um erro ao tentar ler os dados da URL.", e);
			return null;
		} finally {
			if (reader != null) {
				reader.close();
			}
		}
	}
}
