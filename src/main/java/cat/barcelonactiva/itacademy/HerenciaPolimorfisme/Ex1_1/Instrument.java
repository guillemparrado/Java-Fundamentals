package cat.barcelonactiva.itacademy.HerenciaPolimorfisme.Ex1_1;

abstract public class Instrument {
    protected String name;
    protected int priceCents;

    public Instrument(String name, int priceCents) {
        this.name = name;
        this.priceCents = priceCents;
    }

    abstract public void tocar();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriceCents() {
        return priceCents;
    }

    public void setPriceCents(int priceCents) {
        this.priceCents = priceCents;
    }
}
