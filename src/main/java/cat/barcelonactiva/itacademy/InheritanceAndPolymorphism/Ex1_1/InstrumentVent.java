package cat.barcelonactiva.itacademy.InheritanceAndPolymorphism.Ex1_1;

public class InstrumentVent extends Instrument {

    static {
        System.out.println("La classe InstrumentVent s'ha carregat.");
    }

    public InstrumentVent(String name, int priceCents) {
        super(name, priceCents);
    }

    public void tocar() {
        System.out.println("Està tocant un instrument de vent");
    }
}
