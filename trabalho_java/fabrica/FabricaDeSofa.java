package fabrica;

public class FabricaDeSofa implements FabricaDeEstofados {

    @Override
    public Estofados fabricarEstofado() {
   return new Sofa();
    }
    
}
