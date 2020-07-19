package insert;

public class InsertionSort_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {2,9,5,4,8,1};
		
		int key = 0;
		int j = 0;
		
		for(int i=1; i<a.length; i++) {
			key = a[i];
			j= i-1;
			while(j>=0 && a[j] > key) {
				a[j+1] = a[j];
				j--;
				a[j+1] = key;
			}
			
			
		}
		
		for(int num : a) {
			System.out.println(num);
		}
		
	}

}
