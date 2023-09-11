import java.util.Scanner;

public class ex008 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Selecione uma opção:");
		System.out.println("1. Gestante");
		System.out.println("2. Idosa");
		System.out.println("3. Deficiente");
		System.out.println("4. Nenhuma das alternativas");

		int opcao = scanner.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Você tem direito à fila prioritária como gestante.");
			break;
		case 2:
			System.out.println("Você tem direito à fila prioritária como idosa.");
			break;
		case 3:
			System.out.println("Você tem direito à fila prioritária como deficiente.");
			break;
		case 4:
			System.out.println("Você não tem direito à fila prioritária.");
			break;
		default:
			System.out.println("Opção inválida.");
		}

		scanner.close();
	}
}