
package dias_vividos;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Dias_vividos {

  
    public static void main(String[] args) {
       
          // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();

        // Obtener la fecha de nacimiento del usuario
        LocalDate fechaNacimiento = obtenerFechaNacimiento();

        // Calcular la edad en semanas y días
        long semanasVividas = calcularSemanasVividas(fechaNacimiento, fechaActual);
        long diasVividos = calcularDiasVividos(fechaNacimiento, fechaActual);

        // Mostrar resultados
        System.out.println("Has vivido aproximadamente:");
        System.out.println(semanasVividas + " semanas");
        System.out.println(diasVividos + " dias");
    }

    private static LocalDate obtenerFechaNacimiento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingresa tu fecha de nacimiento (formato dd/MM/yyyy): ");
        String inputFecha = scanner.nextLine();

        // Convertir la cadena de entrada a un objeto LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(inputFecha, formatter);
    }

    private static long calcularSemanasVividas(LocalDate fechaNacimiento, LocalDate fechaActual) {
        return fechaNacimiento.until(fechaActual).toTotalMonths() / 4;
    }

    private static long calcularDiasVividos(LocalDate fechaNacimiento, LocalDate fechaActual) {
        return fechaNacimiento.until(fechaActual).getDays();
        
        
        
    }
    
}
