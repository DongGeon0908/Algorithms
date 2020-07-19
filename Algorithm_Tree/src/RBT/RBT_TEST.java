package RBT;
//�˰��� ���� A-2

import java.io.*;
import java.util.*;

import BST.BST;

public class RBT_TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> content = new ArrayList<String>(); // txt���Ͽ��� �Ҿ�� ������ content�� �����ϱ� ���� ArrayList
		
		try {
			// ���� ��ü ����
			File file = new File("C:\\Users\\benjamin\\eclipse-workspace\\Algorithm_Tree\\src\\RBT\\CARRIERS.txt");
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
			System.out.println(e);
		} catch (IOException e) {

			System.out.println(e);

		}

		String[] Arraycontent = content.toArray(new String[content.size()]); // content�� �ִ� ������ �迭�� ����

		String[] lastcontent = new String[2]; // ���ڿ� �ؽ�Ʈ �и��Ͽ� �����ϱ� ���� �迭
		String[] keys = new String[Arraycontent.length]; // ��ó⵵ �����ϴ� �迭

		String[] values = new String[Arraycontent.length]; // ��ȭ������ �����ϴ� �迭

		for (int i = 0; i < Arraycontent.length; i++) {
			lastcontent = Arraycontent[i].split("\t"); // ��ȭ����� ��ó⵵�� �и���Ŵ
			keys[i] = lastcontent[0]; // �и���Ų ��ó⵵�� year�迭�� ����
			values[i] = lastcontent[1]; // �и���Ų ��ȭ������ name�迭�� ����

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
		
		System.out.println("��ǻ�Ͱ��к� �赿�� : 201658109");
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
		

	


