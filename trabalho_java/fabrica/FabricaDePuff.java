package fabrica;

public class FabricaDePuff implements FabricaDeEstofados {

    @Override
    public Estofados fabricarEstofado() {
        return new Puff();
    }
    
}
