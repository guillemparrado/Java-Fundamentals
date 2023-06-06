package cat.barcelonactiva.itacademy.Excepcions.Ex3_1;
import cat.barcelonactiva.itacademy.Excepcions.Ex3_1.exceptions.ExcepcioButacaLliure;
import cat.barcelonactiva.itacademy.Excepcions.Ex3_1.exceptions.ExcepcioButacaOcupada;

import java.util.*;

public class GestioButaques {
    private final List<Butaca> butaques;

    public GestioButaques() {
        butaques = new ArrayList<>();
    }

    public List<Butaca> getButaques() {
        return butaques;
    }

    public void afegirButaca(Butaca butaca) throws ExcepcioButacaOcupada {
        if(cercarButaca(butaca.getNumFila(), butaca.getNumSeient()) != -1)
            throw new ExcepcioButacaOcupada();
        butaques.add(butaca);
    }

    public void eliminarButaca(int numFila, int numSeient) throws ExcepcioButacaLliure {
        int index = cercarButaca(numFila, numSeient);
        if(index == -1)
            throw new ExcepcioButacaLliure();
        butaques.remove(index);
    }

    public int cercarButaca(int numFila, int numSeient) {
        for (int i = 0; i < butaques.size(); i++) {
            if (butaques.get(i).getNumFila() == numFila && butaques.get(i).getNumSeient() == numSeient)
                return i;
        }
        return -1;
    }
}
