package cat.barcelonactiva.itacademy.Excepcions.Ex1_1;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    List<Producte> productes = new ArrayList<>();
    private int preuTotal;

    public void calcularTotal() throws VendaBuidaException {
        if(productes.isEmpty()){
            throw new VendaBuidaException("Per fer una venda primer has d'afegir productes!");
        }

        preuTotal = 0;
        for (Producte producte : productes) {
            preuTotal += producte.getPreu();
        }
    }

    public List<Producte> getProductes() {
        return productes;
    }

    public int getPreuTotal() {
        try {
            calcularTotal();
            return preuTotal;
        } catch (VendaBuidaException e) {
            return 0;
        }
    }
}
