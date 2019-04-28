package memento;

import java.util.Date;

public class Contrato {

    private Date data;
    private String cliente;
    private TipoContrato tipo;


    public Contrato(Date data, String cliente, TipoContrato tipo) {
        this.data = data;
        this.cliente = cliente;
        this.tipo = tipo;
    }


    public Date getData() {
        return data;
    }

    public String getCliente() {
        return cliente;
    }

    public TipoContrato getTipo() {
        return tipo;
    }

    public void avanca() {
        if(tipo == TipoContrato.NOVO) tipo = TipoContrato.EM_ANDAMENTO;
        else if(tipo == TipoContrato.EM_ANDAMENTO) tipo = TipoContrato.ACERTADO;
        else if(tipo == TipoContrato.ACERTADO) tipo = TipoContrato.CONCLUIDO;
    }

    public Estado salvaEstado() {
        return new Estado(new Contrato(data, cliente, tipo));
    }

    public void restaura(Estado estado) {
        this.data = estado.getContrato().getData();
        this.cliente = estado.getContrato().getCliente();
        this.tipo = estado.getContrato().getTipo();
    }
}
