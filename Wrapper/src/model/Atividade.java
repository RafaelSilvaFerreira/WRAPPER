package model;

public class Atividade {
    private String assunto;
    private int paginas;

    public Atividade(String assunto, int paginas) {
        this.assunto = assunto;
        this.paginas = paginas;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public double getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
}