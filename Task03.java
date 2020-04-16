import java.util.Random;
import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {

		double lenght = 1;

		System.out.println("Введите размер массива");

		lenght = readFromConsole();

		double[] mas = new double[(int) lenght];

		enterArrayRandom(mas);

		printArray(mas);

		if (evaluete(mas)) {
			System.out.println("Возрастает! ");
		} else {
			System.out.println("Не возрастает! ");
		}
	}

	public static double readFromConsole() {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextDouble() == false) {
			String str = sc.next();
			System.out.println("Вы ввели '" + str + "', а нужно целое число");
			System.out.print("Попробуйте ещё раз ");
		}
		return sc.nextDouble();

	}

	public static void printArray(double[] mas) {
		System.out.println("--------------------------------------------");
		for (int i = 0; i < mas.length; i++) {
			System.out.print("mas[" + i + "]=" + mas[i] + "; ");
		}
		System.out.println();
		System.out.println("--------------------------------------------");
	}

	public static void enterArrayRandom(double[] mas) {

		for (int i = 0; i < mas.length; i++) {
			mas[i] = ((int) (Math.random() * 61) - 30);
		}
	}

	public static boolean evaluete(double[] mas) {
		int j = 0;

		for (int i = 0; i < mas.length - 1; i++) {
			if (mas[i + 1] > mas[i]) {
				j++;
			}
		}
		return j == mas.length - 1;
	}

}
