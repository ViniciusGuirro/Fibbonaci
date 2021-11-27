import java.util.Scanner;

public class Java {

	public static void main(String[] args) {

		System.out.println("Digite um número: ");

		Scanner sc = new Scanner(System.in);

		int y;

		y = sc.nextInt();

		sc.close();

		int atual = 0;
		int next = 0;
		int before = 1;

		while (next <= 100) {

			next = atual + before;

			System.out.print(next + ",");

			before = atual;
			atual = next;

			if (y == atual) {

				System.out.println("Você digitou : " + y + " e este número pertence a sequencia");

			} else {
				System.out.println("Este numero não pertence a sequencia");
			}

		}

	}

}
