package controller;

import java.util.ArrayList;
import java.util.List;

import model.Atividade;
import view.Avaliacao;

public class ControleAtividade implements Avaliacao<Atividade> {
    private List<Atividade> atividades;

    public ControleAtividade() {
        this.atividades = new ArrayList<>();
    }

	@Override
    public void cadastrarAvaliacao(Atividade a) {
        this.atividades.add(a);
    }

    @Override
    public Atividade consultarAvaliacao(int posicao) {
        return this.atividades.get(posicao);
    }

    @Override
    public void limparLista() {
        this.atividades.clear();
		
	}

}