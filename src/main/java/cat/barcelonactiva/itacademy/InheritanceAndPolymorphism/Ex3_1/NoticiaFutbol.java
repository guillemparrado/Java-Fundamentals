package cat.barcelonactiva.itacademy.InheritanceAndPolymorphism.Ex3_1;

public class NoticiaFutbol extends Noticia {
    final private String competicio;
    private final String club;
    private final String jugador;

    public NoticiaFutbol(String titular, String competicio, String club, String jugador) {
        super(titular);
        this.competicio = competicio;
        this.club = club;
        this.jugador = jugador;
    }

    @Override
    public int calcularPreuNoticia() {
        int preu = 300;
        if(competicio.equals("Lliga de Campions"))
            preu += 100;
        if(club.equals("Barça") || club.equals("Madrid"))
            preu += 100;
        if(jugador.equals("Ferran Torres") || jugador.equals("Benzema"))
            preu += 50;
        return preu;
    }

    @Override
    public int calcularPuntuacions() {
        int puntuacio = 5;
        if(competicio.equals("Lliga de Campions") || competicio.equals("Lliga"))
            puntuacio += 3;
        if(club.equals("Barça") || club.equals("Madrid"))
            puntuacio += 1;
        if(jugador.equals("Ferran Torres") || jugador.equals("Benzema"))
            puntuacio += 1;
        return puntuacio;
    }

    public String getCompeticio() {
        return competicio;
    }

    public String getClub() {
        return club;
    }

    public String getJugador() {
        return jugador;
    }
}
