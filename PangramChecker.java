import java.util.Scanner;

public class PangramChecker {
	public static void pangramChecker(String string) {
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			for (int j = 65, k = 97; j < 91 || k < 123; j++, k++) {
				if ((string.charAt(i) == (char) j)
						|| (string.charAt(i) == (char) k)) {
					count++;
				}

			}
		}
		if (count >= 26) {
			System.out.println("The given string is a pangram");
		} else {
			System.out.println("The given string is not a pangram");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scanner.nextLine();
		pangramChecker(str);
		scanner.close();
	}
}
