import java.util.*;
public class Details {
	
	public static void main(String[] args) {

		// Find all prime numbers between 1 to 1000
		int i = 2;
		while (i < 13) {
			int j = 2;
			while (j < i) {
				if (i % j == 0) {
					// i++;
					break;
				}
				j++;
			}
			if (j == i) {
				System.out.println(i);
			}
			i++;
		}
	}
}