import java.util.Scanner;

public class ex004 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informação: o salário minimo é 1320 reais");
		
		double salarioMinimo = 1320.0;

		System.out.print("Digite o valor do salário do usuário: ");
		double salarioUsuario = scanner.nextDouble();

		double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;

		System.out.println("O usuário ganha " + quantidadeSalariosMinimos + " salários mínimos.");

		scanner.close();
	}
}
