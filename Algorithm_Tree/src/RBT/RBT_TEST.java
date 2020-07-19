package RBT;
//알고리즘 과제 A-2

import java.io.*;
import java.util.*;

import BST.BST;

public class RBT_TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> content = new ArrayList<String>(); // txt파일에서 불어온 내용을 content에 삽입하기 위한 ArrayList
		
		try {
			// 파일 객체 생성
			File file = new File("C:\\Users\\benjamin\\eclipse-workspace\\Algorithm_Tree\\src\\RBT\\CARRIERS.txt");
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
			System.out.println(e);
		} catch (IOException e) {

			System.out.println(e);

		}

		String[] Arraycontent = content.toArray(new String[content.size()]); // content에 있는 내용을 배열에 삽입

		String[] lastcontent = new String[2]; // 문자와 텍스트 분리하여 저장하기 위한 배열
		String[] keys = new String[Arraycontent.length]; // 출시년도 삽입하는 배열

		String[] values = new String[Arraycontent.length]; // 영화제목을 삽입하는 배열

		for (int i = 0; i < Arraycontent.length; i++) {
			lastcontent = Arraycontent[i].split("\t"); // 영화제목과 출시년도를 분리시킴
			keys[i] = lastcontent[0]; // 분리시킨 출시년도를 year배열에 삽입
			values[i] = lastcontent[1]; // 분리시킨 영화제목을 name배열에 삽입

		}

		
		Airline[] airline = new Airline[values.length];

		for (int i = 0; i < Arraycontent.length; i++) {
			airline[i] = new Airline(keys[i], values[i]);
		}
//		for(Airline a : airline) {
//			System.out.println(a.toString());
//		}
		

		

		
		RBT<String, String> rbt = new RBT<String, String>();
		
		for(int i=0; i<keys.length; i++) {
			rbt.put(keys[i], values[i]);
		}
		
		System.out.println("컴퓨터공학부 김동건 : 201658109");
		System.out.println("Height of the rbt : " + rbt.height());
		System.out.println("Key of the root node : " + rbt.getRootKey());
		System.out.println("Size of the rbt : " + rbt.size());
		System.out.println("");
		
		String search_key;
		
		while(true) {
			Scanner scan = new Scanner(System.in);
		System.out.print("Enter your search key : ");
		search_key = scan.nextLine();
		if(rbt.get(search_key) == null) {
			System.out.println("=> No such key!");
		}
		else {
		System.out.println("Search Key : " + search_key);
		System.out.print("Depth of the " + search_key +" : ");
		rbt.search11(search_key);
		System.out.println("Value => " + rbt.get(search_key));
		System.out.println("");
		}
		
		
		}
	}}
		

	


