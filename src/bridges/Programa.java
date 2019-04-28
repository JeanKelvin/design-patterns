package bridges;


public class Programa {

    public static void main(String[] args) throws Exception {

        Mapa mapa = new GoogleMaps();
        mapa.devolveMapa("rua x");

        //...
    }
}
