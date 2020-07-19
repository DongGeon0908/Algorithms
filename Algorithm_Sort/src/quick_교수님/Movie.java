package quick_±³¼ö´Ô;

import java.util.Comparator;

public class Movie implements Comparable<Movie>{
	private String name;
	private int year;
	
	public Movie(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
	public static class NameOrder implements Comparator<Movie> {
		public int compare(Movie m1, Movie m2) {
			return m1.name.compareTo(m2.name);
		}
	}

	public static class YearOrder implements Comparator<Movie> {
		public int compare(Movie m1, Movie m2) {
			if(m1.year < m2.year) return -1;
			if(m1.year > m2.year) return +1;
			return 0;
		}
	}

	public static class YearNameOrder implements Comparator<Movie> {
		public int compare(Movie m1, Movie m2) {
			if(m1.year > m2.year) return -1;
			if(m1.year < m2.year) return +1;
			return m1.name.compareTo(m2.name);
		}
	}

	public String toString() {
		return name + "(" + year + ")";
	}

	@Override
	public int compareTo(Movie o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
