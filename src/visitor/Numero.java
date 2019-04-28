package visitor;

public class Numero implements Expressao {

    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public int avalia() {
        return this.numero;
    }

    @Override
    public void aceita(Visitor impressora) {
        impressora.visitaNumero(this);
    }
}
