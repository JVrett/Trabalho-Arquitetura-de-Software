package fabrica;

public class FabricaDeCadeiras implements FabricaDeEstofados {

    @Override
    public Estofados fabricarEstofado() {
       return new Cadeira();
    }
    
}
