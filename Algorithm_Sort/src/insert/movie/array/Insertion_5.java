package insert.movie.array;

public class Insertion_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Movie[] hitMovies = new Movie[5];
		hitMovies[0] = new Movie("��", 2014);
		hitMovies[1] = new Movie("��������", 2019);
		hitMovies[2] = new Movie("�Ű��Բ�", 2017);
		hitMovies[3] = new Movie("��������", 2014);
		hitMovies[4] = new Movie("���׶�", 2015);

		// �̸�
		Insertion.sort(hitMovies);
		for (Movie e : hitMovies) {
			System.out.println(e);
	}

		// ����
		Insertion.sort(hitMovies, new Movie.YearOrder());
		for (Movie e : hitMovies) {
			System.out.println(e);
		}

		// ���� - > �̸�
		Insertion.sort(hitMovies, new Movie.YearNameOrder());
		for (Movie e : hitMovies) {
		System.out.println(e);
		}

	}

}
