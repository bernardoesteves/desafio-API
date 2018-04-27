package desafio.worker;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import desafio.dados.DadosMemoria;
import desafio.util.DataUtils;
import desafio.util.RequisitaDados;

public class Worker extends Thread {

	private static final int MINUTOS = 10;
	private static final int SEGUNDOS = 60;
	private static final int MILISSEGUNDOS = 1000;
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	@Override
	public void run() {
		DadosMemoria dadosMemoria = DadosMemoria.instancia();
		while (true) {
			try {
				String dados = RequisitaDados.retornaDados();
				if (dados != null) {
					LOG.info("Dados atualizados em " + DataUtils.dataAtual());
					dadosMemoria.atualizar(dados);
				}
				Thread.sleep(MINUTOS * SEGUNDOS * MILISSEGUNDOS);
			} catch (InterruptedException | IOException e) {
				LOG.error("Erro ao atualizar os dados", e); 
			}
		}
	}
}
