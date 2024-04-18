package view;

public interface Avaliacao<T> {
    void cadastrarAvaliacao(T avaliacao);
    void limparLista();
    T consultarAvaliacao(int posicao);
}