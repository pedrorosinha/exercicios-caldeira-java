import java.util.Scanner;

public class ex001 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite seu nome: ");

		String nome = scanner.nextLine();

		scanner.close();

		System.out.println("Seu nome é: " + nome);
	}
}