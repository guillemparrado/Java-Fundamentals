package cat.barcelonactiva.itacademy.Excepcions.Ex3_1;

import java.util.*;
import cat.barcelonactiva.itacademy.Excepcions.Ex3_1.exceptions.*;

public class Cine {
    private int numFiles;
    private int numSeientsFila;
    private final GestioButaques gestioButaques;
    private final Scanner in = new Scanner ( System.in );

    public Cine() {
        gestioButaques = new GestioButaques();
        demanarDadesInicials();
    }

    /**
     * Comença l'aplicació. Crida al mètode menu i en funció del número retornat, crida al mètode corresponent.
     */
    public void iniciar() {

        boolean exit = false;

        while (!exit) {
            switch (menu()) {
                case 0:
                    exit = true;
                    System.out.println("Adéu!");
                    break;
                case 1:
                    mostrarButaques();
                    break;
                case 2:
                    mostrarButaquesPersona();
                    break;
                case 3:
                    reservarButaca();
                    break;

                case 4:
                    anularReserva();
                    break;

                case 5:
                    anularReservaPersona();
                    break;

                default:
                    System.out.println("Invalid option");
            }
        }
    }

    /**
     * Mostra les opcions del menú principal a l'usuari/ària, li demana el número de l'opció escollida i el retorna.
     * @return opció
     */
    private int menu() {

        System.out.println("1.- Mostrar totes les butaques reservades.\n" +
                "2.- Mostrar les butaques reservades per una persona.\n" +
                "3.- Reservar una butaca.\n" +
                "4.- Anul·lar la reserva d'una butaca.\n" +
                "5.- Anul·lar totes les reserves d'una persona.\n" +
                "0.- Sortir.");

        while (true) {
            int opcio = llegeixInt();
            if (opcio >= 0 && opcio <= 5)
                return opcio;
            else
                System.out.println("Error: el nombre d'opció no es troba al menú");
        }
    }

    /**
     * Mostra totes les butaques reservades.
     */
    private void mostrarButaques() {
        List<Butaca> butaques = gestioButaques.getButaques();
        if (butaques.size() == 0)
            System.out.println("No hi ha cap butaca reservada.");
        else
            for (Butaca butaca : butaques)
                System.out.println(butaca);

    }

    /**
     * Demana el nom de la persona que ha fet la reserva i mostra totes les butaques reservades per aquesta persona.
     */
    private void mostrarButaquesPersona() {

        String persona;
        while(true){
            try{
                persona = introduirPersona();
                break;
            } catch (ExcepcioNomPersonaIncorrecte e) {
                System.out.println("Error: El nom de la persona conté dígits");
            }
        }

        for (Butaca butaca : gestioButaques.getButaques())
            if(butaca.getPersona().equals(persona))
                System.out.println(butaca);
    }

    /**
     * Demana a l'usuari/ària un número de fila (crida al mètode introduirFila), un número de seient (crida al mètode introduirSeient), el nom de la persona que fa la reserva (crida al mètode introduirPersona) i reserva la butaca.
     */
    private void reservarButaca() {
        int fila;
        int seient;
        String persona;

        while(true){
            try{
                persona = introduirPersona();
                break;
            } catch (ExcepcioNomPersonaIncorrecte e) {
                System.out.println("Error: El nom de la persona conté dígits");
            }
        }

        while(true){
            while(true){
                try{
                    fila = introduirFila();
                    break;
                } catch (ExcepcioFilaIncorrecta e){
                    System.out.println("Error: la fila no existeix");
                }
            }

            while(true){
                try{
                    seient = introduirSeient();
                    break;
                } catch (ExcepcioSeientIncorrecte e) {
                    System.out.println("Error: el seient no existeix");
                }
            }

            try {
                Butaca butaca = new Butaca(fila, seient, persona);
                gestioButaques.afegirButaca(butaca);
                System.out.println("Butaca reservada amb èxit.");
                break;
            } catch (ExcepcioButacaOcupada e) {
                System.out.println("Error: Aquesta butaca ja es troba ocupada.");
            }
        }
    }

