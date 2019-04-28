package memento;

import java.util.Date;

public class Programa {

    public static void main(String[] args) {

        Historico historico = new Historico();

        Contrato contrato = new Contrato(new Date(), "Jean", TipoContrato.NOVO);
        historico.adiciona(contrato.salvaEstado());

        contrato.avanca();
        historico.adiciona(contrato.salvaEstado());

        contrato.avanca();
        historico.adiciona(contrato.salvaEstado());

        contrato.avanca();
        historico.adiciona(contrato.salvaEstado());

        contrato.restaura(historico.pega(0));
        System.out.println(contrato.getTipo());
    }
}
