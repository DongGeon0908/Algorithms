package quick.movie.array;

public class quicktest_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie[] hitMovies = new Movie[5];
		hitMovies[0] = new Movie("��", 2014);
		hitMovies[1] = new Movie("��������", 2019);
		hitMovies[2] = new Movie("�Ű��Բ�", 2017);
		hitMovies[3] = new Movie("��������", 2014);
		hitMovies[4] = new Movie("���׶�", 2015);

		// �����Ҷ��� �ϳ���,, �������� �ּ�ó���ϰ�!
		// �̸�
		quickSort.sort(hitMovies, 0, 4);
		for (Movie e : hitMovies) {
			System.out.println(e);
		}

		// ����
		quickSort.sort(hitMovies, 0, 4, new Movie.YearOrder());
		for (Movie e : hitMovies) {
			System.out.println(e);
		}

		// ���� -> �̸�
		quickSort.sort(hitMovies, 0, 4, new Movie.YearNameOrder());
		for (Movie e : hitMovies) {
			System.out.println(e);
		}

	}

}