    /**
     * Demana a l'usuari/ària un número de fila (crida al mètode introduirFila), un número de seient (crida al mètode introduirSeient) i elimina la reserva de la butaca.
     */
    private void anularReserva() {
        int fila;
        int seient;

        while(true){
            while(true){
                try{
                    fila = introduirFila();
                    break;
                } catch (ExcepcioFilaIncorrecta e){
                    System.out.println("Error: la fila no existeix");
                }
            }

            while(true){
                try{
                    seient = introduirSeient();
                    break;
                } catch (ExcepcioSeientIncorrecte e) {
                    System.out.println("Error: el seient no existeix");
                }
            }

            try {
                gestioButaques.eliminarButaca(fila, seient);
                break;
            } catch (ExcepcioButacaLliure e) {
                System.out.println("Error: La butaca està lliure.");
            }
        }
    }

    /**
     * Demana a l'usuari/ària el nom de la persona (crida al mètode introduirPersona) i elimina les butaques reservades per la persona introduïda.
     */
    private void anularReservaPersona() {
        String persona;
        while(true){
            try{
                persona = introduirPersona();
                break;
            }
            catch (ExcepcioNomPersonaIncorrecte e){
                System.out.println("Error: el nom de la persona conté dígits");
            }
        }

        for(Butaca butaca : gestioButaques.getButaques()){
            if(butaca.getPersona().equals(persona))
                try {
                    gestioButaques.eliminarButaca(butaca.getNumFila(), butaca.getNumSeient());
                }
                catch (ExcepcioButacaLliure ignored){}
        }
    }

    /**
     * Demana a l'usuari/ària el nom de la persona i el retorna si és correcte. Si conté números, llença una excepció personalitzada ExcepcioNomPersonaIncorrecte.
     */
    private String introduirPersona() throws ExcepcioNomPersonaIncorrecte {
        System.out.println("Nom de la persona: ");
        String persona = llegeixString();
        if(persona.matches(".*\\d+.*"))
            throw new ExcepcioNomPersonaIncorrecte();
        return persona;
    }

    /**
     * Demana a l'usuari/ària el nombre de files i seients i els guarda en els atributs corresponents.
     */
    private void demanarDadesInicials() {
        System.out.print("Nombre de files del cinema: ");
        numFiles = llegeixInt();
        System.out.print("Nombre de seients de cada fila: ");
        numSeientsFila = llegeixInt();
    }

    /**
     * Demana el nombre de fila, si aquest està entre 1 i el nombre de files totals, el retorna. Si no, retorna una excepció personalitzada ExcepcioFilaIncorrecta.
     */
    private int introduirFila() throws ExcepcioFilaIncorrecta {
        System.out.println("Nombre de fila: ");
        int fila = llegeixInt();
        if(fila >= 1 && fila <= numFiles) {
            return fila;
        }
        else
            throw new ExcepcioFilaIncorrecta();
    }

    /**
     * Demana el seient, si el número està entre 1 i el nombre total de seients, el retorna. Si no, retorna una excepció del tipus ExcepcioSeientIncorrecte.
     */
    private int introduirSeient() throws ExcepcioSeientIncorrecte {
        System.out.println("Nombre de seient: ");
        int seient = llegeixInt();
        if(seient >= 1 && seient <= numSeientsFila) {
            return seient;
        }
        else
            throw new ExcepcioSeientIncorrecte();
    }

    /**
     * Helper method: read Int from user
     * @return int input
     */
    private int llegeixInt() {
        while(true) {
            try {
                return in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: l'entrada no és un dígit");
                in.next();  // Cal consumir l'input per no entrar en un loop infinit
            }
        }
    }

    /**
     * Helper method: read String from user
     * @return string input
     */
    private String llegeixString() {
        return in.next();
    }

}
