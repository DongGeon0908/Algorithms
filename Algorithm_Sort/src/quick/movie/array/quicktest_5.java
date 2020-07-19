package quick.movie.array;

public class quicktest_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie[] hitMovies = new Movie[5];
		hitMovies[0] = new Movie("명량", 2014);
		hitMovies[1] = new Movie("극한직업", 2019);
		hitMovies[2] = new Movie("신과함께", 2017);
		hitMovies[3] = new Movie("국제시장", 2014);
		hitMovies[4] = new Movie("베테랑", 2015);

		// 정렬할때는 하나씩,, 나머지는 주석처리하고!
		// 이름
		quickSort.sort(hitMovies, 0, 4);
		for (Movie e : hitMovies) {
			System.out.println(e);
		}

		// 연도
		quickSort.sort(hitMovies, 0, 4, new Movie.YearOrder());
		for (Movie e : hitMovies) {
			System.out.println(e);
		}

		// 연도 -> 이름
		quickSort.sort(hitMovies, 0, 4, new Movie.YearNameOrder());
		for (Movie e : hitMovies) {
			System.out.println(e);
		}

	}

}
