import java.time.LocalTime;
import java.time.Duration;

public class ex005 {
	public static void main(String[] args) {
		LocalTime agora = LocalTime.now();
		LocalTime meiaNoite = LocalTime.MIDNIGHT;

		int segundosDesdeMeiaNoite = (int) Duration.between(meiaNoite, agora).getSeconds();
		int segundosFaltandoParaMeiaNoite = (int) Duration.between(agora, meiaNoite.plusHours(24)).getSeconds();

		System.out.println("Segundos passados desde 0h00min00s: " + segundosDesdeMeiaNoite + " segundos");
		System.out.println("Segundos faltando para meia-noite: " + segundosFaltandoParaMeiaNoite + " segundos");
	}
}
