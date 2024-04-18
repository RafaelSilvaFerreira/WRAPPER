package controller;

import java.util.ArrayList;
import java.util.List;

import model.Prova;
import view.Avaliacao;
public class ControleProva implements Avaliacao<Prova> {
    private List<Prova> provas;

    public ControleProva() {
        this.provas = new ArrayList<>();
    }

    @Override
    public void cadastrarAvaliacao(Prova p) {
        this.provas.add(p);
    }

    @Override
    public Prova consultarAvaliacao(int posicao) {
        return this.provas.get(posicao);
    }

    @Override
    public void limparLista() {
        this.provas.clear();
    }
}