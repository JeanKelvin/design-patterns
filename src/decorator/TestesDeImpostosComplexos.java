package decorator;

public class TestesDeImpostosComplexos {

    public static void main(String[] args) {

        Imposto iss = new ISS(new ICMS(new ICPP()));

        Orcamento orcamento = new Orcamento(500.0);

        double valor = iss.calcula(orcamento);

        System.out.println(valor);
    }
}
