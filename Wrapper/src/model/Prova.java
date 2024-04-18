package model;

import java.util.Random;

public class Prova {
    private int questoes;
    private double media;

    public Prova(int numeroQuestoes) {
        this.questoes = numeroQuestoes;
        Random rand = new Random();
        double nota = rand.nextDouble() * 10.0;
        this.media = nota;
        
    }
    
    public int getQuestoes() {
        return questoes;
    }

    public void setQuestoes(int questoes) {
        this.questoes = questoes;
    }

    public double getMediaNotas() {
    	 return media;
    }

    public void setMediaNotas(double media) {
        this.media = media;
    }
}
