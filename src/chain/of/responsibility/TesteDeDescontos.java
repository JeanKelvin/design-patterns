package chain.of.responsibility;

public class TesteDeDescontos {

    public static void main(String ...args) {
        CalculadorDeDescontos calculador = new CalculadorDeDescontos();

        Orcamento orcamento = new Orcamento(600.0);
        orcamento.adicionaItem(new Item("CANETA", 250.0));
        orcamento.adicionaItem(new Item("LAPIS", 250.0));

        double descontoFinal = calculador.calcula(orcamento);

        System.out.println(String.format("%.2f", descontoFinal));
    }
}
