package cat.barcelonactiva.itacademy.Excepcions.Ex1_1;

public class App {
    public static void main(String[] args) {
        // Genera i captura una excepció de tipus VendaBuidaException i imprimeix-ne el missatge
        Venda venda = new Venda();
        try {
            venda.calcularTotal();
        } catch (VendaBuidaException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Genera i captura una excepció de tipus ArrayIndexOutOfBoundsException i imprimeix-ne el missatge
        try {
            venda.getProductes().get(5);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}