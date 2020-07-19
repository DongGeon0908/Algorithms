//�˰��� ���� A-2
package quick.movie.textfile;

import java.io.*;
import java.util.*;

import quick.movie.array.Movie;
import quick.movie.array.quickSort;

public class quicktest_text {

	public static ArrayList<String> file(String file_name) {
		ArrayList<String> content = new ArrayList<String>(); // txt���Ͽ��� �Ҿ�� ������ content�� �����ϱ� ���� ArrayList

		try {
			// ���� ��ü ����
			File file = new File("C:\\Users\\benjamin\\eclipse-workspace\\Alogorithm_Sort\\movie1.txt");
			// �Է� ��Ʈ�� ����
			FileReader filereader = new FileReader(file);
			// �Է� ���� ����
			BufferedReader bufReader = new BufferedReader(filereader);
			String line = "";
			while ((line = bufReader.readLine()) != null) {

				content.add(line); // txt���Ͽ��� �Ҿ�� ������ content�� ����

			}
			// .readLine()�� ���� ���๮�ڸ� ���� �ʴ´�.
			bufReader.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (IOException e) {

			System.out.println(e);

		}
		return content;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> content = new ArrayList<String>(); // txt���Ͽ��� �Ҿ�� ������ content�� �����ϱ� ���� ArrayList

		try {
			// ���� ��ü ����
			File file = new File("C:\\Users\\benjamin\\eclipse-workspace\\DongGeon_alogorithms\\src\\movie1.txt");
			// �Է� ��Ʈ�� ����
			FileReader filereader = new FileReader(file);
			// �Է� ���� ����
			BufferedReader bufReader = new BufferedReader(filereader);
			String line = "";
			while ((line = bufReader.readLine()) != null) {

				content.add(line); // txt���Ͽ��� �Ҿ�� ������ content�� ����

			}
			// .readLine()�� ���� ���๮�ڸ� ���� �ʴ´�.
			bufReader.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (IOException e) {

			System.out.println(e);

		}

		String[] Arraycontent = content.toArray(new String[content.size()]); // content�� �ִ� ������ �迭�� ����

		String[] lastcontent = new String[2]; // ���ڿ� �ؽ�Ʈ �и��Ͽ� �����ϱ� ���� �迭
		String[] name = new String[Arraycontent.length]; // ��ȭ������ �����ϴ� �迭
		int[] year = new int[Arraycontent.length]; // ��ó⵵ �����ϴ� �迭

		for (int i = 0; i < Arraycontent.length; i++) {
			lastcontent = Arraycontent[i].split("\t"); // ��ȭ����� ��ó⵵�� �и���Ŵ
			name[i] = lastcontent[0]; // �и���Ų ��ȭ������ name�迭�� ����
			year[i] = Integer.parseInt(lastcontent[1]); // �и���Ų ��ó⵵�� year�迭�� ����

		}

		Movie[] hitMovies = new Movie[name.length];

		for (int i = 0; i < Arraycontent.length; i++) {
			hitMovies[i] = new Movie(name[i], year[i]);
		}

		// �����Ҷ��� �ϳ���,, �������� �ּ�ó���ϰ�!
		// �̸�
//		quickSort.sort(hitMovies, 0, (name.length) - 1);
//		for (Movie e : hitMovies) {
//			System.out.println(e);
//		}

		// ����
//		quickSort.sort(hitMovies, 0, (name.length) - 1, new Movie.YearOrder());
//		for (Movie e : hitMovies) {
//			System.out.println(e);
//		}

		// ���� -> �̸�
		quickSort.sort(hitMovies, 0, (name.length) - 1, new Movie.YearNameOrder());
		for (Movie e : hitMovies) {
			System.out.println(e);
		}

	}

}
