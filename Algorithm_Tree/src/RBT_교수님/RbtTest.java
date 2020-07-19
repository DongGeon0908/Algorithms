package RBT_±³¼ö´Ô;

import java.io.*;
import java.util.*;

public class RbtTest {
	public static void main(String[] args) {
		String fname = "CARRIERS.txt";
		BufferedReader in = null;
		String line;
		RBT<String, String> rbt = new RBT<String, String>();

		try {
			in = new BufferedReader(new FileReader(fname));
			while ((line = in.readLine()) != null) {
				String[] vs = new String[2];
				vs = line.split("\t");
				rbt.insert(vs[0], vs[1]);
			}
			in.close();
		} catch (IOException e) {
			System.err.println("File error");
			System.exit(1);
		}

		System.out.println("Height of the RBT : " + rbt.height());
		System.out.println("Key of the root node : " + rbt.getRootKey());

		String search_key;
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter your search key : ");
			search_key = scan.nextLine();
			if (rbt.search(search_key) == null) {
				System.out.println("=> No such Key!");
			} else {
				System.out.println(" => " + rbt.getValue(rbt.search(search_key)));
			}
		}
		scan.close();
	}
}
