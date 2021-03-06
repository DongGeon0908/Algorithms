//알고리즘 과제 A-2
package quick.movie.textfile;

import java.io.*;
import java.util.*;

import quick.movie.array.Movie;
import quick.movie.array.quickSort;

public class quicktest_text {

	public static ArrayList<String> file(String file_name) {
		ArrayList<String> content = new ArrayList<String>(); // txt파일에서 불어온 내용을 content에 삽입하기 위한 ArrayList

		try {
			// 파일 객체 생성
			File file = new File("C:\\Users\\benjamin\\eclipse-workspace\\Alogorithm_Sort\\movie1.txt");
			// 입력 스트림 생성
			FileReader filereader = new FileReader(file);
			// 입력 버퍼 생성
			BufferedReader bufReader = new BufferedReader(filereader);
			String line = "";
			while ((line = bufReader.readLine()) != null) {

				content.add(line); // txt파일에서 불어온 내용을 content에 삽입

			}
			// .readLine()은 끝에 개행문자를 읽지 않는다.
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

		ArrayList<String> content = new ArrayList<String>(); // txt파일에서 불어온 내용을 content에 삽입하기 위한 ArrayList

		try {
			// 파일 객체 생성
			File file = new File("C:\\Users\\benjamin\\eclipse-workspace\\DongGeon_alogorithms\\src\\movie1.txt");
			// 입력 스트림 생성
			FileReader filereader = new FileReader(file);
			// 입력 버퍼 생성
			BufferedReader bufReader = new BufferedReader(filereader);
			String line = "";
			while ((line = bufReader.readLine()) != null) {

				content.add(line); // txt파일에서 불어온 내용을 content에 삽입

			}
			// .readLine()은 끝에 개행문자를 읽지 않는다.
			bufReader.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (IOException e) {

			System.out.println(e);

		}

		String[] Arraycontent = content.toArray(new String[content.size()]); // content에 있는 내용을 배열에 삽입

		String[] lastcontent = new String[2]; // 문자와 텍스트 분리하여 저장하기 위한 배열
		String[] name = new String[Arraycontent.length]; // 영화제목을 삽입하는 배열
		int[] year = new int[Arraycontent.length]; // 출시년도 삽입하는 배열

		for (int i = 0; i < Arraycontent.length; i++) {
			lastcontent = Arraycontent[i].split("\t"); // 영화제목과 출시년도를 분리시킴
			name[i] = lastcontent[0]; // 분리시킨 영화제목을 name배열에 삽입
			year[i] = Integer.parseInt(lastcontent[1]); // 분리시킨 출시년도를 year배열에 삽입

		}

		Movie[] hitMovies = new Movie[name.length];

		for (int i = 0; i < Arraycontent.length; i++) {
			hitMovies[i] = new Movie(name[i], year[i]);
		}

		// 정렬할때는 하나씩,, 나머지는 주석처리하고!
		// 이름
//		quickSort.sort(hitMovies, 0, (name.length) - 1);
//		for (Movie e : hitMovies) {
//			System.out.println(e);
//		}

		// 연도
//		quickSort.sort(hitMovies, 0, (name.length) - 1, new Movie.YearOrder());
//		for (Movie e : hitMovies) {
//			System.out.println(e);
//		}

		// 연도 -> 이름
		quickSort.sort(hitMovies, 0, (name.length) - 1, new Movie.YearNameOrder());
		for (Movie e : hitMovies) {
			System.out.println(e);
		}

	}

}
