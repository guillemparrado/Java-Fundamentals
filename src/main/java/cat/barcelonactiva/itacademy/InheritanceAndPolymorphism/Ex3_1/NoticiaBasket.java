package cat.barcelonactiva.itacademy.InheritanceAndPolymorphism.Ex3_1;

public class NoticiaBasket extends Noticia {

    final private String competicio;
    private final String club;

    public NoticiaBasket(String titular, String competicio, String club) {
        super(titular);
        this.competicio = competicio;
        this.club = club;
    }

    @Override
    public int calcularPreuNoticia() {
        int preu = 250;
        if(competicio.equals("Eurolliga"))
            preu += 75;
        if(club.equals("Barça") || club.equals("Madrid"))
            preu += 75;

        return preu;
    }

    @Override
    public int calcularPuntuacions() {
        int puntuacio = 4;
        if(competicio.equals("Eurolliga") || competicio.equals("ACB"))
            puntuacio += 3;
        if(club.equals("Barça") || club.equals("Madrid"))
            puntuacio += 1;
        return puntuacio;
    }

    public String getCompeticio() {
        return competicio;
    }

    public String getClub() {
        return club;
    }
}
