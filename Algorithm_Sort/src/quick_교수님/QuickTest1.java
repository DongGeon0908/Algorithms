package quick_������;

//////////////////////////////////////////////// QuickTest1.java /////////////////////////////////////////////

public class QuickTest1 {
	public static void main(String[] args) {

		Movie[] hitMovies = new Movie[5];
		hitMovies[0] = new Movie("��", 2014);
		hitMovies[1] = new Movie("��������", 2019);
		hitMovies[2] = new Movie("�Ű��Բ�: �˿� ��", 2017);
		hitMovies[3] = new Movie("��������", 2014);
		hitMovies[4] = new Movie("���׶�", 2015);

		System.out.println("\n< ��ȭ����� ���� >");
		Quick.sort(hitMovies, new Movie.NameOrder());
		for (Movie m : hitMovies)
			System.out.println(m);

		System.out.println("\n< �����⵵ �������� ���� >");
		Quick.sort(hitMovies, new Movie.YearOrder());
		for (Movie m : hitMovies)
			System.out.println(m);

		System.out.println("\n< �����⵵ ��������(�����ϸ� ��ȭ�����) ���� >");
		Quick.sort(hitMovies, new Movie.YearNameOrder());
		for (Movie m : hitMovies)
			System.out.println(m);
	}

}
