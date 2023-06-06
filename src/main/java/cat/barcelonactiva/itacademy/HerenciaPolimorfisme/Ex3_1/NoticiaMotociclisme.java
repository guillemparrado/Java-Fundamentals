package cat.barcelonactiva.itacademy.HerenciaPolimorfisme.Ex3_1;

public class NoticiaMotociclisme extends Noticia {

    final private String equip;

    public NoticiaMotociclisme(String titular, String equip) {
        super(titular);
        this.equip = equip;
    }

    @Override
    public int calcularPreuNoticia() {
        int preu = 100;
        if(equip.equals("Honda") || equip.equals("Yamaha"))
            preu += 50;
        return preu;
    }

    @Override
    public int calcularPuntuacions() {
        int puntuacio = 3;
        if(equip.equals("Honda") || equip.equals("Yamaha"))
            puntuacio += 3;
        return puntuacio;
    }

    public String getEquip() {
        return equip;
    }
}
