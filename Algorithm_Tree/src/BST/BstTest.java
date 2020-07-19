package BST;

import java.util.Scanner;

public class BstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String[] keys = {"S","E", "A", "R", "C", "H", "X", "M", "P", "L"};
		String[] keys = {"QR","SQ", "CX", "EK", "KE", "LH", "OZ", "DL", "AHC", "QF"};

		
		Integer[] values = {1,2,3,4,5,6,7,8,9,10};
		
		BST<String, Integer> bst = new BST<String, Integer>();
	
		for(int i=0; i<keys.length; i++) {
			bst.insert(keys[i], values[i]);
		}
		
		bst.inorder();
		System.out.println("Height of the BST : " + bst.height());
		System.out.println("Key of the root node : " + bst.getRootKey());
		
		String search_key;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your search key : ");
		search_key = scan.nextLine();
		if(bst.search(search_key) == null)
			System.out.println("=> No such key!");
		else 
			System.out.println("=> " + bst.getValue(bst.search(search_key)));
		scan.close();}

}
