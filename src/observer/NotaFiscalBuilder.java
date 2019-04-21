package observer;

import builder.ItemDaNota;
import builder.NotaFiscal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NotaFiscalBuilder {

    private String razaoSocial;
    private String cnpj;
    private List<ItemDaNota> todosItens = new ArrayList<>();
    private double valorBruto;
    private double impostos;
    private String observacoes;
    private Date data;
    private List<AcaoAposGerarNota> todasAcoesASeremExecutadas;

    public NotaFiscalBuilder() {
        this.todasAcoesASeremExecutadas = new ArrayList<>();
    }

    public void adicionaAcao(AcaoAposGerarNota acao) {
        this.todasAcoesASeremExecutadas.add(acao);
    }

    public NotaFiscal constroi() {
        NotaFiscal nf =  new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosItens, observacoes);

        for (AcaoAposGerarNota acao : todasAcoesASeremExecutadas) {
            acao.executa(nf);
        }
        return nf;
    }

    public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
        this.razaoSocial = razaoSocial;
        return this;
    }

    public NotaFiscalBuilder comCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public NotaFiscalBuilder comItem(ItemDaNota item) {
        todosItens.add(item);
        valorBruto += item.getValor();
        impostos += item.getValor() * 0.05;
        return this;
    }

    public NotaFiscalBuilder comObservacoes(String observacoes) {
        this.observacoes = observacoes;
        return this;
    }
    
    public NotaFiscalBuilder naDataAtual() {
        this.data = new Date();
        return this;
    }
}
