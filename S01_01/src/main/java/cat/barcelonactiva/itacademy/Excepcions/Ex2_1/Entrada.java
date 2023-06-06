package cat.barcelonactiva.itacademy.Excepcions.Ex2_1;

import java.util.*;

public class Entrada {

    static private final Scanner in = new Scanner(System.in);

    public static byte llegirByte(String missatge) {
        System.out.println(missatge);
        try {
            return in.nextByte();
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
            return llegirByte(missatge);
        }
    }

    public static int llegirInt(String missatge) {
        System.out.println(missatge);
        try {
            return in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
            return llegirInt(missatge);
        }
    }

    public static float llegirFloat(String missatge) {
        System.out.println(missatge);
        try {
            return in.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
            return llegirFloat(missatge);
        }
    }

    public static double llegirDouble(String missatge) {
        System.out.println(missatge);
        try {
            return in.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
            return llegirDouble(missatge);
        }
    }

    public static char llegirChar(String missatge) {
        System.out.println(missatge);
        try {
            return in.next().charAt(0);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return llegirChar(missatge);
        }
    }

    public static String llegirString(String missatge) {
        System.out.println(missatge);
        try {
            return in.nextLine();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return llegirString(missatge);
        }
    }

    public static boolean llegirSiNo(String missatge) {
        System.out.println(missatge);
        try {
            char character = in.next().charAt(0);
            if(character == 's')
                return true;
            else if (character == 'n')
                return false;
            else throw new Exception("Entrades vàlides: s/n");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return llegirSiNo(missatge);
        }
    }

}
