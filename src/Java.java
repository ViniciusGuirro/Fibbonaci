import java.util.Scanner;

public class Java {

	public static void main(String[] args) {

		System.out.println("Digite um n�mero: ");

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

				System.out.println("Voc� digitou : " + y + " e este n�mero pertence a sequencia");

			} else {
				System.out.println("Este numero n�o pertence a sequencia");
			}

		}

	}

}
