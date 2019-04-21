package builder;

import java.util.Date;
import java.util.List;

public class NotaFiscal {

    private String razaoSocial;
    private String cnpj;
    private Date dataDeEmissao;
    private double valorBruto;
    private double impostos;
    public List<ItemDaNota> itens;
    public String observacoes;

    public NotaFiscal(String razaoSocial, String cnpj, Date dataDeEmissao, double valorBruto, double impostos, List<ItemDaNota> itens, String observacoes) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.dataDeEmissao = dataDeEmissao;
        this.valorBruto = valorBruto;
        this.impostos = impostos;
        this.itens = itens;
        this.observacoes = observacoes;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Date getDataDeEmissao() {
        return dataDeEmissao;
    }

    public double getValorBruto() {
        return valorBruto;
    }

    public double getImpostos() {
        return impostos;
    }

    public List<ItemDaNota> getItens() {
        return itens;
    }

    public String getObservacoes() {
        return observacoes;
    }

    @Override
    public String toString() {
        return "NotaFiscal{" +
                "razaoSocial='" + razaoSocial + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", dataDeEmissao=" + dataDeEmissao +
                ", valorBruto=" + valorBruto +
                ", impostos=" + impostos +
                ", itens=" + itens +
                ", observacoes='" + observacoes + '\'' +
                '}';
    }
}
