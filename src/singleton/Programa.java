package singleton;

public class Programa {

    public static void main(String[] args) {
        EmpresaFacade facade = new EmpresaFacadeSingleton().getInstancia();
        facade.buscaCliente("123");
        facade.criaFatura(new Cliente(), 240.0);
    }
}
