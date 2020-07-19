package LCS;

import java.util.Scanner;
public class LCS_basis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("첫번째 비교 값 : ");
        String a = scan.next();
        System.out.println("두번째 비교 값 : ");
        String b = scan.next();

        int[][] lenArr = new int[a.length() + 1][b.length() + 1];
        for(int i = 0; i < a.length() + 1; i++){
            for(int j = 0; j < b.length() + 1; j++){
                if(i == 0 || j == 0) {
                    lenArr[i][j] = 0;
                }else if(a.toCharArray()[i - 1] == b.toCharArray()[j - 1]) {
                    lenArr[i][j] = lenArr[i-1][j-1] + 1;
                }else{
                    lenArr[i][j] = Math.max(lenArr[i][j - 1], lenArr[i - 1][j]);
                }
            }
        }
        for(int i = 0; i < a.length() + 1; i++){
            for(int j = 0; j < b.length() + 1; j++){
                System.out.print(lenArr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nLCS of " + a + " and " + b + " is " + lenArr[a.length()][b.length()]);
    }
}