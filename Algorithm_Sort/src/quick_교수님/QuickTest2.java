package quick_±³¼ö´Ô;

//////////////////////////////////////////////// QuickTest2.java /////////////////////////////////////////////
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class QuickTest2 {
	public static void main(String[] args) {

		int n = 19;
		int i = 0;
		Movie[] hitMovies = new Movie[n];
		BufferedReader inputStream = null;
		String line;

		try {
			try {
				inputStream = new BufferedReader(new FileReader("movie1.txt"));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			try {
				while ((line = inputStream.readLine()) != null) {
					hitMovies[i] = new Movie(line.split("\t")[0], new Integer(line.split("\t")[1]));
					i++;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		Quick.sort(hitMovies, new Movie.YearNameOrder());
		for (Movie m : hitMovies)
			System.out.println(m);
	}
}
