package view;

import controller.ControleAtividade;
import controller.ControleProva;
import model.Atividade;
import model.Prova;

public class Main {
    public static void main(String[] args) {
        ControleProva controleProva = new ControleProva();
        controleProva.cadastrarAvaliacao(new Prova(10));
        
        ControleAtividade controleAtiv = new ControleAtividade();
        controleAtiv.cadastrarAvaliacao(new Atividade("nulo", 0));

    }
}