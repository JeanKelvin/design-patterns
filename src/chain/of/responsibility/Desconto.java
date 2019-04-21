package chain.of.responsibility;

public interface Desconto {

    double desconta(Orcamento orcamento);
    void setProximo(Desconto proximo);
}
