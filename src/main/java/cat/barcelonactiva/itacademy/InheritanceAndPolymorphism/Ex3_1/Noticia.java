package cat.barcelonactiva.itacademy.InheritanceAndPolymorphism.Ex3_1;

abstract public class Noticia {
    protected String titular;
    protected String text;

    public Noticia(String titular) {
        this.text = "";
        this.titular = titular;
    }

    abstract public int calcularPreuNoticia();

    abstract public int calcularPuntuacions();

    public void setText(String text) {
        this.text = text;
    }

    public String getTitular() {
        return titular;
    }

    public String getText() {
        return text;
    }
}
