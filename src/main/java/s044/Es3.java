package s044;

public class Es3 {
	public static void main(String[] args) {
		int[] data = { 5, 7, 1, 3, 4 };
		for (int i = 0; i < data.length; i++) {
			if (data[i] == 1) {
				System.out.println("1 è in posizione" + i);
			}
			if (data[i] == 7) {
				System.out.println("7 è in posizione" + i);
			}
		}
	}
}
