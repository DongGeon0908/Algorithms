package quick_교수님;

//////////////////////////////////////////////// QuickTest1.java /////////////////////////////////////////////

public class QuickTest1 {
	public static void main(String[] args) {

		Movie[] hitMovies = new Movie[5];
		hitMovies[0] = new Movie("명량", 2014);
		hitMovies[1] = new Movie("극한직업", 2019);
		hitMovies[2] = new Movie("신과함께: 죄와 벌", 2017);
		hitMovies[3] = new Movie("국제시장", 2014);
		hitMovies[4] = new Movie("베테랑", 2015);

		System.out.println("\n< 영화제목순 정렬 >");
		Quick.sort(hitMovies, new Movie.NameOrder());
		for (Movie m : hitMovies)
			System.out.println(m);

		System.out.println("\n< 개봉년도 오름차순 정렬 >");
		Quick.sort(hitMovies, new Movie.YearOrder());
		for (Movie m : hitMovies)
			System.out.println(m);

		System.out.println("\n< 개병년도 내림차순(동일하면 영화제목순) 정렬 >");
		Quick.sort(hitMovies, new Movie.YearNameOrder());
		for (Movie m : hitMovies)
			System.out.println(m);
	}

}
