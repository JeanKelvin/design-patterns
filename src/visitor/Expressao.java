package visitor;

public interface Expressao {

    int avalia();

    void aceita(Visitor impressora);

    
}
