import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Genr {

	public static void main(String[] args) {
		int[] input = { 4, 4, 4, 6, 4 };

		takesArray(input);
	}

	public static void takesArray(int[] input) {
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

		// populating the hashMap
		for (int i = 0; i < input.length; i++) {
			if (hashMap.containsKey(input[i])) {
				int value = hashMap.get(input[i]);
				hashMap.put(input[i], value + 1);
			} else {
				hashMap.put(input[i], 1);
			}
		}

		for (int i = 0; i < input.length; i++) {
			if (hashMap.containsKey(10 - input[i])) {
				for (int j = 0; j < hashMap.get(10 - input[i]); j++) {
					System.out.println("(" + input[i] + ", " + (10 - input[i]) + ")");
				}
			}
		}

		System.out.println("=======================================================");
		HashMap<Integer, Integer> printed = new HashMap<Integer, Integer>();

		for (int i = 0; i < input.length; i++) {
			if (!printed.containsKey(input[i])) {
				if (hashMap.containsKey(10 - input[i])) {
					System.out.println("(" + input[i] + ", " + (10 - input[i]) + ")");
					printed.put(input[i], 0);

				}
			}
		}

		System.out.println("=======================================================");
		printed = new HashMap<Integer, Integer>();

		for (int i = 0; i < input.length; i++) {
			if (!printed.containsKey(input[i])) {
				if (hashMap.containsKey(10 - input[i])) {
					System.out.println("(" + input[i] + ", " + (10 - input[i]) + ")");
					printed.put(input[i], 0);
					printed.put(10 - input[i], 0);

				}
			}
		}

	}
}
