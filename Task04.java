import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {

		int lenght = 1;
		int lenghtSecond = 1;
		System.out.println("Введите размер массива");
		lenght = readFromConsole();

		int[] mas = new int[lenght];
		enterArrayWithRandom(mas);
		printArray(mas);

		lenghtSecond = countDoub(mas);
		int[] masSecond = new int[lenghtSecond];

		enterArrayFromFirst(mas, masSecond);

		if (lenghtSecond == 0) {
			System.out.print("Чётных нет.");
		} else {
			printArray(masSecond);
		}

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

	public static int countDoub(int[] mas) {
		int temp = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				temp++;
			}
		}
		return temp;
	}

	public static void enterArrayFromFirst(int[] mas, int[] masSecond) {
		int index = 0;
		int j = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				masSecond[j] = mas[i];
				j++;
			}
			index++;
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

}
