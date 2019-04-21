package observer;

import builder.NotaFiscal;

public class NotaFiscalDao implements AcaoAposGerarNota{

    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("salvei no banco.");
    }
}
