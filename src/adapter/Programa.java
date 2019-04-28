package adapter;

import java.util.Calendar;

public class Programa {

    public static void main(String[] args) {

        Relogio relogio = new RelogioDoSistema();
        Calendar dataAtual = relogio.hoje();

        System.out.println(dataAtual.getTime());
    }
}
