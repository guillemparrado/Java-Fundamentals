package cat.barcelonactiva.itacademy.InheritanceAndPolymorphism.Ex3_1;

import java.util.Set;

public class NoticiaTenis extends Noticia {
    final private String competicio;
    private final Set<String> tennistes;

    public NoticiaTenis(String titular, String competicio, Set<String> tennistes) {
        super(titular);
        this.competicio = competicio;
        this.tennistes = tennistes;
    }

    @Override
    public int calcularPreuNoticia() {
        int preu = 150;
        if(tennistes.contains("Federer") || tennistes.contains("Nadal") || tennistes.contains("Djokovic"))
            preu += 100;
        return preu;
    }

    @Override
    public int calcularPuntuacions() {
        int puntuacio = 4;
        if(tennistes.contains("Federer") || tennistes.contains("Nadal") || tennistes.contains("Djokovic"))
            puntuacio += 3;
        return puntuacio;
    }


    public String getCompeticio() {
        return competicio;
    }

    public Set<String> getTennistes() {
        return tennistes;
    }
}
