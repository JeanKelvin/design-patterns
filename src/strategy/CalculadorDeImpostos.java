package strategy;

public class CalculadorDeImpostos {

    public void realizaCalculo(Orcamento orcamento, Imposto impostoQualquer) {

        double valor = impostoQualquer.calcula(orcamento);
        System.out.println(valor);
    }
}
