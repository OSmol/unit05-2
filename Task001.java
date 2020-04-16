import java.util.Random;
import java.util.Scanner;

public class Task001 {

	public static void main(String[] args) {

		int lenght = 1;

		System.out.println("Введите размер массива");

		lenght = readFromConsole();
		double[] mas = new double[lenght];
		enterArrayWithRandom(mas);
		printArray(mas);
		findMaxElement(mas);
		findMinElement(mas);

	}

	public static int readFromConsole() {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt() == false) {
			String str = sc.next();
			System.out.println("Вы ввели '" + str + "', а нужно размер массива");
			System.out.print("Попробуйте ещё раз ");
		}
		return sc.nextInt();

	}

	public static void printArray(double[] mas) {
		System.out.println("--------------------------------------------");
		for (int i = 0; i < mas.length; i++) {
			System.out.print("mas[" + i + "]=" + String.format("%-5f", mas[i]) + "; ");
		}
		System.out.println();
		System.out.println("--------------------------------------------");
	}

	public static void enterArrayWithRandom(double[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextDouble();
		}
	}

	public static void findMaxElement(double[] mas) {
		if (mas.length == 0) {
			return;
		}
		double max;

		max = mas[0];

		for (int i = 1; i < mas.length; i++) {
			if (max < mas[i]) {
				max = mas[i];
			}
		}
		System.out.println("Максимальный элемент " + max);

	}
	public static void findMinElement(double[] mas) {
		if (mas.length == 0) {
			return;
		}
		double min;
		int minIndex = 0;

		min = mas[0];

		for (int i = 1; i < mas.length; i++) {
			if (min > mas[i]) {
				min = mas[i];
				minIndex = i;
			}
		}
		System.out.println("Минимальный элемент " + min + " с индексом " + minIndex);

	}
}
