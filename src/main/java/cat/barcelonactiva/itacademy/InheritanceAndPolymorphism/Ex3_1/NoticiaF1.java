package cat.barcelonactiva.itacademy.InheritanceAndPolymorphism.Ex3_1;

public class NoticiaF1 extends Noticia {
    private final String escuderia;

    public NoticiaF1(String titular, String escuderia) {
        super(titular);
        this.escuderia = escuderia;
    }

    @Override
    public int calcularPreuNoticia() {
        int preu = 100;
        if(escuderia.equals("Ferrari") || escuderia.equals("Mercedes"))
            preu += 50;
        return preu;
    }

    @Override
    public int calcularPuntuacions() {
        int puntuacio = 4;
        if(escuderia.equals("Ferrari") || escuderia.equals("Mercedes"))
            puntuacio += 2;
        return puntuacio;
    }

    public String getEscuderia() {
        return escuderia;
    }

    @Override
    public String toString() {
        return "NoticiaF1{" +
                "escuderia='" + escuderia + '\'' +
                ", titular='" + titular + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}

