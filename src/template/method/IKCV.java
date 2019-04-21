package template.method;


public class IKCV extends TemplateDeImpostoCondicional {

    @Override
    public double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

    @Override
    public double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.10;
    }

    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento);
    }

    private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
        return orcamento.getItens().stream().anyMatch(item -> item.getValor() > 100);
    }
}
