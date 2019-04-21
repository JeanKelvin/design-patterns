package observer;

import builder.ItemDaNota;
import builder.NotaFiscal;

public class TesteAcoes {

    public static void main(String[] args) {
        NotaFiscalBuilder builder = new NotaFiscalBuilder();
        builder.adicionaAcao(new EnviadorDeEmail());
        builder.adicionaAcao(new NotaFiscalDao());
        builder.adicionaAcao(new EnviadorDeSms());
        builder.adicionaAcao(new Impressora());

        NotaFiscal nf = builder.paraEmpresa("Teste LTDA")
                .comCnpj("12.123.123/0001-12")
                .comItem(new ItemDaNota("item 1", 200.0))
                .comObservacoes("obs")
                .naDataAtual()
                .constroi();

        System.out.println(nf.getValorBruto());
    }
}
