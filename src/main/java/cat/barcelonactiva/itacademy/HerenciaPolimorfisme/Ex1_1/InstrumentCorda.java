package cat.barcelonactiva.itacademy.HerenciaPolimorfisme.Ex1_1;

public class InstrumentCorda extends Instrument {

    static {
        System.out.println("La classe InstrumentCorda s'ha carregat.");
    }

    public InstrumentCorda(String name, int priceCents) {
        super(name, priceCents);
    }

    public void tocar() {
        System.out.println("Està tocant un instrument de corda");
    }
}
