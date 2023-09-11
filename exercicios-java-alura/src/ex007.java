import java.util.Scanner;

public class ex007 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite sua idade: ");
		int idade = scanner.nextInt();

		System.out.print("Digite seu salário: R$");
		String salarioStr = scanner.next().replace(",", ".");
		double salario = Double.parseDouble(salarioStr);

		if (idade >= 18 && salario > 2000) {
			System.out.println("Você pode comprar um automóvel.");
		} else {
			System.out.println("Você não pode comprar um automóvel.");
		}

		scanner.close();
	}
}
