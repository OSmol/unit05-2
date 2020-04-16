import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

		int lenght = 1;
		int k = 1;

		System.out.println("Введите размер массива");
		lenght = readFromConsole();

		int[] mas = new int[lenght];
		enterArrayWithRandom(mas);
		printArray(mas);

		System.out.println("Введите делитель ");
		k = readFromConsole();
		formula(k, mas);

	}

	public static int readFromConsole() {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt() == false) {
			String str = sc.next();
			System.out.println("Вы ввели '" + str + "', а нужно целое число");
			System.out.print("Попробуйте ещё раз ");
		}
		return sc.nextInt();

	}

	public static void enterArrayWithRandom(int[] mas) {

		for (int i = 0; i < mas.length; i++) {
			mas[i] = 1 + i;
		}
	}

	public static void printArray(int[] mas) {
		System.out.println("--------------------------------------------");
		for (int i = 0; i < mas.length; i++) {
			System.out.print("mas[" + i + "]=" + mas[i] + "; ");
		}
		System.out.println();
		System.out.println("--------------------------------------------");
	}

	public static int formula(int k, int[] mas) {
		int temp = 0, sum = 0;
		for (int i = 0; i < mas.length; i++) {

			temp = mas[i] % k;
			if (temp == 0) {
				sum += mas[i];
			}
		}
		System.out.println("Сумма кратных числе равна " + sum);
		return sum;
	}

}
