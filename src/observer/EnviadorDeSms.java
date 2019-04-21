package observer;

import builder.NotaFiscal;

public class EnviadorDeSms implements AcaoAposGerarNota {

    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("enviei sms.");
    }
}
