package template.method;

import chain.of.responsibility.Item;

public class TesteDeImpostos {

    public static void main(String[] args) {

        Imposto icpp = new ICPP();
        Imposto ikcv = new IKCV();

        Orcamento orcamentoICPP = new Orcamento(600.0);
        double taxacaoICPP = icpp.calcula(orcamentoICPP);

        System.out.println(String.format("%.2f", taxacaoICPP));

        Orcamento orcamentoIKCV = new Orcamento(600.0);
        orcamentoIKCV.adicionaItem(new Item("BOLSA", 110.0));
        double taxacaoIKCV = ikcv.calcula(orcamentoIKCV);

        System.out.println(String.format("%.2f", taxacaoIKCV));
    }
}


