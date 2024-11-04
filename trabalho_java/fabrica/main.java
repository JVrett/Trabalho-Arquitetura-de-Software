package fabrica;



public class main {
    public static void main(String[] args) {
        FabricaDeEstofados fabricaDeSofa = new FabricaDeSofa();
        Estofados sofa = fabricaDeSofa.fabricarEstofado();
        sofa.confecionar();

        FabricaDeEstofados fabricaDeCadeiras = new FabricaDeCadeiras();
        Estofados cadeira = fabricaDeCadeiras.fabricarEstofado();
        cadeira.confecionar();

        FabricaDeEstofados fabricaDePuff = new FabricaDePuff();
        Estofados puff = fabricaDePuff.fabricarEstofado();
        puff.confecionar();
    }
}
