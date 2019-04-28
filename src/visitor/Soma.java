package visitor;

public class Soma implements Expressao {


    private Expressao esquerda;
    private Expressao direita;

    public Soma(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int avalia() {
        int valorDaEsquerda = esquerda.avalia();
        int valorDaDireita = direita.avalia();

        return valorDaEsquerda + valorDaDireita;
    }

    @Override
    public void aceita(Visitor impressora) {
        impressora.visitaSoma(this);
    }

    public Expressao getEsquerda() {
        return esquerda;
    }

    public Expressao getDireita() {
        return direita;
    }
}
