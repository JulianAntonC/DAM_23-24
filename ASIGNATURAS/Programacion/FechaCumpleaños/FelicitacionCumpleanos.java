import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class FelicitacionCumpleanos {
    public static void main (String[] args) {

        System.out.println("\n");
        System.out.print("Introduzca su dia de nacimiento (DD): ");
        int dia = Integer.parseInt(System.console().readLine());

        System.out.print("Introduzca su mes de nacimiento (MM): ");
        int mes = Integer.parseInt(System.console().readLine());

        System.out.print("Introduzca su año de nacimiento (YYYY):  ");
        int ano = Integer.parseInt(System.console().readLine());
		
		//Formato
        final DateTimeFormatter DFT = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		
		//Mostramos la fecha de nacimiento con el formato
        LocalDate fNacimiento = LocalDate.of(ano, mes, dia);
        String fechaNacimiento = DFT.format(fNacimiento);

		// Edad actual
        LocalDate hoy = LocalDate.now();
        String fechaHoy = DFT.format(hoy);
        Period edad = Period.between(fNacimiento, hoy);
        long edad2 = ChronoUnit.DAYS.between(fNacimiento, hoy);
        System.out.println("Tienes " + edad.getYears() + " años, ");

		


        System.out.println(fechaHoy);
        System.out.println(fechaNacimiento);

    }
}
