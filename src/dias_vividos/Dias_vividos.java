
package dias_vividos;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


public class Dias_vividos {

  
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

        // Solicitar la fecha de nacimiento
        System.out.println("Ingresa tu fecha de nacimiento (AAAA-MM-DD): ");
        String fechaNacimientoString = scanner.nextLine();

        // Convertir la cadena de fecha a LocalDate
        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoString);

        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();

        // Calcular la diferencia entre las dos fechas
        Period periodo = Period.between(fechaNacimiento, fechaActual);

        // Obtener el número de años, meses y días
        int años = periodo.getYears();
        int meses = periodo.getMonths();
        int días = periodo.getDays();

        // Calcular el número de semanas
        long semanas = fechaNacimiento.until(fechaActual).toTotalMonths() / 4;

        // Mostrar el resultado
        System.out.println("Has vivido:");
        System.out.println("Años: " + años);
        System.out.println("Meses: " + meses);
        System.out.println("Días: " + días);
        System.out.println("Semanas: " + semanas);

        // Cerrar el escáner
        scanner.close();
    }
}