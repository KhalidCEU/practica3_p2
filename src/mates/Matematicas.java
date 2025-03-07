package mates;
import java.util.stream.LongStream;

public class Matematicas {
    /**
     * Genera una aproximacion del número PI usando el metodo Monte-Carlo
     *
     * @param pasos el numero de puntos que generamos. Define el numero de
     *  putnos que se generará en el stream.
     *
     * @return La aproximacion del numero PI obtenida
     */
    public static double generarNumeroPiLambda(long pasos) {

        long puntosDentro = LongStream.range(0, pasos)
            .mapToObj(i -> new double[]{Math.random(), Math.random()})
            .filter(punto -> punto[0] * punto[0] + punto[1] * punto[1] <= 1)
            .count();

        double aproximacionPi = 4.0 * puntosDentro / pasos;

        return aproximacionPi;
    }
}
