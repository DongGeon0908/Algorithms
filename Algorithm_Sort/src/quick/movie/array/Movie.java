package quick.movie.array;

import java.util.*;

public class Movie implements Comparable<Movie> {
	private String name;
	private int year;

	public Movie(String title, int yr) {
		this.name = title;
		this.year = yr;
	}

	// 이름순으로 정렬
	public int compareTo(Movie that) {
		return this.name.compareTo(that.name);
	}

	// quicksort 연도로 기준점 잡기 오름차순 정렬
	public static class YearOrder implements Comparator<Movie> {
		public int compare(Movie m1, Movie m2) {
			if (m1.year < m2.year) {
				return -1;
			} else if (m1.year > m2.year) {
				return 1;
			} else {
				return 0;
			}
		}
	}

	// quicksort 연도 -> 이름 정렬
	public static class YearNameOrder implements Comparator<Movie> {
		public int compare(Movie m1, Movie m2) {
			if (m1.year < m2.year) {
				return 1;
			} else if (m1.year > m2.year) {
				return -1;
			} else {
				return m1.name.compareTo(m2.name);
			}
		}
	}

	public String toString() {
		return name + "(" + year + ")";
	}

}
