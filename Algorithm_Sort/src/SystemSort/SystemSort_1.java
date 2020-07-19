package SystemSort;
import java.util.*;

public class SystemSort_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = { "oh", "k" + "dg", "hwang" };

		List<String> list = Arrays.asList(a);

		Collections.sort(list);
		Collections.sort(list, Collections.reverseOrder());

		System.out.println(list);
	}

}
