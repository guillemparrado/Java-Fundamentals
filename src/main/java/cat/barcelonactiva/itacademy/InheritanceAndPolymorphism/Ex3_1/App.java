package cat.barcelonactiva.itacademy.InheritanceAndPolymorphism.Ex3_1;

public class App {


    public static void main(String[] args) {

        // Instàncies
        Redaccio redaccio = new Redaccio();

        // 1.- Introduir redactor
        Redactor redactor = new Redactor("123456789F");
        redaccio.addRedactor(redactor);

        // 2.- Eliminar redactor
        redaccio.removeRedactor(redactor);

        // 3.- Introduir notícia a un redactor.
        Noticia noticia = new NoticiaF1("Ferrari guanya a Montmeló 2021", "Ferrari");
        redactor.addNoticia(noticia);

        // 4.- Eliminar notícia.
        redactor.removeNoticia(noticia);

        // 5.- Mostrar totes les notícies per redactor.
        redactor.addNoticia(new NoticiaF1("Mercedes guanya a Montmeló 2022", "Mercedes"));
        redactor.addNoticia(new NoticiaF1("McLaren guanya a Montmeló 2021", "McLaren"));
        for(Noticia n : redactor.getNoticies())
            System.out.println(n);

        // 6.- Calcular puntuació de la notícia.
        System.out.println("Puntuació: " + noticia.calcularPuntuacions());

        // 7.- Calcular preu-notícia.
        System.out.println("Preu: " + noticia.calcularPreuNoticia());
    }
}
