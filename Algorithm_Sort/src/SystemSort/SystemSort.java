package SystemSort;
import java.util.Arrays;

public class SystemSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = { "oh", "Kdg", "hwang" };

		Arrays.sort(a, String.CASE_INSENSITIVE_ORDER);

		for (String s : a) {
			System.out.println(s);
		}
	}

}
