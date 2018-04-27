package desafio.dados;

import java.util.ArrayList;
import java.util.List;

public class DadosMemoria {
	private static DadosMemoria dadosMemoria;
	private String dadoAtual;
	private List<String> dados;

	public DadosMemoria() {
		dados = new ArrayList<String>();
	}

	public static DadosMemoria instancia() {
		if (dadosMemoria == null) {
			dadosMemoria = new DadosMemoria();
		}
		return dadosMemoria;
	}

	public List<String> getDados() {
		return dados;
	}

	public void atualizar(String dadoAtual) {
		this.dadoAtual = dadoAtual;
		dados.add(dadoAtual);
	}

	public String getDadoAtual() {
		return dadoAtual;
	}
}
