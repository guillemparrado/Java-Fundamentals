package cat.barcelonactiva.itacademy.InheritanceAndPolymorphism.Ex3_1;

import java.util.ArrayList;
import java.util.List;

public class Redactor {
    private String nom;
    private final String dni;
    static private int souCents = 1500;
    private List<Noticia> noticies = new ArrayList<>();

    public Redactor(String dni) {
        this.dni = dni;
    }

    public static int getSouCents() {
        return souCents;
    }

    public static void setSouCents(int souCents) {
        Redactor.souCents = souCents;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDni() {
        return dni;
    }

    public void addNoticia(Noticia noticia) {
        noticies.add(noticia);
    }

    public void removeNoticia(Noticia noticia) {
        noticies.remove(noticia);
    }

    public List<Noticia> getNoticies() {
        return noticies;
    }

    public void setNoticies(List<Noticia> noticies) {
        this.noticies = noticies;
    }

    @Override
    public String toString() {
        return "Redactor{" +
                "nom='" + nom + '\'' +
                ", dni='" + dni + '\'' +
                ", noticies=" + noticies +
                '}';
    }
}
