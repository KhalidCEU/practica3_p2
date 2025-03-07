package aplicacion;

import mates.*;

public class Principal {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.print("Por favor inserte únicamente ");
            System.out.println("un numero valido como argumento.");
            return;
        }

        try {
            long numeroPasos = Long.valueOf(args[0]);

            System.out.println("El número PI es " +
                Matematicas.generarNumeroPiLambda(numeroPasos));

        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.toString());
        }
    }
}
