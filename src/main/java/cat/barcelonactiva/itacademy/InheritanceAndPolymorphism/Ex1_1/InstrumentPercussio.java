package cat.barcelonactiva.itacademy.InheritanceAndPolymorphism.Ex1_1;

public class InstrumentPercussio extends Instrument {

    static {
        System.out.println("La classe InstrumentPercussio s'ha carregat.");
    }

    public InstrumentPercussio(String name, int priceCents) {
        super(name, priceCents);
    }

    public void tocar() {
        System.out.println("Està tocant un instrument de Percussió");
    }
}
