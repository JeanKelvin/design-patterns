package facade;

public class Programa {

    public static void main(String[] args) {
        EmpresaFacade facade = new EmpresaFacade();
        facade.buscaCliente("123");
        facade.criaFatura(new Cliente(), 240.0);
    }
}
