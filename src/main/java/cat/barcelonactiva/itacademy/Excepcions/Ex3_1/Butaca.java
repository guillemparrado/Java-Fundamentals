package cat.barcelonactiva.itacademy.Excepcions.Ex3_1;

public class Butaca {
    private final int numFila;
    private final int numSeient;
    private final String persona;

    public Butaca(int numFila, int numSeient, String persona) {
        this.numFila = numFila;
        this.numSeient = numSeient;
        this.persona = persona;
    }

    public int getNumFila() {
        return numFila;
    }

    public int getNumSeient() {
        return numSeient;
    }

    public String getPersona() {
        return persona;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;

        if (!(obj instanceof Butaca))
            return false;

        Butaca butaca = (Butaca) obj;
        return numSeient == butaca.numSeient && numFila == butaca.numFila;
    }

    @Override
    public String toString() {
        return "Fila: " + numFila + ", Seient: " + numSeient + ", Persona: " + persona;
    }
}
