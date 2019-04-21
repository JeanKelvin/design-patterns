package observer;

import builder.NotaFiscal;

public class EnviadorDeEmail implements AcaoAposGerarNota {

    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("enviei email.");
    }
}
