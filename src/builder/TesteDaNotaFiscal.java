package builder;

public class TesteDaNotaFiscal {

    public static void main(String ...args) {

        NotaFiscalBuilder builder = new NotaFiscalBuilder();
        builder.paraEmpresa("Teste LTDA")
                .comCnpj("11.122.123/0001-12")
                .comItem(new ItemDaNota("item 1", 200.0))
                .comItem(new ItemDaNota("item 2", 300.0))
                .comObservacoes("observações")
                .naDataAtual();

        NotaFiscal notaFiscal = builder.constroi();
        System.out.println(notaFiscal);
    }
}
