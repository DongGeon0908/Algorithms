package LIS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class LIS_basic {
	
	public static int N = 0;	// [1, 300000]
	public static int dp[] = null;
	
	public static int arr[] = null;
	public static int LIS[] = null;
	
	public static int INF = Integer.MAX_VALUE;

	public static void main(String[] args) throws Exception {
		
		System.out.println("수열의 길이는?");
		System.out.println("수열을 입력하세요 : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		LIS = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0 ; i < N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.fill(LIS, INF);
		int len = 1;
		LIS[0] = arr[0];
		for (int i = 1 ; i < N ; i++) {
			
			if (LIS[len - 1] < arr[i]) {
				LIS[len++] = arr[i];
				continue;
			}
			
			int idx = Arrays.binarySearch(LIS, arr[i]);
			if (idx < 0) {
				idx = -(idx + 1);
				LIS[idx] = arr[i];
			} 
		}
		
		bw.write("" + len);
		bw.flush();
		bw.close();

	}
}