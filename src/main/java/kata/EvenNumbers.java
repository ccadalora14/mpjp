package kata;

public class EvenNumbers {
	public static int[] divisibleBy(int[] numbers, int divider) {

		int counter = 0;
		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] % divider == 0)
				counter++;

		}

		int[] divisible = new int[counter];
		return numbers;

	}
}
