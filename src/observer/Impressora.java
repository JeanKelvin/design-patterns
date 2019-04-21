package observer;

import builder.NotaFiscal;

public class Impressora implements AcaoAposGerarNota {

    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("nota impressa");
    }
}
